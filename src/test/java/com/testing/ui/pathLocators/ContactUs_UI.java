package com.testing.ui.pathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs_UI {
	private WebDriver driver;

	public ContactUs_UI(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement name_ContactUs() {
		return driver.findElement(By.xpath("//input[@placeholder='Name']"));
	}

	public WebElement email_ContactUs() {
		return driver.findElement(By.xpath("//input[@placeholder='Email']"));
	}

	public WebElement subject_ContactUs() {
		return driver.findElement(By.xpath("//input[@placeholder='Subject']"));
	}

	public WebElement message_ContactUs() {
		return driver.findElement(By.id("message"));
	}

	public WebElement fileUpload_ContactUs() {
		return driver.findElement(By.xpath("//input[@name='upload_file']"));
	}

	public WebElement submit_Btn_ContactUs() {
		return driver.findElement(By.xpath("//input[@name='submit']"));
	}

	public WebElement successMsg() {
		return driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
	}
	
	public WebElement home_Btn() {
		return driver.findElement(By.xpath("//div[@id='form-section']/a[1]"));
	}
}
