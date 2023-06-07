package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("submit")).click();
		
		Alert obj = driver.switchTo().alert();
		obj.accept();
		System.out.println(obj.getText());
//		obj.dismiss();

	}

}
