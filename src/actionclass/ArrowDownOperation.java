
package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrowDownOperation 
{
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
			
			Thread.sleep(3000);
			
			Actions act = new Actions(driver);
			
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();	

}
}