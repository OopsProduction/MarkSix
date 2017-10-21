package Test_searchRecord;

import static org.junit.Assert.*;

import org.junit.Test;

import main.searchRecord;

public class test_formatInputDay {

	@Test
	public void test() {
		// test one digit
		String result_oneDigit = searchRecord.formatInputDay(9);
		assertEquals("09", result_oneDigit);
		// test two digits
		String result_twoDigits = searchRecord.formatInputDay(19);
		assertEquals("19", result_twoDigits);
	}

}
