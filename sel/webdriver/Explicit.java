package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html\r\n"	+ "");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait w1=new WebDriverWait(driver, 20);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='webdriver']")));
		
		Thread.sleep(2000);
		driver.close();		
	}
}
