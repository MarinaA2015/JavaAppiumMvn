package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ArticlesTests;
import tests.SearchTests;

/**
 * Created by Inka on 23-Aug-18.
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        ArticlesTests.class,
        SearchTests.class
})
public class TestSuite {
}
