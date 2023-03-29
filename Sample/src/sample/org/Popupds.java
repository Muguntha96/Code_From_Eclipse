package sample.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Popupds {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		String main=driver.getWindowHandle();//main window--
		Set<String> multi = driver.getWindowHandles();//child windows--
		Iterator<String> i1=multi.iterator();//to iterate like for each loop
		
		while (i1.hasNext()) {
			String child=i1.next();
			if (!main.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("muguntharamkumar1996@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				
				driver.close();
				
			
		}
		}
		driver.switchTo().window(main);
		}
	}


