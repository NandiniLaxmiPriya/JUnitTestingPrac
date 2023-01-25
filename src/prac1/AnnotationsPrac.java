package prac1;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class AnnotationsPrac {

	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("BeforeClass executed only once");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("-hahah--------------------");
	}

	@Test
	public void test() {
		System.out.println("In test 1");
		fail("failed");
	}
	
	@After
	public void afterMethod() {
		System.out.println("----hahhah-----------------");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("AfterClass executed only once");
	}
}
