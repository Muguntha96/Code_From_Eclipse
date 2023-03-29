package sample.org;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Statictable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		WebElement table = driver.findElement(By.className("tg"));
		 List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"post-9373\"]/div/div/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/table/tbody/tr[1]"));
	System.out.println("No of columns :"+columns.size());
	List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"post-9373\"]/div/div/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/table/tbody/tr"));
	System.out.println("No of rows :"+rows.size());
	WebElement row = table.findElement(By.xpath("//*[@id=\"post-9373\"]/div/div/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/table/tbody/tr[3]"));
	WebElement standard = row.findElement(By.xpath("//*[@id=\"post-9373\"]/div/div/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/table/tbody/tr[3]/td[3]/input"));
	standard.click();
	WebElement premium = row.findElement(By.xpath("//*[@id=\"post-9373\"]/div/div/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/table/tbody/tr[3]/td[4]/input"));
	premium.click();
	Select type=new Select(row.findElement(By.xpath("//*[@id=\"post-9373\"]/div/div/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/table/tbody/tr[3]/td[5]/select")));
	type.selectByVisibleText("Sports");
	WebElement comments = row.findElement(By.xpath("(//input[@type='text'])[2]"));
	comments.sendKeys("He is a sports person");
	System.out.println("Datas filled in the webtable");
		

}
}

