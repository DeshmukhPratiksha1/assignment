
package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FbExcelWriteData 
{

public static void writeData(int row, int col, String value) throws IOException 
{
	String path = System.getProperty("user.dir")+"//testdata.xlsx";
	
	File src = new File(path);
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheet("TestdataSheet");
	
	File fout = new File(path);
	
	FileOutputStream fos = new FileOutputStream(fout);
	
	sh1.createRow(row).createCell(col).setCellValue(value);
	
	wb.write(fos);	
}

	public static void main(String[] args) throws IOException 
	{
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement username = driver.findElement(By.xpath("//*[contains(@id,'u_0_j_')]"));
		username.sendKeys("pratiksha");
		String val = username.getAttribute("value");
		System.out.println(val);
		writeData(16,1,val);
		
//		Actions act = new Actions(driver);
		
//		act.sendKeys(Keys.TAB).sendKeys("deshmukh").build().perform();
		
		WebElement lname = driver.findElement(By.xpath("//*[contains(@id,'u_0_l_')]"));
		
		lname.sendKeys("Deshmukh");
		String val1 = lname.getAttribute("value");
		System.out.println(val1);
		writeData(12,1,val1);
		
		WebElement mbno = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		
	
		
		mbno.sendKeys("9158539453");
		String val2 = mbno.getAttribute("value");
		System.out.println(val2);
		writeData(14,2,val2);
		
		WebElement pass = driver.findElement(By.xpath("//*[@id='password_step_input']"));
		pass.sendKeys("anveshdeshmukh@1234");
		String val3 = pass.getAttribute("value");
		System.out.println(val3);
		writeData(4,3,val3);
		
		
		}
}
