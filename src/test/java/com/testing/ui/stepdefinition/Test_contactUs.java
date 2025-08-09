package com.testing.ui.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.testing.ui.pom.contact_us;
import com.testing.ui.pom.login_Form;
import com.testing.ui.pom.ui_navigations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Test_contactUs {

	TestUtil utilTest = new TestUtil();
	private WebDriver driver = TestUtil.getDriver();
	ui_navigations UIFlow = new ui_navigations(driver);
	login_Form loginForm = new login_Form(driver);
	contact_us contact = new contact_us(driver);

	@Then("^Login to user profile using (.*) and (.*) details$")
	public void login_to_user_profile_without_logout(String email, String password) throws Throwable {
		Assert.assertTrue("[ERROR] : Step 1:- Verify Login UI", loginForm.login_UserData(email, password));
		Thread.sleep(5000);
		Assert.assertTrue("[ERROR] : Step 2:- Verify Home screen after Login", UIFlow.ui_after_login());
	}

	@And("Verify all featurs in contact us UI")
	public void verify_all_featurs_in_contact_us() {
		try {
			Assert.assertTrue("[ERROR] : Step 3:- Verify contact us button ", UIFlow.navigateToContact_us());
			Thread.sleep(5000);
			Assert.assertTrue("[ERROR] : Step 4:- Verify all featurs in contact us ",
					contact.Verify_Contact_us_featurs());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@And("Verify all featurs functionality in conatact us UI")
	public void verify_all_featurs_functionality_in_conatact_us() {
		try {
			Assert.assertTrue("[ERROR] : Step 5:- Verify all featurs functionality in contact us ",
					contact.Verify_Contact_us_functionality());
			Thread.sleep(5000);
			Assert.assertTrue("[ERROR] : Step 6:- Verify success popup", contact.verify_succces_status());
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
