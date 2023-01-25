package prac1;
import pracclass.Assertionss;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

class AssertionsTest {

	@Test
	void test() {
		Assertionss asr = new Assertionss();
		int a[] = asr.add(5);
		int b[] = {0,1,2,3,4};
		assertArrayEquals(b,a);
	}
	@Test
	void test2()
	{
		String actual="a";
		assertNotNull(actual);
	}
	@Test
	void test3()
	{
		String actual="aab";
		String expected="aa";
		assertNotSame(expected,actual);
	}
	@Test
	void test4()
	{
		//fail("fail always");
	}
	@Test
	void test5()
	{
		assertThat("abcd",CoreMatchers.is("abcd"));
		
	}
}
