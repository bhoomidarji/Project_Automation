package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		
		
		Select s1=new Select(driver.findElement(By.name("country")));     
		 
		s1.selectByIndex(1);
		Thread.sleep(2000);
		s1.selectByValue("ANGOLA");
		Thread.sleep(2000);
		s1.selectByVisibleText("INDIA"); 
		Thread.sleep(2000);
		

			for(int i=0;i<50;i++)
			{
				s1.selectByIndex(i);
				Thread.sleep(2000);
			}
		driver.close();
	}
}
