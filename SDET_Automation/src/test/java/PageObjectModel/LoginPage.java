package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

		WebDriver driver;
		
		By uname = By.id("txtUsername");
		By pwd= By.id("txtPassword");
		By loginButton = By.id("btnLogin");

	
		public LoginPage(WebDriver driver){
			this.driver= driver;
			
		}
		
		public void setUsername(String userName)
		{
			driver.findElement(uname).sendKeys(userName);
		}
		
		public void setPwd(String pswd)
		{
			driver.findElement(pwd).sendKeys(pswd);
		}
		
		public void clickLoginbtn() {
			driver.findElement(loginButton).click();
		}
	}



