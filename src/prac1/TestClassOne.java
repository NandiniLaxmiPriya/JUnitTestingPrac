package prac1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClassOne {

	int a;
	int b;
	int c;
	@BeforeEach
	public void initialize()
	{
		a=15;
		b=6;
	}
	@Test
	void test1() {
		c=a-b;
		int expect = 9;
		System.out.println("The expected value is "+expect+" The actual value after subtraction is "+c);
		assertEquals(expect,c,"actual and expected are same");
	}
	@Test
	void test2() {
		c=a-b;
		int expect = 10;
		System.out.println("The expected value is "+expect+" The actual value after subtraction is "+c);
		assertEquals(expect,c,"actual and expected are not same for subtraction");
	}
	@Test
	
	void test3() {
		System.out.println("The test failed");
		fail("This test will fail no matter what");
		
	}
	@AfterEach
	public void print()
	{
		System.out.println("----------------------------------------------------------------------");
	}

}
