package Test_searchRecord;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import main.searchRecord;

public class test_getSearchDay {

	@Test
	public void test() {
		
		int testData_01 = 31;
		System.out.println("Enter " + testData_01 + " as test data");
		
		int actualResult = searchRecord.getSearchMonth();
		assertEquals(testData_01, actualResult);
	}

}
