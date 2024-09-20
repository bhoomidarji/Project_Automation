package sel.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.google.com/");    
		Thread.sleep(3000);
		
		System.out.println("Title is.."+driver.getTitle());
		System.out.println("Current url is.."+driver.getCurrentUrl());
		
		//driver.close(); 
		driver.quit();       	
	}
}
