package com.alti.utilitypages;
import org.openqa.selenium.WebDriver;
import com.alti.pages.LoginPage;


public class Pages {
	
	private WebDriver driver;

	public Pages(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage loginPage() {
		return new LoginPage(driver);
	}


}
