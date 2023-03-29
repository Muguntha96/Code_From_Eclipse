package intro.org;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.org.HomeObjects;

public class Home {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BCP\\eclipse-workspace\\Sele\\Drivers\\chromedriver.exe");
		//we have to give this driver to pageobjects
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
		HomeObjects.username(driver).sendKeys("muguntharamkumar1996@gmail.com");
		HomeObjects.password(driver).sendKeys("Muguntha@17");
		HomeObjects.submit(driver).click();
		
		
		
		
		
		
		
	}

}
