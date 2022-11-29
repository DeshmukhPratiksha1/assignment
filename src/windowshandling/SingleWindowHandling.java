package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowHandling {

public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dash"
				+ "board");
		
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		String parentwinid = driver.getWindowHandle();//this method use only parent id
		
		System.out.println(parentwinid);
		
		link.click();
		
		Set<String> allwindowid = driver.getWindowHandles();//this method is all type id child also
		
		for(String winid:allwindowid)
			
			
		{
			if(!(parentwinid.equals(winid)))//not equla paret id then they are switvh child id means winid
			{
				driver.switchTo().window(winid);//switching from prnt to child
				
				driver.findElement(By.xpath("//*[text()='Book a Free Demo']")).click();
				
				driver.get("https://www.google.com/");
				
            //  driver.close();// to close current windows
				
			//	driver.quit();
				
				
			}
			System.out.println(winid);
			
			driver.switchTo().window(parentwinid);
			
			
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		}
		
}
}

