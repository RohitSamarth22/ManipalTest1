package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoRadio {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		System.out.println(driver.findElement(By.id("vfb-6-0")).isEnabled());
		driver.findElement(By.id("vfb-7-1")).click();
		driver.findElement(By.id("vfb-6-0")).click();
		System.out.println(driver.findElement(By.id("vfb-6-0")).isSelected());		
	}
}
