package com.testing.ui.pom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.ui.pathLocators.ContactUs_UI;
import org.openqa.selenium.Alert;

public class contact_us {
	private WebDriver driver;
	ContactUs_UI ContactInfo;

	public contact_us(WebDriver driver) {
		this.driver = driver;
		ContactInfo = new ContactUs_UI(driver);
	}

	public boolean Verify_Contact_us_featurs() {
		try {
			if (ContactInfo.email_ContactUs().isDisplayed() && ContactInfo.name_ContactUs().isDisplayed()
					&& ContactInfo.subject_ContactUs().isDisplayed()) {
				if (!ContactInfo.fileUpload_ContactUs().isDisplayed()
						&& !ContactInfo.message_ContactUs().isDisplayed()) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0, 30);");
					Thread.sleep(2000);
				}
				return ContactInfo.fileUpload_ContactUs().isDisplayed() && ContactInfo.message_ContactUs().isDisplayed()
						&& ContactInfo.submit_Btn_ContactUs().isDisplayed();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return false;
	}

	public boolean Verify_Contact_us_functionality() {
		ContactInfo.email_ContactUs().sendKeys("Random@gmail.com");
		ContactInfo.name_ContactUs().sendKeys("Testing Random");
		ContactInfo.subject_ContactUs().sendKeys("Automation Testing Using Selenium Cucumber");
		String Message = null;
		Path filePath = Paths.get("src/test/resources/basicRessources/Message.txt");
		try {
			List<String> lines = Files.readAllLines(filePath);
			for (String line : lines) {
				Message = Message + line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		ContactInfo.message_ContactUs().sendKeys(Message.toString());
		ContactInfo.submit_Btn_ContactUs().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		return true;
	}

	public boolean verify_succces_status() {
		if (ContactInfo.successMsg().getText().contains("Success! Your details have been submitted successfully.")
				&& ContactInfo.home_Btn().isDisplayed()) {
			ContactInfo.home_Btn().click();
			return true;
		}
		return false;
	}
}
