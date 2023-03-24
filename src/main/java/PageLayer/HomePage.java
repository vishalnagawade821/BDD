package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(xpath="(//div[@id='top-header-menu']/div)[1]")
	private WebElement logo;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkLogoStatus()
	{
		return logo.isDisplayed();
	}
	
	public String captureTitle()
	{
		return driver.getTitle();
	}
}
