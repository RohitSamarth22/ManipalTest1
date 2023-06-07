package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		
//		driver.findElement(By.linkText("BMI")).click();
//		driver.findElement(By.partialLinkText("Conception")).click();
		
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys("22");
		driver.findElement(By.id("cheightfeet")).clear();
		driver.findElement(By.id("cheightfeet")).sendKeys("5");
		driver.findElement(By.id("cheightinch")).clear();
		driver.findElement(By.id("cheightinch")).sendKeys("8");
		driver.findElement(By.name("cpound")).clear();
		driver.findElement(By.name("cpound")).sendKeys("169");
		
		
		
	}

}