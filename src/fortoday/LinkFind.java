package fortoday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkFind {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/links");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		System.out.println(links.size());
		
	}
}
//"G:\selenium\chromedriver\chromedr6iver.exe"