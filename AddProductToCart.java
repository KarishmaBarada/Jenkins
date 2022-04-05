package com.gcr.scripts;

import org.testng.Assert; 
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CartFunctions;



public class AddProductToCart extends StartBrowser{
	  @Test
	  public void AddProductToCartTestCase() throws Exception {
		  CartFunctions cfs = new CartFunctions();
		  cfs.selectCategory();
		 // cfs.addProductToCart();
		
		 
		 String pName=cfs.addProductToCart();
		 String cName=cfs.cartProductName();
		 Assert.assertEquals(cName,pName); 
		  Thread.sleep(9000);
	  }
}
