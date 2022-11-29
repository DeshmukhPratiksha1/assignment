package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		String parentwinid = driver.getWindowHandle();//this method use only parent id
		
		System.out.println(parentwinid);
		
		link.click();
		link.click();
		link.click();
		
		Set<String> allwinid = driver.getWindowHandles();
		
		//System.out.println(allwinid);
		
		int length = allwinid.size();
		
		String [] winid = new String[length];//in this id save in array
		
		int i=0;//this for start array index of 0
		
		for(String id:allwinid)
		{
			winid[i]=id;
			System.out.println(winid[i]);
			i++;
		}
		
		/*for(String arrayelement:winid)
		{
			System.out.println(arrayelement);
		}*/
		
		driver.switchTo().window(winid[2]);
		
		driver.get("https://web.whatsapp.com/");
		
		String t1 = driver.getTitle();
		System.out.println(t1);
		
		driver.switchTo().window(winid[0]);
		
		driver.get("https://www.linkedin.com/login");
		
	     driver.switchTo().window(winid[3]);
		
		driver.get("https://groww.in/");

}
}
