package loginTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import loginObjects.LoginObjects;

public class LoginTestCase {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BCP\\eclipse-workspace\\Sele\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		LoginObjects.username(driver).sendKeys("Muguntha@17");;
		LoginObjects.password(driver).sendKeys("Ramkumar@89");;
		LoginObjects.submit(driver).click();
		
		
		
		
	}
	

}
