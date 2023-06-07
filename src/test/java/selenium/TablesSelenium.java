package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesSelenium {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		
		System.out.println(driver.findElement(By.xpath("//*[@id='tab1Loser']/tbody/tr[1]/td[1]")));
					
	}

}