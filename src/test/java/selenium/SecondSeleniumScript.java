package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondSeleniumScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Resume 2023\\Com Axis\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https:www.amazon.in");
	}

}