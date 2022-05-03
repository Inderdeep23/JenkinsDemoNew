/**
 * 
 */
package fis.cex.DateTest;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

/**
 * @author Inderdeep Sondhi : e3025143
 *
 */
public class Date1 {

	public static String todayDate = getCurrentDatenTimeWithTimeZone("yyyyMMddHHmm", "CST");
	public static String monthlyDate = getCurrentDatenTimeWithTimeZone("MM/yyyy", "CST");

	public static String getCurrentDatenTimeWithTimeZone(String format, String TimeZone) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(TimeZone));
		return sdf.format(cal.getTime());
	}

	public static String getCurrentDateEnTimeInCST(String format, String timeZone) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));
		return sdf.format(cal.getTime());

	}

	public static String getCurrentTimeInCST(String format, String timeZone) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));
		return sdf.format(cal.getTime());

	}

	public static String getCurrentTimeInCSTMinus1Minute() {
		return LocalTime.now().toString();
	}

	public static String getCurrentTimeInCSTMinus5Minute(String format, String timeZone) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));
		cal.add(Calendar.MINUTE, -5);
		return sdf.format(cal.getTime());

	}

	public static String getCurrentTimeInCSTPlus5Minute(String format, String timeZone) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));
		cal.add(Calendar.MINUTE, 5);
		return sdf.format(cal.getTime());

	}

	public static String getCurrTimePlus2Minutes(String format, String timeZone) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));
		cal.add(Calendar.MINUTE, 2);
		return sdf.format(cal.getTime());

	}

	public static String getCurrentDateWithTimeZone(String format, String TimeZone) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(TimeZone));
		return sdf.format(new Date());
	}

	public static String getTimePlusVariableMins(String format, String TimeZone, int timeToAdd) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(TimeZone));
		cal.add(Calendar.MINUTE, timeToAdd);
		return sdf.format(cal.getTime());
	}

	public static String getCurrentDatenTimeWithTimeZonePlusVariableMins(String format, String TimeZone,
			int timeToAdd) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(TimeZone));
		cal.add(Calendar.MINUTE, timeToAdd);
		return sdf.format(cal.getTime());
	}

	public static String getCurrentDateTimePlusExtraMins(String format, String TimeZone, int minsToAdd) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(TimeZone));
		cal.add(Calendar.MINUTE, minsToAdd);
		return sdf.format(cal.getTime());
	}

	public static String getCurrentDatenTimeWithTimeZoneMinus1Day(String format, String TimeZone) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(TimeZone));
		cal.add(Calendar.DATE, -1);
		return sdf.format(cal.getTime());
	}

	public static String getCurrentDatenTimeWithTimeZoneMinus3Days(String format, String TimeZone) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(java.util.TimeZone.getTimeZone(TimeZone));
		cal.add(Calendar.DATE, -3);
		return sdf.format(cal.getTime());
	}

	public static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static String getCurrentDayofWeek() {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("US/Central"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH);
		return dtf.format(zdt);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(todayDate);

	}

}
