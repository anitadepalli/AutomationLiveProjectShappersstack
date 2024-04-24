package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductReviewsPom extends BasePage
{
	public ProductReviewsPom(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id="cartIcon")
	private WebElement carticon;
	@FindBy(xpath="/html/body/div[1]/section[2]/article/div[1]/div[1]/div[1]")
	private WebElement selectproduct;
	@FindBy(xpath="/html/body/div[1]/section[2]/article/div[1]/div[1]/div[1]/div[2]/span")
	WebElement productreviews;
	public WebElement getSelectproduct() {
		return selectproduct;
	}
	public WebElement getCarticon() {
		return carticon;
	}
	public WebElement getProductreviews() {
		return productreviews;
	}
	/*public void ProductReviews()
	{
		carticon.click();
		selectproduct.isSelected();
		productreviews.click();	
	}*/
}
