package com.testing.ui.pom;

import org.openqa.selenium.WebDriver;

import com.testing.ui.pathLocators.menu_Bar;

public class ui_navigations {
	private WebDriver driver;

	public ui_navigations(WebDriver driver) {
		this.driver = driver;

	}

	public boolean navigateToHomeScreen(WebDriver Driver) {
		menu_Bar menuPage = new menu_Bar(driver);
		if (menuPage.home_Button().isDisplayed()) {
			menuPage.home_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateToProductsScreen(WebDriver Driver) {
		menu_Bar menuPage = new menu_Bar(driver);
		if (menuPage.products_Button().isDisplayed()) {
			menuPage.products_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateToCartScreen(WebDriver Driver) {
		menu_Bar menuPage = new menu_Bar(driver);
		if (menuPage.cart_Button().isDisplayed()) {
			menuPage.cart_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateToLoginScreen(WebDriver Driver) {
		menu_Bar menuPage = new menu_Bar(driver);
		if (menuPage.signin_Button().isDisplayed()) {
			menuPage.signin_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateToTestCasesScreen(WebDriver Driver) {
		menu_Bar menuPage = new menu_Bar(driver);
		if (menuPage.testcases_Button().isDisplayed()) {
			menuPage.testcases_Button().click();
			return true;
		}
		return false;
	}

	public boolean navigateAPITestingScreen(WebDriver Driver) {
		menu_Bar menuPage = new menu_Bar(driver);
		if (menuPage.apiTesting_Button().isDisplayed()) {
			menuPage.apiTesting_Button().click();
			return true;
		}
		return false;
	}

}
