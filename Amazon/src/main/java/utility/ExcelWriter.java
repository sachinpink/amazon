package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter
{
	public void write(String filepath,String sheetName ) throws FileNotFoundException
	{
		FileInputStream fis= new FileInputStream(filepath);
		try {
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheet(sheetName);
			sheet.getRow(0).createCell(0).setCellValue("hi");
			sheet.getRow(0).createCell(1).setCellValue("sachin");
			
//			sheet.getRow(1).createCell(0).setCellValue("Hi");
//			sheet.getRow(1).createCell(1).setCellValue("Pink");
			
			FileOutputStream fos= new FileOutputStream(filepath);
			wb.write(fos);
			wb.close();
			
		   } 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String arags[]) throws FileNotFoundException
	{
		ExcelWriter ew= new ExcelWriter();
		ew.write("C://Users//sachin//Documents//loginData.xlsx", "Sheet2");
	}

}
