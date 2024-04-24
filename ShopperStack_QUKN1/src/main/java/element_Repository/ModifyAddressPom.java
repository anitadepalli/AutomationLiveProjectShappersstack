package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModifyAddressPom extends BasePage
{
	public ModifyAddressPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[1]")
	private WebElement myprofileoption;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div[3]/a[2]/div")
	private WebElement myaddressestab;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/section/div/div[2]/div[1]/div[1]/div/div")
	private WebElement selectaddress;
	@FindBy (id="editaddress_fl")
	private WebElement editaddressicon;
	@FindBy (id="Landmark")
	private WebElement landmark;
	@FindBy (id="Update Address")
	private WebElement updateaddressbutton;
	@FindBy (xpath="/html/body/div[1]/div[1]/div/div/div[1]/div[2]")
	private WebElement toastermessage;

	public WebElement getSelectaddress() {
		return selectaddress;
	}

	public WebElement getMyprofileoption() {
		return myprofileoption;
	}

	public WebElement getMyaddressestab() {
		return myaddressestab;
	}

	public WebElement getEditaddressicon() {
		return editaddressicon;
	}

	public WebElement getLandmark() {
		return landmark;
	}

	public WebElement getUpdateaddressbutton() {
		return updateaddressbutton;
	}

	public WebElement getToastermessage() {
		return toastermessage;
	}

	/*public void Editaddress(String lndmark)
	{
		getAccountButton().click();
		myprofileoption.click();
		myaddressestab.click();
		selectaddress.isSelected();
		editaddressicon.click();
		landmark.sendKeys(lndmark);
		updateaddressbutton.click();
		String str = toastermessage.getText();
		System.out.println("The toaster message is: "+str);
	}*/
}
