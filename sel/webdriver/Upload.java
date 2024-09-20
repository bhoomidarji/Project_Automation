package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\N B DARJI\\Desktop\\gitbash.txt");  
		Thread.sleep(2000);
		driver.findElement(By.name("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type=\"button\"]")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
