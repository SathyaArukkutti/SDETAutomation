package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	@org.testng.annotations.DataProvider
	public static Object[][] dp() {
		return new Object[][] {new Object[] {"","Admin123"}, new Object[] {"abc","User2"},
			new Object[] {"Admin1","Admin123"},};
		}
	WebDriver driver;
	@BeforeTest
	public void launch() {
		
	System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "dp")
	public void login(String uname,String pwd) {

	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement we = driver.findElement(By.id("txtUsername"));
	we.sendKeys(uname);
	WebElement we1 = driver.findElement(By.id("txtPassword"));
	we1.sendKeys(pwd);
	WebElement we2 = driver.findElement(By.name("Submit"));
	we2.click();
	}
	
	@AfterTest
	private void close() {driver.quit();}	
		

}