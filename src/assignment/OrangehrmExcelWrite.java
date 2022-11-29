package assignment;

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

public class OrangehrmExcelWrite {
	public static void writedata(int row,int cell,String name) throws IOException 
	{
        String path = System.getProperty("user.dir")+"\\testdata.xlsx";//path copy is in excel sheet in property
	    
        File src = new File(path);
		
		// to load particular location  to read data
		
		FileInputStream fis = new FileInputStream(src);//file ip object
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		 XSSFSheet sh1 = wb.getSheet("TestdataSheet");
		 
		 File fout = new File(path);
		 
		 FileOutputStream fos = new FileOutputStream(fout);//file op object
		 
		 sh1.createRow(row).createCell(cell).setCellValue(name);
		 
		 wb.write(fos);
}
	

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		writedata(2,2,"OrangeHRM Assignment");
		
		
		String s1=driver.findElement(By.xpath("//*[text()='LOGIN Panel']")).getText();		
		writedata(3, 1, s1);
		String s2=driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).getText();
		writedata(4, 1, s2);
		
		String s3=driver.findElement(By.xpath("//*[contains(text(),'Forgot')]")).getText();		
		writedata(5,1, s3);

		Thread.sleep(2000);
		
		WebElement un=driver.findElement(By.xpath("//*[@id='txtUsername']"));
		WebElement pass=driver.findElement(By.xpath("//*[@id='txtPassword']"));
		
		un.sendKeys("admin");
		String a1=un.getAttribute("value");
		writedata(7, 2, a1);
		
		
		pass.sendKeys("admin123");
		String a2=pass.getAttribute("value");
		writedata(8, 2, a2);
	
		
		
	}	
		
	}