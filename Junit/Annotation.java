package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotation
{
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("This is before class");
	}
	@Before
	public void before()
	{
		System.out.println("This is before test");
	}
	@Test
	public void test()
	{
		System.out.println("This is Test");
	}
	@After
	public void after()
	{
		System.out.println("This is After test");
	}
	@AfterClass
	public static void afterclass() 
	{
		System.out.println("This is after class");
	}
}
