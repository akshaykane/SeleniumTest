package com.selenium.tests;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.basetest.BaseTest;

public class PrintGoogleSearchSuggestionsToConsole extends BaseTest{
	
  @Test
  public void printGoogleSearchSuggestions() throws InterruptedException {
	  
	  WebElement googleSearchInputField = driver.findElement(By.xpath("//input[@title='Search']"));
	  
	  googleSearchInputField.sendKeys("Selenium");
	  
	  Thread.sleep(3000);
	  
	  List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox'][1]/li/div/div/div[1]/span"));
	  
	  Iterator<WebElement> ite = suggestionList.iterator();
	  
	  while(ite.hasNext()) {
		  System.out.println(ite.next().getText());
	  }
	  
  }
  
}
