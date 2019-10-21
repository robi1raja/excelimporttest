package importexcelsheet;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datacount {

	public static void main(String[] args) throws Exception {
      
		
		File src=new File("C:\\Users\\robir\\Desktop\\testimportselanium.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		//HSSFWorkbook is for xls file for the excel sheet.
		//for xlsx file this line have to use.
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//XSSFSheet is used to use the sheet we have to use . get sheet will be (index 0)
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		
		System.out.println("total rows is = "+rowcount);
		
		
		for(int i=0;i<rowcount;i++) {
	String data0=sheet1.getRow(i).getCell(0).getStringCellValue();		
	
	//two different preview
	
	System.out.println("total data from excel is= "+data0);
	
	System.out.println("total data from row= "+i+" is "+data0);
		}
		
		
		
		
		
		wb.close();
		
		
	}

}
