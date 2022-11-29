package waitdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));//search box xpath
			
			Actions act = new Actions(driver);
			
			act.click(searchbox).sendKeys("india").sendKeys(Keys.ENTER).build().perform();
			
			driver.findElement(By.xpath("//*[text()='Central Bank of India']")).click();
	}
}
