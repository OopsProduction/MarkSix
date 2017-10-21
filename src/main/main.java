package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

	private static Scanner sc;
	private static Scanner waitEnter;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		int userSelection = 0;
		sc = new Scanner(System.in);
		
		// show and get user option
		while (userSelection != 5){

			// display Option Menu
			loadMainMenu();
			
			// get user option
			while (sc.hasNext()){
				if (sc.hasNextInt()){
					userSelection = sc.nextInt();
					break;
				} else {
					System.out.println("Enter Valid Option(1-5): " + sc.next());
				}
			}
			
			// load function according to user selection
			switch (userSelection) {
			case 1:
				readRecord.readAllRecords();
				waitEnter();
				clearConsole();
				break;
			case 2:
				String addNumber = addRecord.getNumbers();
				String timeStamp = timeHandler.getCurrentDate().substring(3, 8);
				fileHandler.addRecord(addNumber + "[" + timeStamp + "]");
				waitEnter();
				clearConsole();
				break;
			case 3:
				double startTime = timeHandler.getCurrentTime();
				searchRecord.getSearchInput();
				double endTime = timeHandler.getCurrentTime();
				
				// get elapse time
				double elapseTime = timeHandler.calElapseTime(endTime, startTime);
				String elapseTimeResult = formatElapseTime(elapseTime);
				System.out.println("Time used " + elapseTimeResult + " seconds");
				System.out.println("==========================");
				waitEnter();
				clearConsole();
				break;
			case 4:
				randomNumbers.generateLuckyNumbers();
				waitEnter();
				clearConsole();
				break;
			case 5:
				System.out.println("Exit Application...");
				break;
			default:
				System.out.println("Invalid Option! Enter again!");
				break;
			}
		}
	}
	
	// display Main Menu to user
	public static void loadMainMenu(){
		String todayIs = timeHandler.getCurrentDate();
		
		System.out.println();
		System.out.println("==========================");
		System.out.println(todayIs);
		System.out.println("==========================");
		System.out.println("Option 1 - Read Record");
		System.out.println("Option 2 - Add Records");
		System.out.println("Option 3 - Search Record");
		System.out.println("Option 4 - Lucky Numbers");
		System.out.println("Option 5 - Exit");
		System.out.println("==========================");
		System.out.print("Enter Option: ");
	}

	// wait for user's action to continue
	public static void waitEnter(){
		waitEnter = new Scanner(System.in);
		System.out.println("Press Enter Key to continue...");
		String x = waitEnter.nextLine();
	}

	// format the elapse time
	public static String formatElapseTime(double toFormat){
		DecimalFormat df = new DecimalFormat("###.###");
		return df.format(toFormat);
	}
	
	// clear console screen
	public final static void clearConsole() throws InterruptedException, IOException
	{
	    // clear console	    
		if (System.getProperty("os.name").toLowerCase().contains("windows")){
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		//} else if (System.getProperty("os.name").toLowerCase().contains("mac")){
			//Runtime.getRuntime().exec("clear");
		} else {	
			for (int i = 0; i < 300; i++) {
				System.out.println();
			}
		}
	}
}
