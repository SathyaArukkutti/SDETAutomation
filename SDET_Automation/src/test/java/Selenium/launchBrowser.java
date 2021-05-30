package Selenium;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) {
		//WebDriver driver;
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();

	}

}
