package Test_searchRecord;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Test;

import main.searchRecord;

public class test_getSearchInput {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws FileNotFoundException {
		searchRecord.getSearchInput();
		
	}

}
