package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium 
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();// maximize the window of the browser
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
	
	username.sendKeys("Admin");
	
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//*[@name='Submit']")).click();
	
	driver.findElement(By.xpath("//*[@class='main-menu-first-level-list-item'][1]")).click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
//	//to Scroll in Downword direction
//	
//	js.executeScript("window.scrollBy(0,1000)");
//	
	 Thread.sleep(3000);
//	
//	//to scroll in upward direction
//	
//	js.executeScript("window.scrollBy(0,-500)");
//	
//	//to perform scroll over webelement
	
	WebElement chekbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_58']"));
	
	js.executeScript("arguments[0].scrollIntoView();", chekbox);
	

}
}