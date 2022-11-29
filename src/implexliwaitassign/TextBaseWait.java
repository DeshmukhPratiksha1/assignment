package implexliwaitassign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBaseWait {
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			
			driver.findElement(By.xpath("//*[@id='populate-text']")).click();
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='h2']"),"Selenium Webdriver"));
			
			driver.findElement(By.xpath("//*[@id='populate-text']")).click();

			
			
			
			
	}
}
