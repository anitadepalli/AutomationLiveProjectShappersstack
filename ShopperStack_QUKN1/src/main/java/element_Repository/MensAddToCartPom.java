package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MensAddToCartPom extends BasePage
{
	public MensAddToCartPom(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[@id='men']")
	private WebElement mens;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div[1]/div[2]")
	private WebElement levitee;
	@FindBy(id="Add To Cart")
	private WebElement addtocart;
	@FindBy(xpath="//a[@id='cart']")
	private WebElement carticon;
	public WebElement getMens() {
		return mens;
	}
	public WebElement getLevitee() {
		return levitee;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getCarticon() {
		return carticon;
	}
	/*public void Mensaddtocart()
	{
		mens.click();
		levitee.click();
		addtocart.click();
		carticon.click();

	}*/
}
