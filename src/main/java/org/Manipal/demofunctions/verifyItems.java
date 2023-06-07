package org.Manipal.demofunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyItems {
	
    WebDriver driver;
	
	public verifyItems(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	@FindBy(xpath="//img[@src='/Themes/DefaultClean/Content/images/logo.png']")
	public WebElement verifyDemoLogo;
	
	@FindBy(xpath="//*[text()='Register']")
	public WebElement verifyRegister;
	
	@FindBy(xpath="//*[text()='Log in']")
	public WebElement verifyLogin;
	
	@FindBy(xpath="//*[text()='Shopping cart']")
	public WebElement verifyCart;
	
	@FindBy(xpath="//*[text()='Wishlist']")
	public WebElement verifyWishlist;
		
	public void verifyDetails() {
		System.out.println(verifyDemoLogo.isDisplayed());
		System.out.println(verifyRegister.isDisplayed());
		System.out.println(verifyLogin.isDisplayed());
		System.out.println(verifyCart.isDisplayed());
		System.out.println(verifyWishlist.isDisplayed());
		}
	

}