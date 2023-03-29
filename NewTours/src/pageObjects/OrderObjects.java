package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class OrderObjects {
	
	public static WebElement inputEmail;
	public static WebElement inputPassword;
	public static WebElement login;
	
	
	public static void main(String[] args) throws InterruptedException {
		
	 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\NewTours\\driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/login");
		
	PageFactory.initElements(driver,OrderObjects.class);
	inputEmail.sendKeys("mugunthadurairaj@gmail.com");
	inputPassword.sendKeys("Ramkumar@89");
	Thread.sleep(50000);
	login.click();
	
	
	
	
	}

	

	
}