package Selenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeQuit {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.open('https://facebook.com')");
	js.executeScript("window.open('https://amazon.com')");
	Thread.sleep(5000);
	driver.quit();
	
}
}