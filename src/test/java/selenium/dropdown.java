package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Select sel = new Select(driver.findElement(By.name("country")));
		
		sel.selectByValue("CUBA");
		
		sel.selectByVisibleText("INDIA");
		
		sel.selectByIndex(4);
		
	}

}