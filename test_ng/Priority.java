package test_ng;

import org.testng.annotations.Test;

public class Priority
{

	@Test(priority = 2)
	public void Aest()
	{
		System.out.println("This is main Aest..");
	}
	@Test (priority = 0)  
	public void Rest()
	{
		System.out.println("This is main Rest..");
	}
	@Test (priority = 3)
	public void zest()
	{
		System.out.println("This is main zest..");
	}
	@Test (priority = 1)
	public void test()
	{
		System.out.println("This is main test..");
	}
}
