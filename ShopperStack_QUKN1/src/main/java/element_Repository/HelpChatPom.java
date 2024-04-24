package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpChatPom extends BasePage

{
	public HelpChatPom(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="/html/body/div[1]/section[3]/div/span/svg")
	private WebElement chaticon;
	@FindBy(xpath="/html/body/div[1]/section[4]/article/main/article/p[2]")
	private WebElement deliveryissuestopic;
	@FindBy(id="chat_input")
	private WebElement enterquery;
	@FindBy(xpath="/html/body/div[1]/section[4]/article/footer/span[2]/svg")
	private WebElement enterlogo;
	@FindBy(xpath="/html/body/div[1]/section[4]/article/main/article/p[6]/p[11]/span")
	private WebElement result;
	public WebElement getResult() {
		return result;
	}
	public WebElement getChaticon() {
		return chaticon;
	}
	public WebElement getDeliveryissuestopic() {
		return deliveryissuestopic;
	}
	public WebElement getEnterquery() {
		return enterquery;
	}
	public WebElement getEnterlogo() {
		return enterlogo;
	}
	/*
	public void Chat(String query,String Phnumber,String email,String date,String time) throws InterruptedException
	{
		chaticon.click();
		deliveryissuestopic.click();
		enterquery.sendKeys(query);
		enterlogo.click();
		Thread.sleep(5000);
		enterquery.sendKeys(Phnumber);
		enterlogo.click();
		Thread.sleep(5000);
		enterquery.sendKeys(email);
		enterlogo.click();
		Thread.sleep(5000);
		enterquery.sendKeys(date);
		enterlogo.click();
		Thread.sleep(5000);
		enterquery.sendKeys(time);
		enterlogo.click();
		Thread.sleep(5000);
	}*/
}
