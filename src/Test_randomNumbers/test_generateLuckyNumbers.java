package Test_randomNumbers;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Test;

import main.randomNumbers;

public class test_generateLuckyNumbers {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws FileNotFoundException {
		randomNumbers.generateLuckyNumbers();
	}

}
