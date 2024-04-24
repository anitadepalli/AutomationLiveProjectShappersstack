package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditProfilePom extends BasePage
{
	public EditProfilePom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[1]")
	private WebElement myprofileoption;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/section/section/div[1]/button")
	private WebElement editprofilebutton;
	@FindBy(id="Last Name")
	private WebElement lastname;
	
	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(id="submit")
	private WebElement submitbutton;
	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	public WebElement getMyprofileoption() {
		return myprofileoption;
	}
	public WebElement getEditprofilebutton() {
		return editprofilebutton;
	}
	/*
	public void editprofile()
	{
		getAccountButton().click();
		myprofileoption.click();
		editprofilebutton.click();
		lastname.sendKeys("Nambi");
		submitbutton.click();
	}*/

	
}
