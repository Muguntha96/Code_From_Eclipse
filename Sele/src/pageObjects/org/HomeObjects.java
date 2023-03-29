package pageObjects.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeObjects {
	//username,password,submit
	
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("userName"));

	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));

	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.name("submit"));

	}
	

}
