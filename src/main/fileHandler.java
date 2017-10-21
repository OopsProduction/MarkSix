package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

// handles all file related functions
public class fileHandler {

	public static final String filename = "./records.csv";
	public static File file = new File(filename);
	private static Scanner sc;
	private static String readLine;
	
	// check if file exist, create one if not
	public static void checkFile(){
		if (!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File [" + filename + "] created!");
		} else {
			//System.out.println("File is ready to be used!");
		}
	}
	
	// read all records in the file
	public static void readAll() throws FileNotFoundException{
		sc = new Scanner(file);
		readLine = "";
		int countRecord = 0;
		
		System.out.println("============================");
		while (sc.hasNextLine()){
			readLine = sc.nextLine();
			System.out.println(readLine);
			countRecord++;
		}
		System.out.println("============================");
		System.out.println("There are total " + countRecord + " records.");
		System.out.println("============================");
	}
	
	// add new record to file
	public static void addRecord(String x) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
		System.out.println("Numbers: " + x + " stored in Database.");
		pw.println(x);
		pw.close();
	}
	
	// search record from file
	public static void searchRecord(String x) throws FileNotFoundException{
		
		ArrayList<String> readLine = new ArrayList<String>();
		Scanner sc_Search = new Scanner(file);
		
		System.out.println("============================");
		System.out.println("Search Result");
		System.out.println("============================");
		
		while (sc_Search.hasNextLine()){
			readLine.add(sc_Search.nextLine());
		}
		
		int countMatch = 0;		
		for (String eachLine : readLine) {
			if (eachLine.contains(x)){
				System.out.println(eachLine);
				countMatch++;
			}
		}
		System.out.println("============================");
		if (countMatch > 0){
			System.out.println(countMatch + " records for date [" + x + "]");
		} else {
			System.out.println("NO record" + " for date [" + x + "]");
		}
		System.out.println("============================");
	}	
}
