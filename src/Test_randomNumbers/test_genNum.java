package Test_randomNumbers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import main.randomNumbers;

public class test_genNum {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int actualResult = randomNumbers.genNum();
		if ((actualResult > 0) && (actualResult < 48)){
			System.out.println(actualResult);
			assertFalse("Passed: Random number generated correctly!", false);
		} else {
			assertFalse("Failed: Random number generated is out of range!", true);
		}
	}

}
