package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDeliverableOrNotPom extends BasePage
{
	public ProductDeliverableOrNotPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(id="beautyProducts")
	private WebElement beautytab;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div[1]/div[1]/img")
	private WebElement mattelipstick;
	@FindBy(id="Check Delivery")
	private WebElement zipcode;
	@FindBy(id="Check")
	private WebElement deliverableornot;
	@FindBy(xpath="/html/body/div[1]/section[2]/article/div/div[2]/div[6]/div/form/div/p/p")
	private WebElement deliverystatus;
	public WebElement getDeliverystatus() {
		return deliverystatus;
	}
	public WebElement getBeautytab() {
		return beautytab;
	}
	public WebElement getMattelipstick() {
		return mattelipstick;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public WebElement getDeliverableornot() {
		return deliverableornot;
	}
	/*public void Deliverableornot(String pin)
	{
		beautytab.click();
		mattelipstick.click();
		zipcode.sendKeys(pin);
		deliverableornot.click();
		String str = deliverystatus.getText();
		System.out.println("The product is : "+str);
	}*/

}
