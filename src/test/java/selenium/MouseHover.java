package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		Actions obj = new Actions(driver);
		obj.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick(driver.findElement(By.xpath("(//*[text()='Your Account'])[2]"))).build().perform();
	}

}
