package implexliwaitassign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeLogOut {
public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(username, "Admin").perform();
		
		act.sendKeys(Keys.TAB).sendKeys("admin123").build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		
		
		
		
		
}
}
