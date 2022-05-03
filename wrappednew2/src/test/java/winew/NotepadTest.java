package winew;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class NotepadTest {

	public static WindowsDriver driver = null;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("deviceName", "WindowsPC");

		driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void runWinAppDriver() throws InterruptedException {
		driver.findElement(By.name("Help")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("About Notepad")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("OK")).click();
		Thread.sleep(3000);

	}

	@AfterMethod
	public void cleanUp() throws MalformedURLException {
		driver.quit();
		setUp();
	}

	@AfterSuite
	public void tearDown() throws MalformedURLException {
		driver.quit();
	}

}
