package com.alti.stepdefinition;

import java.io.IOException;
import com.alti.basetest.BaseTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageMethods extends BaseTest{
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws IOException {
		setup();
	}

	@When("^User enters valid username$")
	public void user_enters_valid_username() {
	    getPages().loginPage().setUsernameFieldValue("standard_user");
	}

	@When("^User enters valid password$")
	public void user_enters_valid_password() {
	    getPages().loginPage().setPasswordFieldValue("secret_sauce");
	}

	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() {
	    getPages().loginPage().clickLoginButton();
	}
	
	@Then("^User closes the browser$")
	public void user_closes_the_browser() {
		teardown();
	}


}
