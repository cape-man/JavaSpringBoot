package com.library;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic 
{
	
public static String getConfigData(String key)
{
	String v="";
	try
	{
		FileInputStream fis=new FileInputStream("./config.properties");
		Properties p=new Properties();
		p.load(fis);
		v=p.getProperty(key);
	}
	catch(Exception e)
	{
		
	}
	return v;
}

public static String readExcelData(String sheet,int row,int cell)
{
	String v="";
	try
	{
		FileInputStream fis=new FileInputStream("./xls/Book1.xlsx");
		Cell c = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell);
		if(c.getCellType()==1)
		{
			v=c.getStringCellValue();
		}
		else if(c.getCellType()==c.CELL_TYPE_NUMERIC)
		{
			v=""+c.getNumericCellValue();
		}
	}
	catch(Exception e)
	{
		
	}
	return v;
}

public static int getLastRowinExcel(String sheet)
{
	int v=0;
	try
	{
		FileInputStream fis=new FileInputStream("./xls/Book1.xlsx");
		Sheet s = WorkbookFactory.create(fis).getSheet(sheet);
		v=s.getLastRowNum();
	}
	catch(Exception e)
	{
		
	}
	return v;
}

}
