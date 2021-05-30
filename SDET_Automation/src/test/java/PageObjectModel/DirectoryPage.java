package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DirectoryPage {

		
	WebDriver driver;
	
	By name= By.id("searchDirectory_emp_name_empName");
	By searchButton = By.id("searchBtn");
	By resetButton = By.id("resetBtn");
	//By nameTablecol= By.xpath("//*[@id='resultTable']/thead/tr/th");
	By nameTablerow=By.xpath("//*[@id='resultTable']/tbody/tr[2]");
		
	public DirectoryPage(WebDriver driver){
		this.driver= driver;
	}
	
	public void serchEmpname(String empName) {
		driver.findElement(name).sendKeys(empName);
		driver.findElement(searchButton).click();
	}
	
	public void resetSearch() {
		driver.findElement(resetButton).click();
	}
	
//	public int getColcnt() {
//		int col = driver.findElements(nameTablecol).size();
//		System.out.println(col);
//		return col;
//	}
	
	public int getRowcnt() {
		int row = driver.findElements(nameTablerow).size();
		System.out.println(row);
		return row;
	}
	public void readContents(int row, int col) {
			
			for(int i=1;i<=row;i++) {
	
			for(int j=1;j<=col;j++) {
				String val = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("Rows: " + i + " Columns: " + j + " Value: "+ val);	
	}
}
	}
}