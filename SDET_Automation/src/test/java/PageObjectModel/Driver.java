package PageObjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver {

	WebDriver driver;
	LoginPage objLogin;
	HomePage objHome;
	DirectoryPage objDirectory;
	
	//Excel handling 
	String fileName = "src/main/resources/TestData1.xlsx";
	String sheetName= "Data";
	
	String extn = fileName.substring(fileName.indexOf("."));
	
	Workbook wb = null;
	
	@BeforeTest
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream(new File(fileName));
		
		if(extn.equals(".xls"))
			wb =  new HSSFWorkbook(fis);
		else if(extn.equals(".xlsx"))
			wb =  new XSSFWorkbook(fis);
			
	}
	
	@Test
	public void testDirectoryPage() {
		Sheet sh= wb.getSheet(sheetName);
				
		String UserName = sh.getRow(1).getCell(0).getStringCellValue();
		String Pwd= sh.getRow(1).getCell(1).getStringCellValue();
		
		
		objLogin=new LoginPage(driver);
		objLogin.setUsername(UserName);
		objLogin.setPwd(Pwd);
		objLogin.clickLoginbtn();
		
		objHome = new HomePage(driver);
		objHome.clickDirectoryTab();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		objDirectory = new DirectoryPage(driver);
		objDirectory.serchEmpname("Paul");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
			

	}
	
	@AfterTest
	public void close() {
		driver.close();}
	}

