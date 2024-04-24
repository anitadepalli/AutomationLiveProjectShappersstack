package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddToWishListPom extends BasePage
{
	public AddToWishListPom(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[@id='women']")
	private WebElement womenstab;
	@FindBy(xpath="//span[text()='FOREVER 21  Casual Regular Sleeves ...']")
	private WebElement womenForeever21;
	@FindBy(xpath="//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']/*[local-name()='path']")
	private WebElement redheart;
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[3]")
	private WebElement wishlistoption;
	public WebElement getWomenForeever21() {
		return womenForeever21;
	}
	public WebElement getWishlistoption() {
		return wishlistoption;
	}
	public WebElement getWomenstab() {
		return womenstab;
	}
	
	
	public WebElement getRedheart() {
		return redheart;
	}
	/*public void addtoWishList()
	{
		womenstab.click();
		redheart.click();
		getAccountButton().click();
		wishlistoption.click();
	}*/
}
