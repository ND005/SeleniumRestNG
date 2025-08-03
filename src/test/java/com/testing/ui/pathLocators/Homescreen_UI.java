package com.testing.ui.pathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homescreen_UI {
	private WebDriver driver;

	public Homescreen_UI(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement home_Button() {
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]"));
	}

	public WebElement products_Button() {
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]"));
	}

	public WebElement cart_Button() {
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[3]"));
	}

	public WebElement signin_Button() {
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]"));
	}

	public WebElement testcases_Button() {
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]"));
	}

	public WebElement apiTesting_Button() {
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[6]"));
	}

	public WebElement logout_Button() {
		return driver.findElement(By.xpath("//li//a[contains(text(), ' Logout')]"));
	}

	public WebElement delete_Button() {
		return driver.findElement(By.xpath("//li//a[contains(text(), ' Delete Account')]"));
	}

}
