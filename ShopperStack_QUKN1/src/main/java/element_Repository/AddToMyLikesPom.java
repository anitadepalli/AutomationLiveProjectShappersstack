package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddToMyLikesPom extends BasePage
{
	public AddToMyLikesPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[1]")
	private WebElement myprofileoption;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div[3]/a[4]/div")
	private WebElement mylikestab;
	@FindBy(id="Category")
	private WebElement categorydropdown;
	@FindBy(id="Category Type")
	private WebElement categorytypedropdown;
	@FindBy(id="Submit")
	private WebElement submitbutton;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[1]/div[2]")
	private WebElement toastermessage;
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[6]")
	private WebElement mylikesoption;
	public WebElement getMyprofileoption() {
		return myprofileoption;
	}
	public WebElement getMylikestab() {
		return mylikestab;
	}
	public WebElement getCategorydropdown() {
		return categorydropdown;
	}
	public WebElement getCategorytypedropdown() {
		return categorytypedropdown;
	}
	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	public WebElement getToastermessage() {
		return toastermessage;
	}
	public WebElement getMylikesoption() {
		return mylikesoption;
	}
	/*public void Addtomylikes(String category,String cattype)
	{
		getAccountButton().click();
		myprofileoption.click();
		mylikestab.click();
		Select Category=new Select(categorydropdown);
		Category.selectByVisibleText(category);
		Select Type=new Select(categorytypedropdown);
		Type.selectByVisibleText(cattype);
		submitbutton.click();
		String str = toastermessage.getText();
		System.out.println("The toaster message is: "+str);
		getAccountButton().click();
		mylikesoption.click();
		
	}*/
}
