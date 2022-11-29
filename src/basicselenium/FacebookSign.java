package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSign {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_j_')]")).sendKeys("pratiksha");//fname text box 
		
		driver.findElement(By.xpath("//*[@value='2'][1]")).click();//date of birth day is enter
		

		
		
	}

}
