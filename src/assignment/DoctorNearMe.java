package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoctorNearMe 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			WebElement sendkey = driver.findElement(By.xpath("//*[@name='q']"));
			
			sendkey.sendKeys("doctor near me");

			
			Actions act = new Actions(driver);
			
			act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			
			driver.findElement(By.xpath("//*[@class='wUrVib OSrXXb']")).click();
			
			driver.findElement(By.xpath("//*[@id='tsuid9']")).click();

			
			
	}
}
