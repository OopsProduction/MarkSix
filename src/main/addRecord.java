package main;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class addRecord {

	public static String getNumbers() throws FileNotFoundException{
		int[] inputNum = new int[6];
		Scanner sc = new Scanner(System.in);
		
		// get numbers from user
		for (int i=0; i<6; i++){
			// check for input is from 1 to 47
			do {
				System.out.println("Enter Number " + (i+1) + " (range from 1 to 47)");
				while (sc.hasNextLine()){
					if (sc.hasNextInt()){
						inputNum[i] = sc.nextInt();
						break;
					} else {
						System.out.println("Enter correct integer! \nEnter Number " + (i+1) + " again." + sc.next());
					}
				} 
			} while ((inputNum[i]<1) || (inputNum[i]>47));	
		}
		
		Arrays.sort(inputNum);

		// make input numbers into String
		String inputAdd = "";
		for (int z : inputNum) {
			inputAdd = inputAdd + z + " ";
		}
		return inputAdd;
	}
	
	// add new record to database
	public static void addToDB(String luckyNumbers) throws FileNotFoundException{
		String todayIs = timeHandler.getCurrentDate().substring(3, 8);
		String finalResult = luckyNumbers + "[" + todayIs + "]";	
		
		// pass lucky numbers string to addRecord.addToDB
		fileHandler.addRecord(finalResult);
	}
}
