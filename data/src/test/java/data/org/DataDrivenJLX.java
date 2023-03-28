package data.org;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenJLX {
	
	
	//@Test
		private void jlx(String uname,String pword) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\data\\Drivers\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys(uname);
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys(pword);
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
String actualUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
String expectedUrl = driver.getCurrentUrl();
assertEquals(expectedUrl, actualUrl);
}

}
