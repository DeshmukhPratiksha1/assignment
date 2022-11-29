package basicselenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.SceenShot;

public class FacebookScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		
	    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();// maximize the window of the browser
			
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//*[contains(@id,'u_0_j_')]")).sendKeys("pratiksha");
		
		SceenShot.captureScreenShot(driver,"scr1");

		

}
}