package testscripts;



import org.testng.annotations.Test;

import element_Repository.AddAddressPom;
import element_Repository.AddOfficeAddressInvalidPom;
import element_Repository.AddOfficeAddressValidPom;
import element_Repository.AddToMyLikesPom;
import element_Repository.AddToWishListPom;
import element_Repository.AddWishListToCartPom;
import element_Repository.CheckWishListPom;
import element_Repository.CheckoutCODPom;
import element_Repository.DeleteAddressPom;
import element_Repository.DeleteFromMyLikesPom;
import element_Repository.DeleteFromWishListPom;
import element_Repository.DeliverablePincodesListPom;
import element_Repository.EditProfilePom;
import element_Repository.HelpChatPom;
import element_Repository.IncreaseAndDecreaseQuantityPom;
import element_Repository.MensAddToCartPom;
import element_Repository.ModifyAddressPom;
import element_Repository.ProductDeliverableOrNotPom;
import element_Repository.ProductReviewsPom;
import element_Repository.SearchPom;
import generic_Library.BaseTest;

public class ExecutablePom extends BaseTest
{
	@Test(priority=1)
	public void AddAddressExe()
	{
		AddAddressPom aap=new AddAddressPom(driver);
		aap.getAccountButton().click();
		aap.getMyprofileoption().click();
		aap.getMyaddressestab().click();
		aap.getAddaddressbluebutton().click();
		aap.getHometyperadiobutton().click();
		aap.getName().sendKeys("Amy Martin");
		aap.getHomeorofficeinfo().sendKeys("Bona Vista Terrace");
		aap.getStreetinfo().sendKeys("Moore Ave");
		aap.getLandmark().sendKeys("Lake Monroe");
		aap.getCountry().sendKeys("USA");
		aap.getState().sendKeys("Washington");
		aap.getCity().sendKeys("Olympia");
		aap.getPincode().sendKeys("34589");
		aap.getPhonenumber().sendKeys("3458767890");
		aap.getAddaddressbutton().click();
	}
	@Test(priority=2)
	public void AddOfficeAddressValid()
	{
		AddOfficeAddressValidPom ofv=new AddOfficeAddressValidPom(driver);
		ofv.getAccountButton().click();
		ofv.getMyprofileoption().click();
		ofv.getMyaddressestab().click();
		ofv.getAddaddressbluebutton().click();
		ofv.getHometyperadiobutton().click();
		ofv.getName().sendKeys("James McDougal");
		ofv.getHomeorofficeinfo().sendKeys("Palm Groove Enclave");
		ofv.getStreetinfo().sendKeys("McLoed Rd");
		ofv.getLandmark().sendKeys("Embassy Suites");
		ofv.getCountry().sendKeys("USA");
		ofv.getState().sendKeys("New York");
		ofv.getCity().sendKeys("Coopers Town");
		ofv.getPincode().sendKeys("67534");
		ofv.getPhonenumber().sendKeys("5467893245");
		ofv.getAddaddressbutton().click();
	}
	@Test(priority=3)
	public void  AddOfficeAddressInvalid()
	{
		AddOfficeAddressInvalidPom ofiv=new AddOfficeAddressInvalidPom(driver);
		ofiv.getAccountButton().click();
		ofiv.getMyprofileoption().click();
		ofiv.getMyaddressestab().click();
		ofiv.getAddaddressbluebutton().click();
		ofiv.getHometyperadiobutton().click();
		ofiv.getName().sendKeys("James McDougal");
		ofiv.getHomeorofficeinfo().sendKeys("Palm Groove Enclave");
		ofiv.getStreetinfo().sendKeys("McLoed Rd");
		ofiv.getLandmark().sendKeys("Embassy Suites");
		ofiv.getCountry().sendKeys("USA");
		ofiv.getState().sendKeys("New York");
		ofiv.getCity().sendKeys("Coopers Town");
		ofiv.getPincode().sendKeys("675");
		String str = ofiv.getErrormessage().getText();
		System.out.println("The error message is: "+str);
	}
	@Test(priority=4)
	public void AddToMyLikes() throws InterruptedException
	{
		AddToMyLikesPom atm=new AddToMyLikesPom(driver);
		atm.getAccountButton().click();
		atm.getMyprofileoption().click();
		atm.getMylikestab().click();
		atm.getCategorydropdown().sendKeys("Women");
		Thread.sleep(3000);
		atm.getCategorytypedropdown().sendKeys("Top");
		Thread.sleep(3000);
		atm.getSubmitbutton().click();
		atm.getAccountButton().click();
		atm.getMylikesoption().click();
		Thread.sleep(3000);
	}
	@Test(priority=5)
	public void AddToWishlist() 
	{
		AddToWishListPom atw=new AddToWishListPom(driver);
		atw.getWomenstab().click();
		atw.getWomenForeever21().isSelected();
		atw.getRedheart().click();
		atw.getAccountButton().click();
		atw.getWishlistoption().click(); 
	}
	@Test(priority=6)
	public void WishlistToCart()
	{
		AddWishListToCartPom awc=new AddWishListToCartPom(driver);
		awc.getAccountButton().click();
		awc.getWishlistoption().click();
		awc.getWomensleopardshirt().isSelected();
		awc.getWishlisttocart().click();
		awc.getCarticon().click();
	}
	@Test(priority=7)
	public void CODCheckout() throws InterruptedException
	{
		CheckoutCODPom cod=new CheckoutCODPom(driver);
		cod.getElectronicstab().click();
		cod.getSamsungflipphone().click();
		cod.getAddtocartbutton().click();
		cod.getCarticon().click();
		cod.getBuynowbutton().click();
		Thread.sleep(3000);
		cod.getChooseaddressradiobutton().click();
		cod.getProceedbutton().click();
		cod.getCODradiobutton().click();
		cod.getPaymentmethodproceedbutton().click();
		String str = cod.getOrderconfirmedmessage().getText();
		System.out.println("The confirmation message is: "+str);
	}
	@Test(priority=8)
	public void CheckWishlist()
	{
		CheckWishListPom cwl=new CheckWishListPom(driver);
		cwl.getAccountButton().click();
		cwl.getWishlist().click();
	}

