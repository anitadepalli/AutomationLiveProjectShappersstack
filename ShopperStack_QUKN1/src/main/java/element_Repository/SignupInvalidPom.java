package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupInvalidPom extends BasePage
{
	public SignupInvalidPom(WebDriver w)
	{
		super(w);
	}
	@FindBy(id="First Name")
	private WebElement firstname;
	@FindBy(id="Last Name")
	private WebElement lastname;
	@FindBy(id="Female")
	private WebElement femaleradiobutton;
	@FindBy(id="Phone Number")
	private WebElement phonenumber;
	@FindBy(id="Email Address")
	private WebElement emailaddress;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(id="Confirm Password")
	private WebElement confirmpassword;
	@FindBy(id="Terms and Conditions")
	private WebElement tandc;
	@FindBy(id="Register")
	private WebElement registerbutton;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getFemaleradiobutton() {
		return femaleradiobutton;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getEmailaddress() {
		return emailaddress;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	public WebElement getTandc() {
		return tandc;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	public void Register(String fname,String lname,String phnum,String email,String pwd,String cpwd )
	{
		firstname.sendKeys(fname);	
		lastname.sendKeys(lname);
		femaleradiobutton.click();
		phonenumber.sendKeys(phnum);
		emailaddress.sendKeys(email);
		password.sendKeys(pwd);
		confirmpassword.sendKeys(cpwd);
		tandc.click();
		registerbutton.click();
	}

}
