package org.Manipal.demomain;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseConfigurataionsDemoWebsite {
	@Test
	public WebDriver getDriver1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		return driver;
	}

}
