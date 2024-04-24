package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCODPom extends BasePage 
{
	public CheckoutCODPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="//a[@id='electronics']")
	private WebElement electronicstab;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div[1]")
	private WebElement samsungflipphone;
	@FindBy(xpath="//button[@id='Add To Cart']")
	private WebElement addtocartbutton;
	@FindBy(xpath="//a[@id='cart']")
	private WebElement carticon;
	@FindBy(xpath="//button[@id='buynow_fl']")
	private WebElement buynowbutton;
	@FindBy(xpath="//input[@id='36614']")
	private WebElement chooseaddressradiobutton;
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedbutton;
	@FindBy(xpath="//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3'and text()='Cash On Delivery (COD)']")
	private WebElement CODradiobutton;
	@FindBy(xpath="/html/body/div[1]/section[2]/article/div/form/div[3]/button")
	private WebElement paymentmethodproceedbutton;
	@FindBy(xpath="//h1[text()='Order Confirmed']")
	private WebElement orderconfirmedmessage;

	

	public WebElement getOrderconfirmedmessage() {
		return orderconfirmedmessage;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}

	public WebElement getElectronicstab() {
		return electronicstab;
	}

	public WebElement getSamsungflipphone() {
		return samsungflipphone;
	}

	
	public WebElement getCarticon() {
	return carticon;
	}

	public WebElement getBuynowbutton() {
    return buynowbutton;
	}

	public WebElement getChooseaddressradiobutton() {
		return chooseaddressradiobutton;
	}

	public WebElement getProceedbutton() {
		return proceedbutton;
	}

	public WebElement getCODradiobutton() {
		return CODradiobutton;
	}

	public WebElement getPaymentmethodproceedbutton() {
		return paymentmethodproceedbutton;
	}

	

	/*public void CheckoutusingCOD()
	{
		electronicstab.click();
		samsungflipphone.click();
		addtocartbutton.click();
		carticon.click();
		buynowbutton.click();
		chooseaddressradiobutton.click();
		proceedbutton.click();
		CODradiobutton.click();
		paymentmethodproceedbutton.click();
		String str = toastermessage.getText();
		System.out.println("The toaster message is: "+str);
	}*/
}
