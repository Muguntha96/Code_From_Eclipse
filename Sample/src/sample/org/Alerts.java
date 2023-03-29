package sample.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("12344");
	driver.findElement(By.name("submit")).click();
	Alert alert=driver.switchTo().alert();
	String delete = driver.switchTo().alert().getText();
	System.out.println(delete);
	alert.accept();
	
	
	
}
}
