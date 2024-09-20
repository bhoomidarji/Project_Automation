package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bhumi");  
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onkeyup=\"validatepassword();\"]")).sendKeys("abcd23");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(@type,'LOGIN')]")).click();
		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//*[@type='submit' or @value='RESET']")).click();
		Thread.sleep(2000);
	
		driver.close();
	}
}
