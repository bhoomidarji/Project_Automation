package test_ng;

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Status 
{
	@Test
	public void passtest()
	{
		System.out.println("This is passTest..");
	}
	@Test
	public void failtest()
	{
		System.out.println("This is failTest..");
		fail("self failed");
	}
	@Test
	public void skippedtest()
	{
		System.out.println("This is skippedTest..");
		throw new SkipException("self skipped");
	}

}
