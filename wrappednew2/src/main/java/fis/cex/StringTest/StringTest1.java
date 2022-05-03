/**
 * 
 */
package fis.cex.StringTest;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Inderdeep Sondhi : e3025143
 *
 */
public class StringTest1 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File log = new File("C:\\NewEclipseWorkspace\\EWireAutomation\\eWireInputFile\\eWire202204020713.dat");
		String search = "2022-03-29";
		String replace = "2022-04-02";

		try {
			FileReader fr = new FileReader(log);
			String s;
			String totalStr = "";
			try (BufferedReader br = new BufferedReader(fr)) {

				while ((s = br.readLine()) != null) {
					totalStr += s;
				}
				totalStr = totalStr.replaceAll(search, replace);
				FileWriter fw = new FileWriter(log);
				fw.write(totalStr);
				fw.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("File updated successfully");

		String[] lines = Files.readAllLines(
				new File("C:\\NewEclipseWorkspace\\EWireAutomation\\eWireInputFile\\eWire202204020713.dat").toPath())
				.toArray(new String[0]);

		String[] line0Array = lines[0].split("~");
		System.out.println(line0Array[7]);

	}
}
