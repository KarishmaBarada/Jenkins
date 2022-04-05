package com.gcr.or;

import org.openqa.selenium.By;

public class Productpage {
	
	//public static By lnkDropdown = By.linkText("Dropdown");
	//public static By txtDropdown= By.xpath("//select[@id='products-orderby']");
	//public static By ddDropdown = By.id("products-orderby");
	public static By imgproduct = By.xpath("//img[@title='Show details for Computing and Internet']");
	public static By btnAddtoCart = By.xpath("//input[@id='add-to-cart-button-13']");

	public static By btnEmailaFriend =By.xpath("//input[@value='Email a friend']");
	public static By txtEmailFriend =By.xpath("//input[@id='FriendEmail']");
	public static By txtYourEmail=By.xpath("//input[@id='YourEmailAddress']");
	public static By tamsg=By.xpath("//textarea[@id='PersonalMessage']");
	public static By btnsendEmail=By.xpath("//input[@name='send-email']");
	public static By textproduct = By.xpath("//h1[@itemprop='name']"); 
		public static By lnkShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

}
