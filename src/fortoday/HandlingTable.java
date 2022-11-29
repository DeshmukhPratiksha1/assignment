package fortoday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingTable {
	@Test
	public void m1() {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/");
		
		List<WebElement> allcol = driver.findElements(By.xpath("//*[contains(@id,'customers')]//th"));
		
		System.out.println(allcol.size());
		Assert.assertEquals(allcol.size(), 5);
		
		
	//	boolean status = false;
		for(WebElement ele:allcol)
			
		{
			String afcol = ele.getText();
			System.out.println(afcol);
			/*
			 * if(afcol.contains("Action")) { //status = true; break; }
			 */
			
			//Assert.assertTrue(status,"test pass");
		}
		System.out.println("----------------------------------------------------------------------------------------------");	
           List<WebElement> allrow = driver.findElements(By.xpath("//*[contains(@id,'customers')]//tr"));
           
          int allrowsize = allrow.size();
          
          Assert.assertEquals(allrowsize, 7);
          
          System.out.println(allrowsize);
          
          System.out.println();
          
          for(WebElement afterallrow:allrow)
          {
        	String afterele = afterallrow.getText();
        	
        	System.out.println(afterele);
            }
          
          System.out.println("----------------------------------------------------------");
          
          
          List<WebElement> alldata = driver.findElements(By.xpath("//*[contains(@id,'customers')]//td"));
          
          int afteralldata = alldata.size();
          
          System.out.println(afteralldata);
          
          for(WebElement data:alldata)
          {
        	  String aftereledata = data.getText();
        	  
        	  System.out.println(aftereledata);
        	  
          }
        }

}
