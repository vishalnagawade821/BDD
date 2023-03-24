package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass{
	LoginPage loginpage;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    BaseClass.init();
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    loginpage = new LoginPage();
	    loginpage.userEnterUsernameAndPassword("prafulp1010@gmail.com", "Pr@ful0812");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
	    loginpage.clickOnLoginButton();
	}
}
