package intro.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BCP\\eclipse-workspace\\Sele\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		

		
				
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		WebElement drp=driver.findElement(By.name("passCount"));
		Select s1=new Select(drp);
		s1.selectByValue("1");
		Select s2=new Select(driver.findElement(By.name("fromPort")));
		s2.selectByVisibleText("New York");
		Select s3=new Select(driver.findElement(By.name("toMonth")));
		s3.selectByVisibleText("May");
		Select s4=new Select(driver.findElement(By.name("toDay")));
		s4.selectByValue("17");
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Select s5=new Select(driver.findElement(By.name("airline")));
		s5.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.name("findFlights")).click();
		
		
	}

}
