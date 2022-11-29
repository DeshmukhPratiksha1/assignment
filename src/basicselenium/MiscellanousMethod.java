package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscellanousMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement us = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		us.sendKeys("Admin");
		
		String val = us.getAttribute("value");
		System.out.println(val);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
	}
}
