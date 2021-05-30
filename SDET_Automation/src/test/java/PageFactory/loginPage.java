package PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class loginPage {
	
	WebDriver driver;
	
	@FindBy(id="txtUserName")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement pwd;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	@FindBy(tagName="a")
	List<WebElement> lnk;
	
	@FindBys({@FindBy(how=How.ID,using="txtUserName"),@FindBy(how=How.NAME, using="txtUserName")})
	WebElement bothCondition;
	
	

}
