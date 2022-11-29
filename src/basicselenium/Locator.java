package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//id locator
		
	WebElement username = driver.findElement(By.id("txtUsername"));

		username.sendKeys("pratiksha");
		
		//name locator
		
		WebElement passval = driver.findElement(By.name("txtPassword"));
		
		passval.sendKeys("pra@123");
		
		
		//class locator
		
	WebElement subval = driver.findElement(By.className("button"));
	
	subval.click();
		
	
	
    //linkText locator

    //WebElement forgotlink = driver.findElement(By.linkText("Forgot your password?"));
//
    //forgotlink.click();


    //partialLinkText locator

   WebElement forgotlink2 = driver.findElement(By.partialLinkText("Orange"));


   forgotlink2.click();
   
   
   // tagname

    WebElement username1 = driver.findElement(By.tagName("input"));
		
		
	}

}
