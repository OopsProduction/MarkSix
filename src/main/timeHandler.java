package main;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// handles all time and date related functions
public class timeHandler {
	// get current time for elapse time calculation
	public static long getCurrentTime(){
		long timeNow = System.nanoTime();
		return timeNow;
	}
	// get current date and time
	public static String getCurrentDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("-- dd/MM/yyyy HH:mm:ss --");
		Date date = new Date();
		return sdf.format(date);
	}
	
	// calculate elapse time
	public static double calElapseTime(double a, double b){
		double elapseTime = 0;
		elapseTime = (a - b) / 1000000000;
		return elapseTime;
	}
}
