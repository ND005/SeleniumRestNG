package com.testing.ui.pom;

import org.openqa.selenium.WebDriver;
import com.testing.ui.pathLocators.Homescreen_UI;

public class ui_navigations {
	private WebDriver driver;

	public ui_navigations(WebDriver driver) {
		this.driver = driver;
	}

	public boolean navigateToHomeScreen(WebDriver Driver) {
		Homescreen_UI menuPage = new Homescreen_UI(driver);
		if (menuPage.home_Button().isDisplayed()) {
			menuPage.home_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateToProductsScreen(WebDriver Driver) {
		Homescreen_UI menuPage = new Homescreen_UI(driver);
		if (menuPage.products_Button().isDisplayed()) {
			menuPage.products_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateToCartScreen(WebDriver Driver) {
		Homescreen_UI menuPage = new Homescreen_UI(driver);
		if (menuPage.cart_Button().isDisplayed()) {
			menuPage.cart_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateToLoginScreen(WebDriver Driver) {
		Homescreen_UI menuPage = new Homescreen_UI(driver);
		if (menuPage.signin_Button().isDisplayed()) {
			menuPage.signin_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateToTestCasesScreen(WebDriver Driver) {
		Homescreen_UI menuPage = new Homescreen_UI(driver);
		if (menuPage.testcases_Button().isDisplayed()) {
			menuPage.testcases_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateAPITestingScreen(WebDriver Driver) {
		Homescreen_UI menuPage = new Homescreen_UI(driver);
		if (menuPage.apiTesting_Button().isDisplayed()) {
			menuPage.apiTesting_Button().click();
			return true;
		}
		return false;
	}

	public boolean ui_after_login() {
		Homescreen_UI menuPage = new Homescreen_UI(driver);
		return menuPage.logout_Button().isDisplayed() && menuPage.delete_Button().isDisplayed();
	}

	public boolean logout() {
		Homescreen_UI menuPage = new Homescreen_UI(driver);
		if (menuPage.logout_Button().isDisplayed()) {
			menuPage.logout_Button().click();
			return true;
		}
		return false;
	}

	public boolean delete_Profile() {
		Homescreen_UI menuPage = new Homescreen_UI(driver);
		if (menuPage.delete_Button().isDisplayed()) {
			menuPage.delete_Button().click();
			return true;
		}
		return false;
	}

}
