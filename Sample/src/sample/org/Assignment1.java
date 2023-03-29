package sample.org;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	static String values="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
	static String url1="http://qatechhub.com";
	static String url2="https://www.w3schools.blog/ignore-test-junit";
	ChromeDriver driver;
	
	public void tech() {
		

	 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qatechhub.com");
		String title = driver.getTitle();
		if (title.equals(values)) {
			System.out.println("Test pass");
			
		} else {
			System.out.println("Test fail");

		}
	

}   
	public  void form() {
		try {
			driver.navigate().to("url2");
			driver.navigate().back();
			System.out.println(driver.getCurrentUrl());
	        driver.navigate().forward();
	        driver.navigate().refresh();
			
		} catch (NullPointerException e) {
			System.out.println("No Exception");
		}
		driver.close();
		
        
	}
	public static void main(String[] args) {
		Assignment1 assign = new Assignment1();
		assign.tech();
		assign.form();
		
		
	}
}