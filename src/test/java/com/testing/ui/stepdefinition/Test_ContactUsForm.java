package com.testing.ui.stepdefinition;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.testing.ui.pom.login_Form;
import com.testing.ui.pom.ui_navigations;
import io.cucumber.java.en.Then;

public class Test_ContactUsForm {

	TestUtil utilTest = new TestUtil();
	private WebDriver driver = TestUtil.getDriver();
	Properties prop = new Properties();
	login_Form loginForm = new login_Form(driver);
	ui_navigations UIFlow = new ui_navigations(driver);

	@Then("^Login to ACE using (.*) and (.*) profile$")
	public void verify_login_functionality_of_created_data(String email, String password) {
		try {
			Assert.assertTrue("[ERROR] : Step 1:- Navigate to Login screen", UIFlow.navigateToLoginScreen(driver));
			Assert.assertTrue("[ERROR] : Step 2:- Verify Login UI", loginForm.login_UserData(email, password));
			Thread.sleep(3000);
			Assert.assertTrue("[ERROR] : Step 3:- Verify Home screen after Login", UIFlow.ui_after_login());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Then("Verify Contact us UI and it's elements")
	public void verify_contact_us_ui_and_it_s_elements() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
