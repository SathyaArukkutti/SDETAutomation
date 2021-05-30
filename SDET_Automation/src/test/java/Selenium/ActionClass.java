package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement we = driver.findElement(By.id("txtUsername"));
		we.sendKeys("Admin");
		WebElement we1 = driver.findElement(By.id("txtPassword"));
		we1.sendKeys("admin123");
		WebElement we2 = driver.findElement(By.name("Submit"));
		we2.click();
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\'menu_admin_Job\']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_viewJobTitleList']"))).build().perform();
		
		act.click().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\'menu_admin_Organization\']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\'menu_admin_viewCompanyStructure\']"))).build().perform();
		
		
		//*[@id="menu_admin_Organization"]
		//*[@id="menu_admin_viewCompanyStructure"]
		
		
		act.click().perform();
	}

}
