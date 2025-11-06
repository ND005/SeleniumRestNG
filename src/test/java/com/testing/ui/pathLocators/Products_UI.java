package com.testing.ui.pathLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products_UI {

	private WebDriver driver;

	public Products_UI(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement search() {
		return driver.findElement(By.id("search_product"));
	}

	public WebElement search_Btn() {
		return driver.findElement(By.id("submit_search"));
	}

	public WebElement categoryList(String category) {
		return driver.findElement(By.xpath("//div[@id='" + category + "']/preceding-sibling::div"));
	}

	public List<WebElement> brandsList() {
		return driver.findElements(By.xpath("//div[@class='brands-name']//ul/li"));
	}
}
