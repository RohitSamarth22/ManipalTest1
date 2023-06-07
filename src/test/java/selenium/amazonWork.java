package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonWork {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.findElement(By.id("nav-link-accountList")).isDisplayed());
		WebElement clickOn=driver.findElement(By.id("nav-hamburger-menu"));
		clickOn.click();
		WebElement clickOn1=driver.findElement(By.xpath("//*[text()='Mobiles, Computers']"));
		clickOn1.click();
		System.out.println(driver.findElement(By.xpath("//*[text()='Mobiles, Computers']")).isDisplayed());
		WebElement clickOn2=driver.findElement(By.xpath("//*[text()='All Mobile Phones']"));
		clickOn2.click();
 		System.out.println(driver.findElement(By.xpath("//*[text()='Mobiles & Accessories'][2]")).isDisplayed());
		
	}

}
