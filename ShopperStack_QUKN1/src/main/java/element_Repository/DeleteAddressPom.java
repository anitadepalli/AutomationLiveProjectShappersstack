package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAddressPom extends BasePage
{
	public DeleteAddressPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[1]")
	private WebElement myprofileoption;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div[3]/a[2]/div")
	private WebElement myaddressestab;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/section/div/div[2]/div[1]/div[1]")
	private WebElement selectedaddress;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/section/div/div[2]/div[1]/div[2]/div/button/span[1]/svg")
	private WebElement deleteicon;
	public WebElement getSelectedaddress() {
		return selectedaddress;
	}
	public WebElement getMyprofileoption() {
		return myprofileoption;
	}
	public WebElement getMyaddressestab() {
		return myaddressestab;
	}
	public WebElement getDeleteicon() {
		return deleteicon;
	}
	/*
	public void DeleteAddress()
	{
		getAccountButton().click();
		myprofileoption.click();
		myaddressestab.click();
		deleteicon.click();
		
		

	}*/


}
