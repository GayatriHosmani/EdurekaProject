package stepdefinitions;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private static String title;
	
	
	@Given("The user is on login page")
	public void the_user_is_on_login_page() {
		
	    DriverFactory.getDriver().get("https://www.demoblaze.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    
		 title=loginpage.getTitleOfPage();
		System.out.println("Title of the page is:"+title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
	    
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("user clicks on Login")
	public void user_clicks_on_login() {
	    
		loginpage.clickOnLoginLink();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@When("enters the {string} and {string}")
	public void enters_the_and(String lusername,String lpassword) {
	    
		loginpage.enterLoginUserName(lusername);
		loginpage.enterLoginPassword(lpassword);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    
		loginpage.clickOnLoginButton();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("page should display a link with Welcome username")
	public void page_should_display_a_link_with_welcome_username() {
	    
		Assert.assertTrue(loginpage.isWelcomeUserDisplayed());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@When("user clicks on sign up link")
	public void user_clicks_on_sign_up_link() {
		
	    loginpage.clickOnSignupLink();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("sign up form should be displayed")
	public void sign_up_form_should_be_displayed() {
	    
		Assert.assertTrue(loginpage.isSignInUserNameExist());
	}

	@Given("The user is on sign up page")
	public void the_user_is_on_sign_up_page() {
		
		DriverFactory.getDriver().get("https://www.demoblaze.com/");
		
		loginpage.clickOnSignupLink();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Given("Username field is visible")
	public void username_field_is_visible() {
	    
		Assert.assertTrue(loginpage.isSignInUserNameExist());
	}

	@When("user enters a valid {string} and {string}")
	public void user_enters_a_valid_and(String string, String string2) {
	    
		loginpage.enterSignUpUsername(string);
		loginpage.enterSignUpPassword(string2);
	}

	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {
	    
		loginpage.clickOnSignUpButton();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("an alert with Sign up successful message must be displayed.")
	public void an_alert_with_sign_up_successful_message_must_be_displayed() {
	    
		Assert.assertTrue(loginpage.isAlertExist());
	}




}
