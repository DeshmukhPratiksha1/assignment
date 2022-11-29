package assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleAutoSearch 
{

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));//search box xpath
			
			Actions act = new Actions(driver);
			
			act.click(searchbox).sendKeys("selenium").build().perform();
			
			Thread.sleep(2000);
			
			List<WebElement> searchrsult = driver.findElements(By.xpath("//*[@jsname='bw4e9b']//span[text()='selenium']"));//enter selenium download word xpath find traversing
			
			Thread.sleep(3000);
			
			
			for(WebElement searchrsults:searchrsult)
			{
				String search = searchrsults.getText();
				System.out.println(search);
			if(search.contains("selenium download"))//OR if(search.equals("selenium download"))

		    {
				searchrsults.click();
				break;
					
			}
				
			}
	}	

}
