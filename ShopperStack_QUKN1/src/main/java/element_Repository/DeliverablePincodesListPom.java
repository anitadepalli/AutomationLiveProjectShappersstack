package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliverablePincodesListPom extends BasePage
{
	public DeliverablePincodesListPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="/html/body/div[1]/section[5]/article/div[2]/div[1]/div[4]/a")
	private WebElement helpcenter;
	@FindBy(id="simple-tab-0")
	private WebElement deliverablepintab;
	public WebElement getHelpcenter() {
		return helpcenter;
	}
	public WebElement getDeliverablepintab() {
		return deliverablepintab;
	}
	/*
	public void Listofdeliverablepincodes()
	{
		helpcenter.click();
		deliverablepintab.click();
	}*/
}
