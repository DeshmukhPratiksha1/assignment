package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandlingusingFindElements {
	
	  public static void main(String[] args) throws InterruptedException {
			
		    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();// maximize the window of the browser
				
			driver.get("https://www.facebook.com/signup");
			
			List<WebElement> dayvalue = driver.findElements(By.xpath("//*[@id='day']//option"));//here Elements using day value
			
			// using for each loop
			
//			for(WebElement value:dayvalue)
//			{
//				String text=value.getText();
//				System.out.println(text);
//				
//				if(text.equals("12"))
//				{
//					value.click();
//				}
//				
//			}
			 //using for loop
			int numday =dayvalue.size();
			
			for(int i=1; i<numday; i++)
			{
				String text = dayvalue.get(i).getText();
				
				System.out.println(text);
				
				if(text.equals("16"))
				{
					dayvalue.get(i).click();
				}
				
			}
			
				

}
}