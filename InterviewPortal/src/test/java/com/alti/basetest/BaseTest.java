package com.alti.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alti.utilitypages.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	public Pages getPages(){
		return new Pages(driver);
	}
	
}
