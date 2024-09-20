package test_ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Annotation
{
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("This is before suit..");
	}
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("This is after suit..");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is before test..");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is after test..");
	}
	@BeforeClass   
	public void beforeclass()
	{
		System.out.println("This is before class..");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after class..");
	}
	@BeforeMethod    
	public void beforemethod()
	{
		System.out.println("This is before method..");   
	}													
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is after method..");
	}
	@Test
	public void test()
	{
		System.out.println("This is main test..");
	}
	@Ignore            
	@Test
	public void test1()
	{
		System.out.println("This is main test1..");
	}

}
