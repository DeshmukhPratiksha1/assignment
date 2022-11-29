package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {
	
	 public static void main(String[] args) throws InterruptedException {
			
		    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();// maximize the window of the browser
				
			driver.get("https://zoom.us/signup");
				
			Thread.sleep(2000);
			
			
	    	driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();//incognito mode madhe coocie box handle kelay

			
			WebElement  month = driver.findElement(By.xpath("//*[@id='select-0']"));
			
			month.click();
			
			WebElement june  = driver.findElement(By.xpath("//*[@id='select-item-select-0-5']"));
			
			june.click();
			
			

}
}