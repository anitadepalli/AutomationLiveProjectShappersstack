package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteFromMyLikesPom extends BasePage
{
	public DeleteFromMyLikesPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[1]")
	private WebElement myprofileoption;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div[3]/a[4]/div")
	private WebElement mylikestab;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/section/section/article/div/div[1]")
	private WebElement womencategory;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/section/section/article/div/div[3]/button/svg")
	private WebElement crossicon;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[1]")
	private WebElement toastermessage;
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[6]")
	private WebElement mylikesoption;
	public WebElement getWomencategory() {
		return womencategory;
	}
	public WebElement getMylikesoption() {
		return mylikesoption;
	}
	public WebElement getMyprofileoption() {
		return myprofileoption;
	}
	public WebElement getMylikestab() {
		return mylikestab;
	}
	public WebElement getCrossicon() {
		return crossicon;
	}
	public WebElement getToastermessage() {
		return toastermessage;
	}
	/*public void Deletefrommylikes()
	{
		getAccountButton().click();
		myprofileoption.click();
		mylikestab.click();
		womencategory.isSelected();
		crossicon.click();
		String str = toastermessage.getText();
		System.out.println("The toaster message is: "+str);
		getAccountButton().click();
		mylikesoption.click();
	}*/
}
