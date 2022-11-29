package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropJqerySite 
{
	public static void main(String[] args) throws InterruptedException {
	
	
	   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://jqueryui.com/slider/");
				
				WebElement dropableclick = driver.findElement(By.xpath("//*[text()='Droppable']"));//clicl dropable
				
				dropableclick.click();
				
                WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));//xpath of iframe 
				
				driver.switchTo().frame(iframe);
				
				WebElement dragclick = driver.findElement(By.xpath("//*[@id='draggable']"));
				
				Thread.sleep(3000);
				
				WebElement dropclick = driver.findElement(By.xpath("//*[@id='droppable']"));
				
				Actions act = new Actions(driver);
				
				act.clickAndHold(dragclick).dragAndDrop(dragclick, dropclick).release().build().perform();
				

				
				
				
				
}

}
