package Test_addRecord;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import main.addRecord;

public class test_addToDB {

	private static File file;

	@Test
	public void test() throws FileNotFoundException {
		// define file
		file = new File("./records.csv");
		
		// create Test Data
		String testData = "1 2 3 4 5 6 ";
		
		// pass Test Data to function under test
		addRecord.addToDB(testData);
		
		// verify result in file
		verifyFile(testData);
	}

	public static void verifyFile(String toCheck) throws FileNotFoundException{
		
		// verify result
		Boolean matched = false;
		Scanner sc = new Scanner(file);
		ArrayList<String> readLine = new ArrayList<String>();
		
		// read records from file
		while (sc.hasNextLine()){
			readLine.add(sc.nextLine());
		}
		// search and verify result on file
		for (String x : readLine) {
			if (x.contains(toCheck)){
				matched = true;
				System.out.println(x + " <<< Test Record Matched");
				break;
			}
		}

		// generate error message if result fails
		if (matched==false){
			assertFalse(true);
			fail("Test Failed!");
		} else {
			assertFalse(false);
		}
	}
}
