package Test_searchRecord;

import static org.junit.Assert.*;

import org.junit.Test;

import main.searchRecord;

public class test_formatInputMonth {

	@Test
	public void test() {
		// test one digit
		String result_oneDigit = searchRecord.formatInputMonth(5);
		assertEquals("05", result_oneDigit);
		// test two digits
		String result_twoDigits = searchRecord.formatInputMonth(11);
		assertEquals("11", result_twoDigits);
	}
}
