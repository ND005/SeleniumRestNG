package com.testing.ui.stepdefinition;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.testing.ui.pom.login_Form;
import com.testing.ui.pom.ui_navigations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_UserProfile {
	TestUtil utilTest = new TestUtil();
	private WebDriver driver = TestUtil.getDriver();
	Properties prop = new Properties();

	ui_navigations UIFlow = new ui_navigations(driver);
	login_Form loginForm = new login_Form(driver);

	File files = new File("src/test/resources/basicRessources/basicResouces.properties");

	@Given("Launch and navigate to AEC application UI")
	public void launch_to_aec_application_ui_01() throws IOException {
		InputStream stream = new FileInputStream(files);
		prop.load(stream);
		driver.get(prop.getProperty("BaseTestURL"));
	}

	@When("Verify the home screen and navigate signup screen")
	public void verify_the_home_screen_type01() {
		Assert.assertTrue("[ERROR] : Step  1:-  Navigate to home screen & Then Login screen",
				UIFlow.navigateToHomeScreen(driver) && UIFlow.navigateToLoginScreen(driver));
	}

	@When("Verify the home screen and navigate login screen")
	public void verify_the_home_screen_type02() {
		Assert.assertTrue("[ERROR] : Step  1:-  Navigate to home screen & Then Login screen",
				UIFlow.navigateToHomeScreen(driver) && UIFlow.navigateToLoginScreen(driver));
	}

	@When("Verify the home screen")
	public void verify_the_home_screen_type03() {
		Assert.assertTrue("[ERROR] : Step 1:- Navigate to home screen", UIFlow.navigateToHomeScreen(driver));
	}

	@And("Create an account with details provided in test files")
	public void create_an_account() {
		String Test_Name = null;
		String Test_mailID = null;
		Assert.assertTrue("[ERROR] : Step 2:- Verify Login UI ", loginForm.new_UserData(Test_Name, Test_mailID));
	}

	@Then("Verify the account creation form and its fields")
	public void verify_the_account_creation_form_and_its_fields() {

	}

	@Then("Verify the profile creation with confirmation messagae")
	public void verify_the_profile_creation_with_confirmation_messagae() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("^Verify login functionality with (.*) and (.*) details$")
	public void verify_login_functionality_of_created_data(String email, String password) {
		Assert.assertTrue("[ERROR] : Step 2:- Verify Login UI ", loginForm.login_UserData(email, password));
	}

	@Then("Delete the profile and verify the delete action with confirmation messagae")
	public void delete_the_profile_and_verify_the_delete_action_with_confirmation_messagae() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
