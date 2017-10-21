package main;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class searchRecord {

	// get user input Date
	public static void getSearchInput() throws FileNotFoundException{
		// define variables
		int searchDay = 0;
		int searchMonth = 0;
		String finalSearchDay = "";
		String finalSearchMonth = "";
		String finalSearchDate = "";
		
		// get user input Day
		searchDay = getSearchDay();
		while ((searchDay>31) || (searchDay < 1)){
			searchDay = getSearchDay();
			if ((searchDay < 32) && (searchDay > 0)){
				break;
			}
		}
		
		// get user input Month
		searchMonth = getSearchMonth();
		while ((searchMonth>12) || (searchMonth < 1)){
			searchMonth = getSearchMonth();
			if ((searchMonth < 13) && (searchMonth > 0)){
				break;
			}
		}
		
		// format Search Day
		finalSearchDay = formatInputDay(searchDay);
		// format Search Month
		finalSearchMonth = formatInputMonth(searchMonth);
		// format Search Date
		finalSearchDate = makeSearchDate(finalSearchDay, finalSearchMonth);
		// pass Search Date to Search Function
		searchRecord(finalSearchDate);
	}
	
	// pass Search Date to Search Function
	public static void searchRecord(String toSearch) throws FileNotFoundException {
		fileHandler.searchRecord(toSearch);
	}
	
	// get user input Day
	public static int getSearchDay(){
		Scanner sc_Day = new Scanner(System.in);
		int searchDayInput = 0;
		System.out.println("Enter Day: ");
		while (sc_Day.hasNext()){			
			if (sc_Day.hasNextInt()){
				searchDayInput = sc_Day.nextInt();
				break;
			} else {
				System.out.print("Enter correct Day!" + sc_Day.next());
			}			
		}
		return searchDayInput;
	}
	
	// get user input Month
	public static int getSearchMonth(){
		Scanner sc_Month = new Scanner(System.in);
		int searchMonthInput = 0;
		System.out.println("Enter Month: ");
		while (sc_Month.hasNext()){			
			if (sc_Month.hasNextInt()){
				searchMonthInput = sc_Month.nextInt();
				break;
			} else {
				System.out.print("Enter correct Month!" + sc_Month.next());
			}			
		}
		return searchMonthInput;
	}
	
	// format Search Day
	public static String formatInputDay(int dayToFormat){
		if (dayToFormat < 10){
			return "0" + dayToFormat;
		} else {
			return "" + dayToFormat;
		}
	}
	
	// format Search Month
	public static String formatInputMonth(int monthToFormat){
		if (monthToFormat < 10){
			return "0" + monthToFormat;
		} else {
			return "" + monthToFormat;
		}
	}
	
	// format Search Date
	public static String makeSearchDate(String searchDay, String searchMonth){
		return searchDay + "/" + searchMonth;
	}
}
