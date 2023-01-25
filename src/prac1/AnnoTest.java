package prac1;


import static org.junit.Assert.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class AnnoTest {

	@BeforeAll
	public static void beforeClass()
	{
		System.out.println("BeforeClass executed only once");
	}
	
	@BeforeEach
	public void beforeMethod() {
		System.out.println("---------------------");
	}
	

	@Test
	public void test() {
		System.out.println("In test 1");
		//fail("failed");
	}
	@Test

	public void test2() {
		System.out.println("In test 2");
		//fail("failed");
	}
	
	@AfterEach
	public void afterMethod() {
		System.out.println("---------------------");
	}
	@AfterAll
	public static void afterClass()
	{
		System.out.println("AfterClass executed only once");
	}
}
