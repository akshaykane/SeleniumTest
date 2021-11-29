package com.selenium.tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.basetest.BaseTest;

public class Select4thOptionFromGoogleSearchSuggestions extends BaseTest{
	
  @Test
  public void select4thOptionFromGoogleSearchSuggestions() throws InterruptedException {
	  
	  WebElement googleSearchInputField = driver.findElement(By.xpath("//input[@title='Search']"));
	  
	  googleSearchInputField.sendKeys("Selenium");
	  
	  Thread.sleep(3000);
	  
	  List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox'][1]/li/div/div/div[1]/span"));
	  
	  suggestionList.get(3).click();
	  
  }
  
}
