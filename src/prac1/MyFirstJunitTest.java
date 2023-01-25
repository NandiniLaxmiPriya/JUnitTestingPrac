package prac1;
import pracclass.Calculator;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MyFirstJunitTest {

	@Test
	public void test() {
	//	fail("Not yet implemented");
		Calculator cl = new Calculator();
		int res = cl.add(2, 3);
		assertEquals(5,res,0);
		
		
	}
	
	@Test
	public void test2()
	{
		Calculator cl = new Calculator();
		String ar = cl.initialize();
		assertNull(ar);
		assertTrue(true);
	}
	
	
}
