package Selenium;

import java.util.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('https://facebook.com')");
		js.executeScript("window.open('https://amazon.com')");
		
		String currentWin =  driver.getWindowHandle();
		Set<String> wins= driver.getWindowHandles();
		
		Iterator<String> itr= wins.iterator();
		while(itr.hasNext()) {
			String child = itr.next();
			if(!currentWin.equals(child)) {
				driver.switchTo().window(child);
				System.out.println("child window to be closed");
				System.out.println(driver.switchTo().window(child).getTitle());
				driver.close();
			}
		
	}

}
}
