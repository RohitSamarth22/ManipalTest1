package org.Manipal.demofunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyAddToCart {
	
    WebDriver driver;
	
	public verifyAddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	@FindBy(id="add-to-cart-button-72")
	public WebElement verifyFinalAdd;
		
	public void verifyAddToCartfinal() {
		System.out.println(verifyFinalAdd.isDisplayed());
	}
	

}
