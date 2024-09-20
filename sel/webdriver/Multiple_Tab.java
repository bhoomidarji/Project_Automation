package sel.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Tab
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);

		String mainw=driver.getWindowHandle();
		System.out.println("mainw is"+mainw);
		 
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);

		Set<String> allw=driver.getWindowHandles();
		Iterator<String> i1=allw.iterator();
		while(i1.hasNext())
		{
			String childw=i1.next();
			System.out.println("allwindow is "+childw);
			if(!mainw.equals(childw))
			{
				driver.switchTo().window(childw);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("bhoomi@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(mainw);
		Thread.sleep(2000);
		System.out.println("main title is "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
}
}
