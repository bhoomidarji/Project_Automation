package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Attr 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("bhoomi@24.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("bhoomi@24.com");
		Thread.sleep(2000);

	}	
}
