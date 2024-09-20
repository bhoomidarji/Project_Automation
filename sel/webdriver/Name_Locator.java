package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Bhoomi@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("bhoomi123");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(7000);
		driver.close();
		
	}
}
