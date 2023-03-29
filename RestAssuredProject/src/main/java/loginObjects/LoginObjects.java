package loginObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {

	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("userName"));

	}
	public static WebElement password(WebDriver driver) {
		
		return driver.findElement(By.id("password"));

	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.id("login"));

	}
}
