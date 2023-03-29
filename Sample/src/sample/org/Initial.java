package sample.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Initial {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		System.out.println(driver.getTitle());
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("Muguntha");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Ramkumar");
		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
		gender.click();
		WebElement exp = driver.findElement(By.id("exp-3"));
		exp.click();
		
		driver.findElement(By.id("datepicker")).sendKeys("08/24/2022");
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		Select continents=new Select(driver.findElement(By.name("continents")));
		continents.selectByVisibleText("Australia");
		driver.findElement(By.id("submit")).click();
	
	}

}
