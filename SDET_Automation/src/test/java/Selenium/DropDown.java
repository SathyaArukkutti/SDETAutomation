package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://devlabs-860f0.web.app/dropdown");
		driver.manage().window().maximize();
		
		WebElement we = driver.findElement(By.xpath("//*[@id=\"Index\"]"));
		
		Select sel = new Select(we);
		
		sel.selectByIndex(1);
		sel.selectByValue("Mango");
		sel.selectByVisibleText("Orange");
		
	}

}
