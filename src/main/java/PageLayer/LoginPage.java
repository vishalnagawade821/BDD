package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginButton;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userEnterUsernameAndPassword(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}
