package Test_searchRecord;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ test_formatInputDay.class, test_formatInputMonth.class, test_getSearchDay.class,
		test_getSearchInput.class, test_getSearchMonth.class, test_makeSearchDate.class, test_searchRecord.class })
public class TestSuite_searchRecord {

}
