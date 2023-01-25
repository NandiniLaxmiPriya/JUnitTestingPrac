package prac1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestClassTwo {

	int a;
	int b;
	int c;
	@BeforeEach
	public void initialize()
	{
		a=5;
		b=6;
	}
	@Test
	void test1() {
		c=a+b;
		int expect = 11;
		System.out.println("The expected value is "+expect+" The actual value after addition is "+c);
		assertEquals(expect,c,"actual and expected are same for Addition");
	}
	@Test
	void test2() {
		c=a+b;
		int expect = 10;
		System.out.println("The expected value is "+expect+" The actual value after addition is "+c);
		assertEquals(expect,c,"actual and expected are not same for Addition");
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
