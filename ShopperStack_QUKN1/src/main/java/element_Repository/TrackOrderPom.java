package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrackOrderPom extends BasePage
{
	public TrackOrderPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="/html/body/div[9]/div[3]/ul/li[4]")
	private WebElement myordersoption;
	@FindBy(xpath="/html/body/div[1]/div[4]/div[2]/div[1]/div/div/div/div[4]/div/button[2]")
	private WebElement trackorderbutton;
	@FindBy(xpath="/html/body/div[9]/div[3]/div[2]/h3")
	private WebElement trackstatus;
	public WebElement getMyordersoption() {
		return myordersoption;
	}
	public WebElement getTrackorderbutton() {
		return trackorderbutton;
	}
	public WebElement getTrackstatus() {
		return trackstatus;
	}
	public void Trackorder()
	{
		getAccountButton().click();
		myordersoption.click();
		trackorderbutton.click();
		String str = trackstatus.getText();
		System.out.println("Tracking Details: "+str);
	}

}
