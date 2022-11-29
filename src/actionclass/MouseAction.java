package actionclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			
			WebElement hoverpoint = driver.findElement(By.xpath("//*[@id='sub-menu']"));//hover click find xpath
			
			Actions act = new Actions(driver);
			
			//act.moveToElement(hoverpoint).perform();
			
			//driver.findElement(By.xpath("//*[@id='link2']")).click();//sub element xpath find
			
			// double click
			
			WebElement doubleclick = driver.findElement(By.xpath("//*[@id='double-click']"));
			
			act.doubleClick(doubleclick).perform();
			
			driver.switchTo().alert().accept();
			
			WebElement UploadClick = driver.findElement(By.xpath("//*[@name='upload']"));//here we perform webbase site
			
			act.contextClick(UploadClick).perform();
			
			Robot rbt = new Robot();//HERE WE ACTION windows RELATED HANDLE
			
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyPress(KeyEvent.VK_ENTER);
			
					}
}
