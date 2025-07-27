package com.testing.ui.pathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_UI {
	private WebDriver driver;

	public Login_UI(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement loginUserName() {
		return driver.findElement(By.xpath("//form[@action='/login']/input[@type='email']"));
	}

	public WebElement loginPassword() {
		return driver.findElement(By.xpath("//form[@action='/login']/input[@type='password']"));
	}

	public WebElement login_Btn() {
		return driver.findElement(By.xpath("//form[@action='/login']/button[@type='submit']"));
	}

	public WebElement signup_Usermail() {
		return driver.findElement(By.xpath("//form[@action='/signup']/input[@type='email']"));
	}

	public WebElement signup_Name() {
		return driver.findElement(By.xpath("//form[@action='/signup']/input[@type='Name']"));
	}

	public WebElement signup__Btn() {
		return driver.findElement(By.xpath("//form[@action='/signup']/button[@type='submit']"));
	}
}
