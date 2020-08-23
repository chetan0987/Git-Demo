package com.ramco.stepdefinition;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class StepDefinition {
	@Given("validate the browser")
	public void validate_the_browser() {
		System.out.println("Broser is validated");
	}

	@When("browser is triggered")
	public void browser_is_triggered() {
		System.out.println("Browser is triggered");

	}

	@Then("dafault page logged in")
	public void dafault_page_logged_in() {
		System.out.println("default page logged in");

	}
	
	@Given("^users should be at login page$")
	public void users_should_be_at_login_page() {
		System.out.println("inside login page");

	}

	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String username, String password) {

		if(username.equals("chetan")) {
			System.out.println("correct credentials");
		}
		else {
			System.out.println("wrong credentials");
		}
	}

	@Then("^home page is populated$")
	public void home_page_is_populated() {
		System.out.println("home page is populated");
	
	}

	@Then("^All cards are displayed$")
	public void all_cards_are_displayed() {
		System.out.println("All cards are displayed");
	
	}
	@When("^user signup with following details$")
	public void user_signup_with_following_details(DataTable data) {
		List<String> list=data.asList();
            System.out.println(list.get(4));
	}
	
	@When("^user signin with following credentials (.*) and (.*)$")
	public void user_signin_with_following_credentials(String username,String password) {
	   System.out.println(username);
	   System.out.println(password);
	}




    
}
