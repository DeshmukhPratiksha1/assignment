package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusMethod {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		username.sendKeys("Admin");
		
		//xpath
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//*[contains(@id,'menu_admin_viewAdminModule')]")).click();
		
		// isEnabled()- returns true if element is enable to perform the operation

		/*WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_18']"));
		
		boolean enabl = checkbox.isEnabled();
		System.out.println(enabl);//true
		
//		isSelected - returns true if element is selected
		
		boolean issel = checkbox.isSelected();
		System.out.println(issel);//false
		
		checkbox.click();
		
		boolean afterwardsel = checkbox.isSelected();
		System.out.println(afterwardsel);//true
		
//		isDisplayed()- This returns true if element is display over the webpage

		WebElement hiddenelem = driver.findElement(By.xpath("(//*[@type='hidden'])[1]"));
		
		boolean hidde = hiddenelem.isDisplayed();
		System.out.println(hidde);//false*/
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebElement isdisable = driver.findElement(By.xpath("//*[@id='disable']"));
		
		boolean displ = isdisable.isEnabled();
		System.out.println(displ);//false
		
		
		
		}

}
