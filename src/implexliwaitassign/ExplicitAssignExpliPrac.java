package implexliwaitassign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitAssignExpliPrac {
	
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			
			driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
			
			WebElement hiddenbutton = driver.findElement(By.xpath("//*[@id='hidden']"));
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			
			wait.until(ExpectedConditions.visibilityOf(hiddenbutton));
			
			driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
			
			//handling alert with pop up explicit wait
			
			driver.findElement(By.xpath("//*[@id='alert']")).click();
			
			wait.until(ExpectedConditions.alertIsPresent());
			
			driver.switchTo().alert().accept();
	}
}
