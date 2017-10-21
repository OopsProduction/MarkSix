package main;

import java.io.FileNotFoundException;

public class readRecord {

	// handles read record function
	public static void readAllRecords() throws FileNotFoundException{
		// check file existence
		fileHandler.checkFile();
		// display all records
		fileHandler.readAll();
	}
}
