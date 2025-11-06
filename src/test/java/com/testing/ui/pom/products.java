package com.testing.ui.pom;

import org.openqa.selenium.WebDriver;
import com.testing.ui.pathLocators.Products_UI;

public class products {
	Products_UI productInfo;

	public products(WebDriver driver) {
		productInfo = new Products_UI(driver);
	}

	public boolean searchByText(String searchProduct) {
		productInfo.search().sendKeys(searchProduct);
		productInfo.search_Btn();
		return true;
	}

	public boolean categoryTypes() {
		if (productInfo.categoryList("Women").isDisplayed() && productInfo.categoryList("Men").isDisplayed()
				&& productInfo.categoryList("Kids").isDisplayed()) {
			return true;
		}
		return false;
	}

	public boolean brandTypes() {
		if (productInfo.brandsList().size() > 1) {
			return true;
		}
		return false;
	}
}
