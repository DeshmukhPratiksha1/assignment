package assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class LoginFbExcel 
{
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		ExcelReader er = new ExcelReader();

		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_j_')]")).sendKeys(er.readData(11,0));//fname text box

		
		driver.findElement(By.xpath("//*[@value='2'][1]")).click();//date of birth day is enter
		

		
		
	}


}
