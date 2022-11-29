package basicselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class LoginOrangeExel {
	
	public static void writeData(int row, int col,String val) throws IOException
	{
		String path = System.getProperty("user.dir")+"//testdata.xlsx";//path copy is in excel sheet in property
		  File src = new File("C:\\Users\\user\\Desktop\\testdata.xlsx");
			
			// to load particular location  to read data
			
			FileInputStream fis = new FileInputStream(src);//file ip object
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			 XSSFSheet sh1 = wb.getSheet("Sheet1");
			 
			 File fout = new File("C:\\Users\\user\\Desktop\\testdata.xlsx");
			 
			 FileOutputStream fos = new FileOutputStream(fout);
			 
			sh1.getRow(row).getCell(col).setCellValue(val);
			wb.write(fos);
			

		
	}
	public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
     //	WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
     	WebElement username = driver.findElement(By.xpath("//*[text()='LOGIN Panel']"));
     	String val = username.getText();
     	System.out.println(val);
     	
     	
     	
		
		
	//	WebElement passval = driver.findElement(By.xpath("//input[@name='txtPassword']"));		
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		writeData(2,1,val);
		
		
	}

}
