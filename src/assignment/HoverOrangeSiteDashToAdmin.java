package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOrangeSiteDashToAdmin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
			
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			
			WebElement dashhover = driver.findElement(By.xpath("//*[@id='menu_dashboard_index']"));
			
			Actions act = new Actions(driver);
			
			act.moveToElement(dashhover).perform();
			
			Thread.sleep(2000);
			
			WebElement adminhover = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
			
			act.moveToElement(adminhover).perform();

			
            WebElement usermaghover = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
            
			act.moveToElement(usermaghover).perform();

             WebElement userhover = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
			
             userhover.click();
			
			
			
			
			
			
	}
}
