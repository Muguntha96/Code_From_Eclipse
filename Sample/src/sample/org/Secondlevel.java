package sample.org;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Secondlevel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pcs-dev-20i.firebaseapp.com/");
        System.out.println(driver.getTitle());
     WebElement  accnt=driver.findElement(By.xpath("//input[@type='text']"));
	    accnt.sendKeys("10000016");
	    WebElement pin = driver.findElement(By.xpath("//input[@type='password']"));
        pin.sendKeys("1234");
        driver.findElement(By.xpath("(//div[@role='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//div[@aria-checked='true'])[2]")).click();
	driver.findElement(By.partialLinkText("Sign ")).click();
	
	
	
	
	
	
	
	
	
	
	
	}

}
