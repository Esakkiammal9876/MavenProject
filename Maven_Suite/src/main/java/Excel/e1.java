package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class e1 {
	
	@Test

	public void t1() throws IOException
	{
		//xls:HSSF

		//xlsx:XSSF

		File f=new File("C:\\Users\\Admin\\Downloads\\Book1.xlsx");
		FileInputStream ob=new FileInputStream(f);
		XSSFWorkbook x=new XSSFWorkbook(ob);
		XSSFSheet sheet=x.getSheetAt(0);

		System.out.println(sheet.getLastRowNum());

		System.out.println(sheet.getFirstRowNum());

		sheet.getRow(2).createCell(1).setCellValue("abi");

		FileOutputStream fos = new FileOutputStream(f);

		x.write(fos);


	}
	
}
