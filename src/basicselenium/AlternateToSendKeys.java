package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternateToSendKeys {
	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();// maximize the window of the browser
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].value='alternate to sendkeys';",username);
	
	

}
}
