package intro.org;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Exe01 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BCP\\eclipse-workspace\\Sele\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		String title1 = driver.getTitle();
		System.out.println(driver.getTitle());
		String title="Welcome: Mercury Tours";
		if (title.contentEquals(title1)) {
			System.out.println("passed");
		} else {
			System.out.println("Failed");
		}
		
		WebElement reg = driver.findElement(By.linkText("REGISTER"));
		reg.click();
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Muguntha");
		driver.findElement(By.name("lastName")).sendKeys("Ramkumar");
		driver.findElement(By.name("phone")).sendKeys("9583044112");
		driver.findElement(By.id("userName")).sendKeys("muguntharamkumar1996@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("west street,alathur");
		driver.findElement(By.name("city")).sendKeys("Pattukkottai");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamil nadu");
		driver.findElement(By.name("postalCode")).sendKeys("123434");
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("muguntharamkumar1996@gmail.com");
		driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("Muguntha@17");
		driver.findElement(By.name("confirmPassword")).sendKeys("Muguntha@17");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	

}
