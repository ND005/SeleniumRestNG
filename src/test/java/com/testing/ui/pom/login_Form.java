package com.testing.ui.pom;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import com.testing.ui.pathLocators.Login_UI;
import com.testing.ui.pathLocators.sigup_form_UI;
import com.testing.ui.stepdefinition.TestUtil;

public class login_Form {
	private Login_UI loginUI;
	private sigup_form_UI sigup_form_UI;
	TestUtil utilTest = new TestUtil();

	public login_Form(WebDriver driver) {
		this.loginUI = new Login_UI(driver);
		this.sigup_form_UI = new sigup_form_UI(driver);
	}

	public boolean new_UserData(String userName, String email) {
		if (loginUI.signup_Usermail().isDisplayed() && loginUI.signup_Name().isDisplayed()) {
			loginUI.signup_Usermail().sendKeys(email);
			loginUI.signup_Name().sendKeys(userName);
			loginUI.signup__Btn().click();
			return true;
		}
		return false;
	}

	public boolean login_UserData(String email, String password) {
		try {
			loginUI.loginUserName().sendKeys(email);
			loginUI.loginPassword().sendKeys(password);
			loginUI.login_Btn().click();
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return false;
	}

	public boolean inputTypeText(HashMap<String, String> values) {
		// Send password

		if (sigup_form_UI.inputPassword().isDisplayed() && sigup_form_UI.inputFirstName().isDisplayed()
				&& sigup_form_UI.inputLastName().isDisplayed() && sigup_form_UI.inputCompanyName().isDisplayed()
				&& sigup_form_UI.inputAddress_1().isDisplayed() && sigup_form_UI.inputAddress_2().isDisplayed()
				&& sigup_form_UI.inputCity().isDisplayed() && sigup_form_UI.inputState().isDisplayed()
				&& sigup_form_UI.inputZipcode().isDisplayed()) {
			sigup_form_UI.gender(values.get("Title")).click();
			sigup_form_UI.inputPassword().sendKeys(values.get("Password"));
			sigup_form_UI.inputFirstName().sendKeys(values.get("First Name"));
			sigup_form_UI.inputLastName().sendKeys(values.get("Last Name"));
			sigup_form_UI.DOB(values.get("DOB").split(":")[2], values.get("DOB").split(":")[1],
					values.get("DOB").split(":")[0]);
			sigup_form_UI.inputCompanyName().sendKeys(values.get("Company"));
			sigup_form_UI.inputAddress_1().sendKeys(values.get("Address"));
			sigup_form_UI.nationality(values.get("Country"));
			sigup_form_UI.inputCity().sendKeys(values.get("City"));
			sigup_form_UI.inputState().sendKeys(values.get("State"));
			sigup_form_UI.inputZipcode().sendKeys(values.get("Zip code").split(":")[1]);
			sigup_form_UI.inputMobile().sendKeys(values.get("Mobile").split(":")[1]);
			sigup_form_UI.create_submit_Btn().click();
			System.out.println("All Completed");
			return true;
		}
		return false;
	}

	public boolean create_confirmation_UI() {
		if (sigup_form_UI.continue_Btn().isDisplayed() && sigup_form_UI.account_create_confirmation_msg()) {
			sigup_form_UI.continue_Btn().click();
			return true;
		}
		return false;
	}
	
	public boolean delete_confirmation_UI() {
		if (sigup_form_UI.continue_Btn().isDisplayed() && sigup_form_UI.account_delete_confirmation_msg()) {
			sigup_form_UI.continue_Btn().click();
			return true;
		}
		return false;
	}
}
