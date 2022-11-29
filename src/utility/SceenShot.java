package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SceenShot {
	
//	public static void captureScreenShot(WebDriver driver, String name) throws IOException
//	{
//		TakesScreenshot username = (TakesScreenshot)driver;//casting apply is here
//		
//		File source = username.getScreenshotAs(OutputType.FILE);//this method get the ss source
//		
////		File destination = new File("E:\\Desktop\\VimanNagar\\Dec 21\\Screenshots\\"+name+".png");
//		
//		String path = System.getProperty("user,dir")+"\\screenshots\\"+name+".png";//class in system get method call
//		
//		File destination = new File(path);
//		
//		FileHandler.copy(source, destination);
	
	public static void captureScreenShot(WebDriver driver, String name) throws IOException
	{
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
		
//		File destination = new File("E:\\Desktop\\VimanNagar\\Dec 21\\Screenshots\\"+name+".png");
	
		String path = System.getProperty("user.dir")+"\\screenshots\\"+name+".png";
		
		File destination = new File(path);
		
		FileHandler.copy(source, destination);
		
		//	FileUtils.copyFile(source, destination);  another way
	
		
	}
		
		
//	public static void main(String[] args) throws IOException, InterruptedException {
//		
//				
//			    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
//					
//				WebDriver driver = new ChromeDriver();
//					
//				driver.manage().window().maximize();// maximize the window of the browser
//					
//				driver.get("https://www.facebook.com/signup");
//				
//				Thread.sleep(3000);
//				
//				//TakesScreenshot srcshot = (TakesScreenshot)driver;
//				
//				//File source = srcshot.getScreenshotAs(OutputType.FILE);
//				
//				//File destination = new File("");
//				
//				//FileHandler.copy(source, destination);
//				
//				captureScreenShot(driver,"scr2");
//				
//	}

}
