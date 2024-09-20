package sel.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
	    String thname=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]")).getText();  
		System.out.println("Table heading is "+thname);					

		
		List<WebElement> th=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th")); 
		System.out.println("th size is "+th.size());															                
																																
		List<WebElement> tr=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));  
		System.out.println("tr size is "+tr.size());
		
		
		for(int i=1;i<=th.size();i++)                    
		{
			String value=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();
			System.out.print(value+"    ");
			Thread.sleep(500);
		}
		System.out.println();
		
		for(int i=1;i<=tr.size();i++)   
		{
			for(int j=1;j<=th.size();j++)   
			{
				String value=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText(); 
				System.out.print(value+"        ");
				Thread.sleep(500);
			}
		System.out.println();
		}			
} 
}
