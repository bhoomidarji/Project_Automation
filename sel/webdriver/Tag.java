package sel.webdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		List<WebElement> a=driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> i1=a.iterator();
		while(i1.hasNext())
		{
			WebElement e=i1.next();
			System.out.println(e.getText());
			if(e.getText().equals("Demo site"))
			{
				System.out.println(e.getText());
			}
			else
			{
				break;
			}
		}
		Thread.sleep(2000);
		driver.close();
	}
}
