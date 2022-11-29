package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//xpath
		
	    WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	    
	    username.sendKeys("Admin");
	    
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin1232");//wrong pass pass bcz i want loginpanel text print
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    //contains()
	    
	   // driver.get("https://www.facebook.com/signup");
	    
	   // driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).sendKeys("pratika");
	    
	    //text
	    
	  WebElement text = driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));
	 
	  String textonweb = text.getText();
	    
      System.out.println(textonweb);	  
	
	
		
		
	}

}

