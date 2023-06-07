package org.Manipal.test;

import org.Manipal.demofunctions.AddToCart;
import org.Manipal.demofunctions.verifyAddToCart;
import org.Manipal.demofunctions.verifyItems;
import org.Manipal.demomain.BaseConfigurataionsDemoWebsite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testCasesDemoWebsite extends BaseConfigurataionsDemoWebsite{

	public verifyItems verifyItemsObj;
	public AddToCart addToCartObj;
	public verifyAddToCart verifyAddToCartObj;
	WebDriver driver;
	
	@BeforeClass
	public void initialSetup() {
		driver = getDriver1();
		verifyItemsObj = new verifyItems(driver);
		addToCartObj = new AddToCart(driver);
		verifyAddToCartObj = new verifyAddToCart(driver);
	}
	
	@Test
	public void scenario() {
		verifyItemsObj.verifyDetails();
		addToCartObj.clicking();
		verifyAddToCartObj.verifyAddToCartfinal();
	}
}
