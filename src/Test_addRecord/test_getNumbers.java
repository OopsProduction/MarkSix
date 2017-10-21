package Test_addRecord;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import main.addRecord;

public class test_getNumbers {

	@Test
	public void test() throws FileNotFoundException {
		
		String actualResult = addRecord.getNumbers();
		System.out.println(actualResult);
		
		//fail("Not yet implemented");
	}

}
