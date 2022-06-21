
package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void writeData() throws IOException
	{
		String path = System.getProperty("user.dir")+"//testdata.xlsx";//path copy is in excel sheet in property
		  File src = new File(path);
			
			// to load particular location  to read data
			
			FileInputStream fis = new FileInputStream(src);//file ip object
			
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			 XSSFSheet sh1 = wb.getSheet("TestdataSheet");
			 
			 File fout = new File(path);
			 
			 FileOutputStream fos = new FileOutputStream(fout);//file op object
			 
			 //to go particular location already row and col created
			 
			 sh1.getRow(6).getCell(0).setCellValue("write test");
			 
			 //to write for non existing row and existing col
			 
			 sh1.createRow(20).createCell(2).setCellValue("row created row and col");
			 
			 //to erite existing row and non existing col
			 
			 sh1.getRow(6).createCell(4).setCellValue("existing row and new col");
			
			 //to save written content
			 wb.write(fos);
			 
	}
	
	public static void getLastCellRowCol() throws IOException
	{
		  File src = new File("C:\\Users\\user\\Desktop\\testdata.xlsx");
			
			// to load particular location  to read data
			
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			 XSSFSheet sh1 = wb.getSheetAt(0);
			 
			DataFormatter df = new DataFormatter();
			int lastrow = sh1.getLastRowNum();
			System.out.println(lastrow);
			
			int lastcol = sh1.getRow(0).getLastCellNum();
			System.out.println(lastcol);
		
	}
	public static String readData(int row, int col) throws IOException
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
	
	public static void main(String[] args) throws IOException {

		
		/*File src = new File("C:\\Users\\user\\Desktop\\testdata.xlsx");
		
		// to load particular location  to read data
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		 XSSFSheet sh1 = wb.getSheetAt(0);
		 
		/*String value = sh1.getRow(4).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		String value1 = sh1.getRow(8).getCell(0).getStringCellValue();
		
		
		System.out.println(value1);*/
		
		/*DataFormatter df = new DataFormatter();
		String val = df.formatCellValue(sh1.getRow(8).getCell(0));
		System.out.println(val);
		
		for(int row=0; row<10; row++)
		{
			for(int col=0; col<=1; col++)
			{
				String str = df.formatCellValue(sh1.getRow(row).getCell(col));
				System.out.println(str);
			}
		}*/
		//getLastCellRowCol();//directly call static method in same class.
	
		writeData();
		 
	}

}

