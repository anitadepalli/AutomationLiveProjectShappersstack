package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddOfficeAddressInvalidPom extends BasePage
{
	public AddOfficeAddressInvalidPom(WebDriver driver)
	{
		super(driver);
	}	
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[1]")
	private WebElement myprofileoption;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div[3]/a[2]/div")
	private WebElement myaddressestab;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/section/div/div[1]/a/button")
	private WebElement addaddressbluebutton;
	@FindBy(id="Office")
	private WebElement officetyperadiobutton;
	@FindBy (id="Name")
	private WebElement name;
	@FindBy (id="House/Office Info")
	private WebElement homeorofficeinfo;
	@FindBy (id="Street Info")
	private WebElement streetinfo;
	@FindBy (id="Landmark")
	private WebElement landmark;
	@FindBy (id="Country")
	private WebElement country;
	@FindBy (id="State")
	private WebElement state;
	@FindBy (id="City")
	private WebElement city;
	@FindBy (id="Pincode")
	private WebElement pincode;
	@FindBy(id="pincode-error")
	private WebElement errormessage;
	public WebElement getOfficetyperadiobutton() {
		return officetyperadiobutton;
	}

	public WebElement getErrormessage() {
		return errormessage;
	}

	public WebElement getMyprofileoption() {
		return myprofileoption;
	}

	public WebElement getMyaddressestab() {
		return myaddressestab;
	}

	public WebElement getAddaddressbluebutton() {
		return addaddressbluebutton;
	}

	public WebElement getHometyperadiobutton() {
		return officetyperadiobutton;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getHomeorofficeinfo() {
		return homeorofficeinfo;
	}

	public WebElement getStreetinfo() {
		return streetinfo;
	}

	public WebElement getLandmark() {
		return landmark;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPincode() {
		return pincode;
	}

	/*public void Addaddress(String yourname,String buildinginfo,String strtinfo,String lmark,String reqcountry,String reqstate,String reqcity,String pin)
	{
		getAccountButton().click();
		myprofileoption.click();
		myaddressestab.click();
		addaddressbluebutton.click();
		officetyperadiobutton.click();
		name.sendKeys(yourname);
		homeorofficeinfo.sendKeys(buildinginfo);
		streetinfo.sendKeys(strtinfo);
		landmark.sendKeys(lmark);
		Select Crty=new Select(country);
		Crty.selectByVisibleText(reqcountry);
		Select State=new Select(state);
		State.selectByVisibleText(reqstate);
		Select City=new Select(city);
		City.selectByVisibleText(reqcity);
		pincode.sendKeys(pin);
		String str = errormessage.getText();
		System.out.println("The error message is: "+str);
	}*/

}
