package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(2000);
		
		Select s1=new Select(driver.findElement(By.id("fruits")));
		s1.selectByIndex(0);
		Thread.sleep(2000);
		s1.selectByValue("apple");
		Thread.sleep(2000);
		s1.selectByVisibleText("Grape");
		Thread.sleep(2000);
			
		for(int i=0;i<4;i++)
		{
				s1.selectByIndex(i); 
				Thread.sleep(2000);
		}
		
		
		for(int i=0;i<4;i++)
		{
				s1.deselectByIndex(i);  
				Thread.sleep(2000);	
		}
		

		for(int i=0;i<4;i++)
		{
			if(i==2)
			{
				continue;    
			}
			else
			{
				s1.selectByIndex(i);
				Thread.sleep(2000);
			}
		}
		driver.close();	
	}
}
