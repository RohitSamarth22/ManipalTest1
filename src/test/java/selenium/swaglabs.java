package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabs {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		driver.findElement(By.id("shopping_cart_container")).click();
		
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("remove-sauce-labs-onesie")).click();
		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		
		driver.findElement(By.xpath("//*[@data-test='continue-shopping']")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		driver.findElement(By.id("shopping_cart_container")).click();
		
		driver.findElement(By.xpath("//*[@data-test='checkout']")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("rohit");
		driver.findElement(By.id("last-name")).sendKeys("sammy");
		driver.findElement(By.id("postal-code")).sendKeys("444555");
		
		driver.findElement(By.id("continue")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@class='title']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("(//*[@class='summary_info_label'])[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("(//*[@class='summary_info_label'])[2]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("(//*[@class='summary_info_label'])[3]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@class='summary_info_label summary_total_label']")).isDisplayed());
		
		driver.findElement(By.id("finish")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@class='complete-header']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@class='complete-text']")).isDisplayed());
		System.out.println(driver.findElement(By.name("back-to-products")).isDisplayed());
		
	}

}