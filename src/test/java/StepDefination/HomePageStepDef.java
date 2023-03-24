package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageStepDef extends BaseClass{
	static HomePage homepage;
	@Then("user validate home page logo")
	public void user_validate_home_page_logo() {
		homepage = new HomePage();
	    Assert.assertEquals(homepage.checkLogoStatus(), true);
	}

	@Then("user validate home page title")
	public void user_validate_home_page_title() {
	    Assert.assertEquals(homepage.captureTitle(),"Cogmento CRM");
	 
	}
}
