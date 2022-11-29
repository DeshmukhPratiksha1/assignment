package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException 
	{
		
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://jqueryui.com/slider/");
			
			
			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));//first iframe click find xpath
			                                                  //*[@class='demo-frame']
			driver.switchTo().frame(iframe);
			
			WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));//slider xpath find here
			
			Actions act = new Actions(driver);
			
			act.clickAndHold(slider).moveByOffset(250, 0).release(slider).perform();//move curse forward
			
			Thread.sleep(4000);
			
			act.clickAndHold(slider).moveByOffset(-250, 0).release(slider).perform();//move the curse backward
			
			
	}
}
