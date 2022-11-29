package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OddCheckClickOrangeHR 
{
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		WebElement usersend = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		usersend.sendKeys("Admin");
		
		WebElement passsend = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		passsend.sendKeys("admin123");
		
		WebElement logclick = driver.findElement(By.xpath("//*[@id='btnLogin']"));
		logclick.click();
		
		WebElement adminclick = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));

		adminclick.click();
		Thread.sleep(3000);
		
		//1st way to find out  findelement
					
		/*for(int i=1; i<=35; i++)
		{
           if(i%2!=0)
			{
				
				 driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
			}	
		}*/
		
		//2nd way finding dynamic way using findElements List<WebElement> for each loop
		
		
	    List<WebElement> allcheck = driver.findElements(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])"));

		
		/*for(WebElement allch:allcheck)
		{
			int value = allcheck.indexOf(allch);
			
			if(value%2!=0)
			{
				allch.click();
			}
			
		}*/
		
		//2nd way finding dynamic way using findElements List<WebElement> for loop
	    
	    
	   int length = allcheck.size();
	   
	   for(int i=1; i<=length; i++)
	   {
		   if(i%2==0)
		   {
			   allcheck.get(i).click();
		   }
		   
	   }
	    		
}
}