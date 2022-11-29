package actionclass;

//ANOTHER WAY TO SENDKEY() METHOD ENTER VALUE

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions 
{
	       public static void main(String[] args) throws InterruptedException {
			
		    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();// maximize the window of the browser
				
			driver.get("https://www.facebook.com/signup");
				
            WebElement firsname = driver.findElement(By.xpath("//*[@name='firstname']"));
            
            Actions act = new Actions(driver);//create Action Class
            
            act.sendKeys(firsname, "pratiksha").perform();
            
            act.sendKeys(" anil").perform();// this will type where the cursor is present
            
            
            //	performing tab operation by pressing tab key through code
            
            
            act.sendKeys(Keys.TAB).sendKeys("deshmukh").build().perform();
            
            act.sendKeys(Keys.TAB).sendKeys("9158539453").build().perform();
            
            

			
			

}
}