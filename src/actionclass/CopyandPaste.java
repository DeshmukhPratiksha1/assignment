package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyandPaste 
{
	  public static void main(String[] args) throws InterruptedException 
	  {
			
		    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();// maximize the window of the browser
				
			driver.get("https://www.facebook.com/signup");
			
			WebElement fname = driver.findElement(By.xpath("//*[@name='firstname']"));
			
			fname.sendKeys("pratiksha");
					
			Actions act = new Actions(driver);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			
			act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			
			
				
	  }
}
