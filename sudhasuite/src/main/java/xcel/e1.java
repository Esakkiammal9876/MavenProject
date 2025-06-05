package xcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class e1 {
	
	@Test
	public void t1() throws IOException
	{
		//xls: HSSF
		//xlsx: XSSF
		File f= new File("C:\\Users\\Admin\\Desktop\\Batch Tex shift schedule.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		// number of rows
		System.out.println(sheet.getLastRowNum());
		
		// number of columns  present in row 2
		System.out.println(sheet.getRow(2).getLastCellNum());
		
		// 0,2
		XSSFCell data = sheet.getRow(0).getCell(2);
		System.out.println(data);
		
		//2,1
		sheet.getRow(2).createCell(1).setCellValue("sudha");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
	}

}
