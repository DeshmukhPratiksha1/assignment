package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public abstract class BaseClass {
	 Properties prop;
	FileInputStream fis;
	public BaseClass() throws IOException
	{
		 prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		 fis = new FileInputStream(path);
		
		prop.load(fis);
		

	}
	public String readData(int row, int col) throws IOException
	{
       File src = new File("C:\\Users\\user\\Desktop\\testdata.xlsx");
		
		// to load particular location  to read data
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		 XSSFSheet sh1 = wb.getSheetAt(0);
		 
		DataFormatter df = new DataFormatter();
		
		String val = df.formatCellValue(sh1.getRow(row).getCell(col));
		System.out.println(val);
		return val;
		
	}
}
