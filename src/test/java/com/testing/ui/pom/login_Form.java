package com.testing.ui.pom;

import org.openqa.selenium.WebDriver;
import com.testing.ui.pathLocators.Login_UI;

public class login_Form {
	private WebDriver driver;

	public login_Form(WebDriver driver) {
		this.driver = driver;
	}

	Login_UI ln = new Login_UI(driver);

	public boolean new_UserData() {
		try {
			ln.signup_Usermail().sendKeys("");
			ln.signup_Name().sendKeys("");
			ln.signup__Btn();
			return true;
		} catch (Exception e) {
			System.out.checkError();
		}
		return false;
	}

	public boolean login_UserData() {
		try {
			ln.loginUserName().sendKeys("");
			ln.loginPassword().sendKeys("");
			ln.login_Btn();
			return true;
		} catch (Exception e) {
			System.out.checkError();
		}
		return false;
	}
}
