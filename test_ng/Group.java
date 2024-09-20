package test_ng;

import org.testng.annotations.Test;

public class Group
{

	@Test (groups = {"red"} , priority = 1)
	public void red1()
	{
		System.out.println("This is red1..");
	}
	@Test (groups = {"red"})
	public void red2()
	{
		System.out.println("This is red2..");
	}
	@Test (groups = {"red"})
	public void red3()
	{
		System.out.println("This is red3..");
	}
	@Test (groups = {"red","green"})
	public void red_green1()
	{
		System.out.println("This is red_green..");
	}
	@Test (groups = {"green"})
	public void green2()
	{
		System.out.println("This is green2..");
	}
	@Test (groups = {"green"})
	public void green3()
	{
		System.out.println("This is green3..");
	}
}
