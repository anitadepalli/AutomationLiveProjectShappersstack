package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginInvalidPom extends BasePage
{
	public LoginInvalidPom(WebDriver w)
	{
		super(w);
	}
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/div/section/article/form/button[1]/span[1]")
	private WebElement loginbutton;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public void ShopperLogin(String emailaddress)
	{
		email.sendKeys(emailaddress);
		loginbutton.click();
	}
}
