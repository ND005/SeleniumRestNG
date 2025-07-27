package com.testing.ui.stepdefinition;

import java.io.FileInputStream;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

	public HashMap<String, String> signup_form_TestData() {
		HashMap<String, String> userTest_Data = new HashMap<>();
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/basicRessources/TestData.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("RegistrationForm");
			if (sheet != null) {
				for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum() - 2; rowIndex++) {
					Cell Key = sheet.getRow(rowIndex).getCell(0);
					Cell Value = sheet.getRow(rowIndex).getCell(1);
					if (Key.getStringCellValue() != null && Value.getStringCellValue() != null) {
						userTest_Data.put(Key.getStringCellValue(), Value.getStringCellValue());
					} else {
						break;
					}
				}
			}
			workbook.close();
		} catch (Exception e) {
			System.err.checkError();
		}
		return userTest_Data;
	}

	@Before
	public void browserHandling() {
		setDriver("chrome");
	}

	@After
	public void browserTeardown() {
		getDriver().quit();
	}

	public static void main(String[] args) {
		TestUtil TD = new TestUtil();
		TD.signup_form_TestData();
	}
}
