package sample.org;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Webstable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		//to fetch the column size
		 List<WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		 System.out.println("column size is :"+col.size());
		//to fetch the row size
		
		 List<WebElement> row = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td"));
		 System.out.println("rows size is :"+row.size());

		//to fetch the particular row
		WebElement table = driver.findElement(By.className("dataTable"));
		WebElement	 tablerow = table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		String Thirdrow=tablerow.getText();
		System.out.println(Thirdrow);
		//to fetch particular cell
		WebElement cell = tablerow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		String data=cell.getText();
		System.out.println(data);
		
		
	}

}
