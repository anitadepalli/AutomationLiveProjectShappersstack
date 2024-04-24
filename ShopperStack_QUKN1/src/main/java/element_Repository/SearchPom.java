package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPom extends BasePage 
{
	public SearchPom(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id="category")
	private WebElement searchcategory;
	@FindBy(id="search")
	private WebElement searchtextbox;
	@FindBy(id="searchBtn")
	private WebElement searchicon;
	public WebElement getSearchcategory() {
		return searchcategory;
	}
	public WebElement getSearchtextbox() {
		return searchtextbox;
	}
	public WebElement getSearchicon() {
		return searchicon;
	}
	/*public void searchoperation(String category,String item)
	{
		Select srch=new Select(searchcategory);
		srch.selectByVisibleText(category);
		searchtextbox.click();
		searchtextbox.click(); // have to double click
		Select srchdropdown=new Select(searchtextbox);
		srchdropdown.selectByVisibleText(item);
		searchicon.click();
	}*/
}