	@Test(priority=9)
	public void DeleteAddress() throws InterruptedException
	{
		DeleteAddressPom dap=new DeleteAddressPom(driver);
		dap.getAccountButton().click();
		dap.getMyprofileoption().click();
		dap.getMyaddressestab().click();
		Thread.sleep(3000);
		dap.getSelectedaddress().isSelected();
		dap.getDeleteicon().click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}
	@Test(priority=10)
	public void DeleteFromMylikes()
	{
		DeleteFromMyLikesPom dfm=new DeleteFromMyLikesPom(driver);
		dfm.getAccountButton().click();
		dfm.getMyprofileoption().click();
		dfm.getMylikestab().click();
		dfm.getWomencategory().isSelected();
		dfm.getCrossicon().click();
		String str = dfm.getToastermessage().getText();
		System.out.println("The toaster message is: "+str);

	}
	@Test(priority=11)
	public void DeleteFromWishlist()
	{
		DeleteFromWishListPom dwl=new DeleteFromWishListPom(driver);
		dwl.getAccountButton().click();
		dwl.getWishlistoption().click();
		dwl.getLipcrayon().isSelected();
		dwl.getDeletefromwishlist().click();
		driver.switchTo().alert().accept();
	}
	@Test(priority=12)
	public void DeliverablePincodes()
	{
		DeliverablePincodesListPom dp = new DeliverablePincodesListPom(driver);
		dp.getHelpcenter().click();
		dp.getDeliverablepintab().click();
	}
	@Test(priority=13)
	public void EditProfile()
	{
		EditProfilePom ep=new EditProfilePom(driver);
		ep.getAccountButton().click();
		ep.getMyprofileoption().click(); 
		ep.getEditprofilebutton().click();
		ep.getLastname().clear();
		ep.getLastname().sendKeys("Nambi");
		ep.getSubmitbutton().click();
		driver.switchTo().alert().accept();

	}
	@Test(priority=14)
	public void HelpChat() throws InterruptedException
	{
		HelpChatPom hc=new HelpChatPom(driver);
		hc.getChaticon().click();
		hc.getDeliveryissuestopic().click();
		hc.getEnterquery().sendKeys("Track package");
		hc.getEnterlogo().click();
		hc.getEnterquery().clear();
		Thread.sleep(3000);
		hc.getEnterquery().sendKeys("5672348945");
		hc.getEnterlogo().click();
		hc.getEnterquery().clear();
		Thread.sleep(3000);
		hc.getEnterquery().sendKeys("abc@gmail.com");
		hc.getEnterlogo().click();
		hc.getEnterquery().clear();
		Thread.sleep(3000);
		hc.getEnterquery().sendKeys("14-05-2024");
		hc.getEnterlogo().click();
		hc.getEnterquery().clear();
		Thread.sleep(3000);
		hc.getEnterquery().sendKeys("03:40");
		hc.getEnterlogo().click();
		String str = hc.getResult().getText();
		System.out.println("The final message: "+str);

	}
	@Test(priority=15)
	public void IncreaseanddecreaseQty() throws InterruptedException
	{
		IncreaseAndDecreaseQuantityPom idp=new IncreaseAndDecreaseQuantityPom(driver);
		idp.getCarticon().click();
		Thread.sleep(10000);
		idp.getSelectproduct().isSelected();
		idp.getIncreasequantity().click();
		idp.getDecreasequantity().click();


	}
	@Test(priority=16)
	public void AddToCart()
	{
		MensAddToCartPom atc=new MensAddToCartPom(driver);
		atc.getMens().click();
		atc.getLevitee().click();
		atc.getAddtocart().click();
		atc.getCarticon().click();
	}
	@Test(priority=17)
	public void EditAddress() throws InterruptedException
	{
		ModifyAddressPom map=new ModifyAddressPom(driver);
		map.getAccountButton().click();
		map.getMyprofileoption().click();
		map.getMyaddressestab().click();
		map.getSelectaddress().isSelected();
		map.getEditaddressicon().click();
		map.getLandmark().clear();
		Thread.sleep(5000);
		map.getLandmark().sendKeys("Target");
		map.getUpdateaddressbutton().click();
		Thread.sleep(4000);
		String str = map.getToastermessage().getText();
		System.out.println("The toaster message is: "+str);
	}
	@Test(priority=18)
	public void DeliveryCheck()
	{
		ProductDeliverableOrNotPom pd=new ProductDeliverableOrNotPom(driver);
		pd.getBeautytab().click();
		pd.getMattelipstick().click();
		pd.getZipcode().sendKeys("567432");
		pd.getDeliverableornot().click();
		String str = pd.getDeliverystatus().getText();
		System.out.println("The product is : "+str);
	}
	@Test(priority=19)
	public void ProductReviews() throws InterruptedException
	{
		ProductReviewsPom pr=new ProductReviewsPom(driver);
		pr.getCarticon().click();
		Thread.sleep(5000);
		pr.getSelectproduct().isSelected();
		pr.getProductreviews().click();
		Thread.sleep(5000);
	}
	@Test(priority=20)
	public void Search() throws InterruptedException
	{
		SearchPom sp=new SearchPom(driver);
		sp.getSearchcategory().sendKeys("Women");
		sp.getSearchtextbox().click();
		sp.getSearchtextbox().click();
		sp.getSearchtextbox().sendKeys("women top");
		sp.getSearchicon().click();
		Thread.sleep(5000);
	}
}
