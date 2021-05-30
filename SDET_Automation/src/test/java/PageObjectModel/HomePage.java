package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	WebDriver driver;
	
	
	
	public HomePage(WebDriver driver){
		this.driver= driver;
		
	}
	public void clickDirectoryTab() {
	Actions act = new Actions(driver);	
	act.moveToElement(driver.findElement(By.xpath("//*[@id='menu_directory_viewDirectory']/b"))).
	build().perform();
	
	act.click().perform();
	}

}
