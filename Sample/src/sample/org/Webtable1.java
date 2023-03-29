package sample.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		//to fetch the rows
		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));
		System.out.println("No of col :"+col.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		System.out.println("No of rows :"+rows.size());
		WebElement table=driver.findElement(By.id("customers"));
		WebElement rowstext = table.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[7]"));
		String text = rowstext.getText();
		System.out.println(text);
		WebElement cell = table.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[6]/td[3]"));
		String text2 = cell.getText();
		System.out.println(text2);
		driver.close();
		
	}

}
