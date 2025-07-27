package com.testing.ui.pom;

import org.openqa.selenium.WebDriver;
import com.testing.ui.pathLocators.Login_UI;

public class login_Form {
	private WebDriver driver;
	private Login_UI loginUI;

	public login_Form(WebDriver driver) {
		this.driver = driver;
		this.loginUI = new Login_UI(driver);
	}

	public boolean new_UserData(String userName, String email) {
		if (loginUI.signup_Usermail().isDisplayed() && loginUI.signup_Name().isDisplayed()) {
			loginUI.signup_Usermail().sendKeys(userName);
			loginUI.signup_Name().sendKeys(email);
			loginUI.signup__Btn();
			return true;
		}
		System.out.println("Email element :" + loginUI.signup_Usermail().isDisplayed() + ",Name Element :"
				+ loginUI.signup_Name().isDisplayed());
		return false;
	}

	public boolean login_UserData(String email, String password) {
		try {
			loginUI.loginUserName().sendKeys(email);
			loginUI.loginPassword().sendKeys(password);
			loginUI.signup__Btn();
			return true;
		} catch (Exception e) {
			System.out.checkError();
		}
		return false;
	}
}
