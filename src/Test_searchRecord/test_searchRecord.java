package Test_searchRecord;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import main.searchRecord;

public class test_searchRecord {

	@Test
	public void test() throws FileNotFoundException {
		searchRecord.searchRecord("21/10");
	}

}
