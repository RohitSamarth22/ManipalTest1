package org.Manipal.test;

import org.Manipal.base.BaseConfigurataion;
import org.Manipal.pageObjects.HomePage;
import org.Manipal.pageObjects.MenuPage;
import org.Manipal.pageObjects.MobilePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testCases extends BaseConfigurataion{

	public HomePage homeObj;
	public MenuPage menuObj;
	public MobilePage mobileObj;
	WebDriver driver;
	
	@BeforeClass
	public void initialSetup() {
		driver = getDriver();
		homeObj = new HomePage(driver);
		menuObj = new MenuPage(driver);
		mobileObj = new MobilePage(driver);
	}
	
	@Test
	public void scenario() {
		homeObj.verifyHomeLaunchSuccess();
		menuObj.menuNavigation();
		mobileObj.verifyMobileHeader();
	}
}
