package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class randomNumbers {
	
	private static ArrayList<Integer> ranNum;

	public static void generateLuckyNumbers() throws FileNotFoundException{
		
		String addToRecord = "";
		ranNum = new ArrayList<Integer>();
		
		// generate 6 random numbers
		for (int i=0; i<6; i++){
			ranNum.add(genNum());	
		}
		Collections.sort(ranNum); 
		
		// check for duplicated number
		checkDuplicate();

		// format final result to record
		Collections.sort(ranNum);
		addToRecord = "";
		for (Integer x : ranNum) {  // sort numbers
			addToRecord = addToRecord + x + " ";
		}
		
		// pass lucky numbers string to addRecord.addToDB
		addRecord.addToDB(addToRecord);
	}
	
	// generate random number
	public static int genNum(){
		int x = 0;
		int maxNumber = 48;
		Random random = new Random();	
		// check for zero
		x = random.nextInt(maxNumber);
		while (x == 0) {
			x = random.nextInt(maxNumber);
		}
		return x;
	}

	// check for duplicated number
	public static void checkDuplicate(){
		if (ranNum.get(5) == ranNum.get(4)){
			int replace = genNum();
			ranNum.set(5, replace);
		}
		if (ranNum.get(4) == ranNum.get(3)){
			int replace = genNum();
			ranNum.set(4, replace);
		}
		if (ranNum.get(3) == ranNum.get(2)){
			int replace = genNum();
			ranNum.set(3, replace);
		}
		if (ranNum.get(2) == ranNum.get(1)){
			int replace = genNum();
			ranNum.set(2, replace);
		}
		if (ranNum.get(1) == ranNum.get(0)){
			int replace = genNum();
			ranNum.set(1, replace);
		}		
	}
}
