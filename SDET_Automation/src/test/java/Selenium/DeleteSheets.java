package Selenium;


import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DeleteSheets {

	public static void main(String[] args) {
		String fileName = "src/main/resources/TestData.xlsx";
		//String sheetName= "Emp";
		
		String extn = fileName.substring(fileName.indexOf("."));
		
		List <String> al = new ArrayList<String>();
		al.add("Emp1");
		al.add("Emp4");
		
		
		Workbook wb = null;
		
		try
		{
			FileInputStream fis = new FileInputStream(new File(fileName));
			
			if(extn.equals(".xls"))
				wb =  new HSSFWorkbook(fis);
			else if(extn.equals(".xlsx"))
				wb =  new XSSFWorkbook(fis);
			
			//Sheet sh= wb.getSheet(sheetName);
			
			int shcnt = wb.getNumberOfSheets();
			System.out.println("Total number of sheets before delete: " + shcnt);
			System.out.println("--------------------------------");
			
			for(int i=0;i<shcnt;i++)
				System.out.println(wb.getSheetName(i));
			System.out.println("--------------------------------");
			System.out.println("Total number of sheets to be deleted: " + al.size());
			System.out.println(al);
			
			for(int i=0;i<shcnt;i++) {
				if(al.contains(wb.getSheetName(i))) {
					wb.removeSheetAt(i);
					i=i-1;
					shcnt=shcnt-1;
				}
			}
				         
			shcnt = wb.getNumberOfSheets();
			System.out.println("--------------------------------");
			System.out.println("Total number of sheets after delete: " + shcnt);
			for(int i=0;i<shcnt;i++)
				System.out.println(wb.getSheetName(i));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
