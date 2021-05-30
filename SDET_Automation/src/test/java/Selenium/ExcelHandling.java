package Selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void main(String[] args) {
		String fileName = "src/main/resources/TestData.xlsx";
		String sheetName= "Emp";
		
		String extn = fileName.substring(fileName.indexOf("."));
		
		Workbook wb = null;
		
		try
		{
			FileInputStream fis = new FileInputStream(new File(fileName));
			
			if(extn.equals(".xls"))
				wb =  new HSSFWorkbook(fis);
			else if(extn.equals(".xlsx"))
				wb =  new XSSFWorkbook(fis);
			
			Sheet sh= wb.getSheet(sheetName);
			
			int rcnt = sh.getPhysicalNumberOfRows();
			int colcnt= sh.getRow(0).getLastCellNum();
			
			for(int i=0;i<rcnt;i++) {
				for(int j=0;j<colcnt;j++) {
				System.out.println("Row " + i + "Column " + j + "Value: " + sh.getRow(i).getCell(j));	
				}
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
