package com.alti.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "user-name")
	private WebElement usernameField;
	
	@FindBy(id = "password")
	private WebElement passwordField;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;	
	
		
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginButton(){
		loginButton.click();		
	}
	
	public void setUsernameFieldValue(String username){	
		usernameField.clear();
		usernameField.sendKeys(username);
	}
	
	public void setPasswordFieldValue(String password){
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public void waitForElement(WebElement webEle){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(webEle));
		
	}
	

}
