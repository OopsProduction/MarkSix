package Test_searchRecord;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import main.searchRecord;

public class test_makeSearchDate {

	@Test
	public void test() {
		String actualResult = searchRecord.makeSearchDate("31", "08");
		assertEquals("31/08", actualResult);
	}

}
