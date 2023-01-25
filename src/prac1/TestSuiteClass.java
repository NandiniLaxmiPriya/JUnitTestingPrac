package prac1;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({AnnoTest.class,ExceptionTest.class,MyFirstJunitTest.class})
public class TestSuiteClass {

	
	
}
