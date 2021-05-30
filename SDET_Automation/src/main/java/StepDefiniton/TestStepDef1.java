package StepDefiniton;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDef1 {
	WebDriver Driver;
	
	@Given("^I am in the login page of  URL https://opensource-demo\\.orangehrmlive\\.com/$")
	public void i_am_in_the_login_page_of_URL_https_opensource_demo_orangehrmlive_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I enter all combinations of user ids as \"([^\"]*)\" and passwords as \"([^\"]*)\"$")
	public void i_enter_all_combinations_of_user_ids_as_and_passwords_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I need to validate the \"([^\"]*)\" and report \"([^\"]*)\"$")
	public void i_need_to_validate_the_and_report(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user login in to application$")
	public void user_login_in_to_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
