package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddWishListToCartPom extends BasePage
{
	public AddWishListToCartPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[3]")
	private WebElement wishlistoption;
	@FindBy(xpath="/html/body/div[1]/section[2]/article/div/div[4]")
	private WebElement womensleopardshirt;
	@FindBy(xpath="/html/body/div[1]/section[2]/article/div/div[1]/div[2]/div[2]/button[1]")
	private WebElement wishlisttocart;
	@FindBy(id="cartIcon")
	private WebElement carticon;
	
	public WebElement getWomensleopardshirt() {
		return womensleopardshirt;
	}
	public WebElement getCarticon() {
		return carticon;
	}
	public WebElement getWishlisttocart() {
		return wishlisttocart;
	}
	public WebElement getWishlistoption() {
		return wishlistoption;
	}
	
	/*public void AddFromWishListToCart()
	{
		getAccountButton().click();
		wishlistoption.click();
		wishlisttocart.click();
		carticon.click();
		
	}*/


}