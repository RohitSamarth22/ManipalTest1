package org.Manipal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	
	WebDriver driver;
	
	public MenuPage(WebDriver driver) {//assign the variable on line 11 with the value that i will give from the test
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(id="nav-hamburger-menu")
	public WebElement hamburgerMenu;
	
	@FindBy(xpath="//*[text()='Mobiles, Computers']")
	public WebElement clickMobile;
	
	@FindBy(xpath="//*[text()='All Mobile Phones']")
	public WebElement allMobileLabel;
	
	public void menuNavigation() {
		hamburgerMenu.click();
		clickMobile.click();
		allMobileLabel.click();
	}

}
