package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class IncreaseAndDecreaseQuantityPom extends BasePage
{
	public IncreaseAndDecreaseQuantityPom(WebDriver w)
	{
		super(w);
	}
	@FindBy(id="cartIcon")
	private WebElement carticon;
	@FindBy(xpath="/html/body/div[1]/section[2]/article/div[1]/div[1]")
	private WebElement selectproduct;
	@FindBy(id="increase")
	private WebElement increasequantity;
	@FindBy(id="decrease")
	private WebElement decreasequantity;
	public WebElement getSelectproduct() {
		return selectproduct;
	}
	public WebElement getCarticon() {
		return carticon;
	}
	public WebElement getIncreasequantity() {
		return increasequantity;
	}
	public WebElement getDecreasequantity() {
		return decreasequantity;
	}
	/*
	public void IncreaseQty()
	{
		carticon.click();
		increasequantity.click();
	}
	public void DecreaseQty()
	{
		carticon.click();
		decreasequantity.click();
	}*/
}
