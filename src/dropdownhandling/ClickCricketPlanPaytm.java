package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCricketPlanPaytm {
	
	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://paytm.com/recharge");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@class='_3QlS']//input[@maxlength='10'])")).sendKeys("9158539453");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='_3H1N']//div[5]")).click();
		


	}

}
