package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("pass")).sendKeys("rrr");
		driver.findElement(By.name("email")).sendKeys("rrr@gmail.com");
		driver.findElement(By.name("login")).click();
	}

}
