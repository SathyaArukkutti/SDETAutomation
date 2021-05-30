package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPress {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement we = driver.findElement(By.id("txtUsername"));
		we.sendKeys("Admin");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).perform();
		
	}	
		
}	
		


