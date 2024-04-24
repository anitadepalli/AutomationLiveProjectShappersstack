package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckWishListPom extends BasePage
{
	public CheckWishListPom(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[3]")
	private WebElement wishlist;
	
	public WebElement getWishlist() {
		return wishlist;
	}
	
	/*	
	public void WishListCheck()
	{
		accountsettings.click();
		wishlist.click();
	}*/
}
