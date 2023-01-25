package prac1;
import pracclass.ExceptionsClass;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ExceptionTest {

	@Test
	void test() throws ArithmeticException{
		//fail("Not yet implemented");
		ExceptionsClass exc = new ExceptionsClass();
	//	exc.divide(10, 0);
		assertThrows(ArithmeticException.class,()->{exc.divide(10,0);});
	}
	
	@Test
	@Disabled
	void test2() throws NullPointerException{
		ExceptionsClass exc = new ExceptionsClass();
		assertThrows(NullPointerException.class,()->{exc.call(null);});
	}
}
