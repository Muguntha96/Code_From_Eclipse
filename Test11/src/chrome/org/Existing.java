package chrome.org;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Existing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Test11\\Driver1\\chromedriver.exe");

		
		//use the local host id here
		//debuggerAddress=localhost:54965
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:55353");
		
		//existing session
		ChromeDriver driver = new ChromeDriver(options);
		Capabilities capabilities = driver.getCapabilities();
		Map<String, Object> asMap = capabilities.asMap();
		asMap.forEach((key,value) ->{
			System.out.println("Key "+key+ " value "+value);
			
		});
		//driver.get("https://www.google.com/");
		driver.get("http://talentx.kgisl.com/");
		WebElement id = driver.findElement(By.id("Username"));
		id.sendKeys("muguntha.r");
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("Gamma@12345");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		login.click();
	}

}
