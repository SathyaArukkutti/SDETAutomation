package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
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

	}

}
