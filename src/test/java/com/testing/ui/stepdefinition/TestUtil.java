package com.testing.ui.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtil {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		if (driver.get() == null) {
			throw new IllegalStateException("WebDriver is null.");
		}
		return driver.get();
	}

	public void setDriver(String browserName) {
		WebDriver webDriver = null;
		String browser = browserName.toLowerCase();
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			webDriver = new FirefoxDriver();
			webDriver.manage().window().maximize();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			webDriver = new EdgeDriver();
			webDriver.manage().window().maximize();
			break;
		default:
			throw new IllegalArgumentException("Unsupported browser: " + browserName);
		}
		driver.set(webDriver);
	}

	@Before
	public void browserHandling() {
		setDriver("chrome");
	}

	@After
	public void browserTeardown() {
		getDriver().quit();
	}
}
