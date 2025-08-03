package com.testing.ui.pathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class sigup_form_UI {
	private WebDriver driver;

	public sigup_form_UI(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver setDriverPropertiesLocal() {
		return driver;
	}

	public WebElement gender(String gen) {
		if (gen.equals("Mr")) {
			return driver.findElement(By.id("id_gender1"));
		} else if (gen.equals("Mrs")) {
			return driver.findElement(By.id("id_gender2"));
		}
		return null;
	}

	public boolean DOB(String Date, String Month, String Year) {
		int stringTointdate = Integer.parseInt(Date);
		Select dateDropdown = new Select(driver.findElement(By.id("days")));
		Select monthDropdown = new Select(driver.findElement(By.id("months")));
		Select yearDropdown = new Select(driver.findElement(By.id("years")));
		dateDropdown.selectByIndex(stringTointdate + 1);
		monthDropdown.selectByVisibleText(Month);
		yearDropdown.selectByValue(Year);
		return true;
	}

	public boolean nationality(String country) {
		Select dateDropdown = new Select(driver.findElement(By.id("country")));
		dateDropdown.selectByValue(country);
		return true;
	}

	public WebElement inputPassword() {
		return driver.findElement(By.id("password"));
	}

	public WebElement inputFirstName() {
		return driver.findElement(By.id("first_name"));
	}

	public WebElement inputLastName() {
		return driver.findElement(By.id("last_name"));
	}

	public WebElement inputCompanyName() {
		return driver.findElement(By.id("company"));
	}

	public WebElement inputAddress_1() {
		return driver.findElement(By.id("address1"));
	}

	public WebElement inputAddress_2() {
		return driver.findElement(By.id("address2"));
	}

	public WebElement inputState() {
		return driver.findElement(By.id("state"));
	}

	public WebElement inputCity() {
		return driver.findElement(By.id("city"));
	}

	public WebElement inputZipcode() {
		return driver.findElement(By.id("zipcode"));
	}

	public WebElement inputMobile() {
		return driver.findElement(By.id("mobile_number"));
	}

	public WebElement create_submit_Btn() {
		return driver.findElement(By.xpath("//button[@type='submit' and text()='Create Account']"));
	}

	public WebElement continue_Btn() {
		return driver.findElement(By.xpath("//section[@id='form']//a[text()='Continue']"));
	}

	public boolean account_create_confirmation_msg() {
		if (driver.findElement(By.xpath("//section[@id='form']//p[1]")).getText().contains("Congratulations")) {
			return true;
		}
		return false;
	}

	public boolean account_delete_confirmation_msg() {
		if (driver.findElement(By.xpath("//section[@id='form']//p[1]")).getText()
				.contains("Your account has been permanently deleted")) {
			return true;
		}
		return false;
	}

}
