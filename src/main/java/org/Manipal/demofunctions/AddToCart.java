package org.Manipal.demofunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
    WebDriver driver;
	
	public AddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	@FindBy(xpath="//a[@href='/computers']")
	public WebElement computer;
	
	@FindBy(xpath=("(//a[@href='/desktops'])[1]"))
	public WebElement desktop;
	
	@FindBy(xpath="//input[@value='Add to cart'][1]")
	public WebElement addToCart;
	
	public void clicking() {
//		computer.click();
//		desktop.click();
		Actions act = new Actions(driver);
		act.moveToElement(computer).click(desktop).build().perform();
		addToCart.click();
	}

}