package Test_searchRecord;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import main.searchRecord;

public class test_getSearchMonth {

	@Test
	public void test() {
		
		int testData01 = 5;
		System.out.println("Enter " + testData01 + " as test data");
		
		int actualResult = searchRecord.getSearchMonth();
		assertEquals(testData01, actualResult);
		
	}

}
