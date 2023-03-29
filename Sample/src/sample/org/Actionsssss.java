package sample.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsssss {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source1=driver.findElement(By.id("credit2"));
		WebElement target1=driver.findElement(By.className("placeholder"));
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target2 = driver.findElement(By.id("amt7"));
		Actions actn=new Actions(driver);
		actn.dragAndDrop(source1, target1).build().perform();
		actn.dragAndDrop(source2, target2).build().perform();
		
		
		
		
	}

}
