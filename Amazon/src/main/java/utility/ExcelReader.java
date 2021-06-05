package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader
{
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	Row row;
	Cell cell;
	@SuppressWarnings("deprecation")
	public void getdata(String FilePath,String sheetName) 
	{
			try 
			{
				fis = new FileInputStream(FilePath);
			} catch (FileNotFoundException e) 
			{
				
				e.printStackTrace();
			}
		    try 
		    {
				wb=new XSSFWorkbook(fis);
			} catch (IOException e)
		    {
				
				e.printStackTrace();
			}
		    sheet=wb.getSheet(sheetName);
		    int rows= sheet.getLastRowNum();
		    int cells=sheet.getRow(0).getLastCellNum();
		    Object testData[][]=new Object[rows+1][cells];
		    System.out.println(rows);
		    System.out.println(rows);
		    
		    for(int i=0;i<=rows;i++)
		    {
		    	row=sheet.getRow(i);
		    	for(int j=0;j<cells; j++)
		    	{
		    		cell=row.getCell(j);
		    		switch(cell.getCellType())
		    		{
		    		case Cell.CELL_TYPE_NUMERIC:	    			
		    		     testData[i][j]=cell.getNumericCellValue();
		    		break;
		    		
		    		case Cell.CELL_TYPE_STRING:
		    			testData[i][j]=cell.getStringCellValue();
		    			break;
		    		
		    		}	    	    
		    	}
		    }
		    //printing the  array elements here
		    
		    for (int i = 0; i<rows; i++) 
		    {
		    	 
	            for (int j = 0; j<cells; j++) 
	            {
	                System.out.print(testData[i][j] + "    "); 
	            }
	            System.out.println(" ");
		    }
		    
	}
	
	public static void main(String arags[])
	{
		ExcelReader read= new ExcelReader();
		read.getdata("C://Users//sachin//git//amazon//Amazon//src//main//java//testData//loginData.xlsx", "Sheet1");
	}
	
	

}
