package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://devlabs-860f0.web.app/table");
		driver.manage().window().maximize();
		
		int col = driver.findElements(By.xpath("//*[@id='table']/thead/tr/th")).size();
		System.out.println("Columns: " + col);
	
		int row = driver.findElements(By.xpath("//*[@id='table']/tbody/tr")).size();
		System.out.println("Columns: " + row);	
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				String val = driver.findElement(By.xpath("//*[@id='table']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("Rows: " + i + " Columns: " + j + " Value: "+ val);	
			}
		}
	}

}
