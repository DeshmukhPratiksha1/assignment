
package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp 
{
	       public static void main(String[] args) throws InterruptedException {
			
		    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();// maximize the window of the browser
				
			driver.get("https://groww.in/");
			
			driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//span[text()='Login/Register']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@class='rodal-close']")).click();

}
}