package importexcelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class protest {

	public static void main(String[] args) throws Exception {
		
		File src=new File("C:\\Users\\robir\\Desktop\\testimportselanium.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		//HSSFWorkbook is for xls file for the excel sheet.
		//for xlsx file this line have to use.
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//XSSFSheet is used to use the sheet we have to use . get sheet will be (index 0)
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		
	String data0=	sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("Data from excel sheet= "+data0);	
		
	String data1=	sheet1.getRow(1).getCell(1).getStringCellValue();
	System.out.println("Data from excel sheet= "+data1);	
	
		
		wb.close();
		

	}

}
