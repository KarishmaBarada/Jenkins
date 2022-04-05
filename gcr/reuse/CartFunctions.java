package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.or.Cartpage;
//import com.gcr.or.Cartpage;
import com.gcr.or.Homepage;

import com.gcr.or.Productpage;
import com.gcr.wdcmds.ActionDriver;

public class CartFunctions {
	
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public CartFunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	} 
	public void selectCategory() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("select category of the product ");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.mouseHover(Homepage.lnkBooks, "Books link");
		aDriver.click(Homepage.lnkBooks, "Books link");
	
		
	}
	public String addProductToCart() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Add a product to cart ");
		//aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		//aDriver.click(Productpage.lnkDropdown,"Dropdown link");
		//aDriver.selectByVisibleText(Productpage.ddDropdown,"Price: Low to High","Dropdown");
		aDriver.click(Productpage.imgproduct,"Product Image");
		aDriver.click(Productpage.btnAddtoCart,"Add to cart button");
	    aDriver.click(Productpage.btnEmailaFriend,"Email a Friend");
		aDriver.type(Productpage.txtEmailFriend, "mohapatra258@gmail.com", "Text Email Friend");
		aDriver.type(Productpage.txtYourEmail,"karishma234@gmail.com","Text your Email" );
		aDriver.type(Productpage.tamsg, "Hii,it's a new book recommended for you", "Text Area");
		aDriver .click(Productpage.btnsendEmail, "Send Email");
		String pName = aDriver.getText(Productpage.textproduct, "Name of the product");
		aDriver.click(Productpage.textproduct, "Name of the product");
		aDriver.click(Productpage.lnkShoppingCart, "Shopping cart link");
	   return pName;
		 
		
	}
	public String cartProductName() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product from the cart");
		String cName=aDriver.getText(Cartpage.lnkProductName, "get product name from the cart");
		return cName ;
		
	} 
	
}
