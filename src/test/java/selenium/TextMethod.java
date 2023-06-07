package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		
		driver.findElement(By.xpath("//*[text()='Forgot password?']")).click();
		
		
		
	}
}