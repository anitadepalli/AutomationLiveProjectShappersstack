package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteFromWishListPom extends BasePage
{
	public DeleteFromWishListPom(WebDriver w)
	{
		super(w);
	}	
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[3]")
	private WebElement wishlistoption;
	@FindBy(xpath="/html/body/div[1]/section[2]/article/div/div[6]")
	private WebElement lipcrayon;
	@FindBy(xpath="/html/body/div[1]/section[2]/article/div/div[1]/div[2]/div[2]/button[2]")
	private WebElement deletefromwishlist;
	public WebElement getLipcrayon() {
		return lipcrayon;
	}
	public WebElement getWishlistoption() {
		return wishlistoption;
	}
	public WebElement getDeletefromwishlist() {
		return deletefromwishlist;
	}
	/*public void Removefromwishlist()
	{
		getAccountButton().click();
		wishlistoption.click();
		lipcrayon.isSelected();
		deletefromwishlist.click();
	}*/

}
