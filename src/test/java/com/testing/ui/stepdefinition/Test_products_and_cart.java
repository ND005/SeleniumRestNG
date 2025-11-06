package com.testing.ui.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.testing.ui.pom.products;
import com.testing.ui.pom.ui_navigations;

import io.cucumber.java.en.And;

public class Test_products_and_cart extends TestUtil {
	
	private WebDriver driver = TestUtil.getDriver();
	products productInfo = new products(driver);
	ui_navigations uiflow = new ui_navigations(driver);

	@And("^Verify search by product (.*) functionality$")
	public void search_by_product_details(String details) {
		try {
			uiflow.navigateToProductsScreen(driver);
			Assert.assertTrue("[ERROR] : Step 3:- Search for product using search box",
					productInfo.searchByText(details));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@And("Verify category and brands sections")
	public void category_and_brands_sections() {
		Assert.assertTrue("[ERROR] : Step 4:- Verify category", productInfo.categoryTypes());
		Assert.assertTrue("[ERROR] : Step 5:- Verify brands", productInfo.brandTypes());
	}

	@And("Verify top 3 product details and add them in cart")
	public void product_details_in_cart() {
		
	}

	@And("Verify the added item and Delete them from cart")
	public void added_and_delete_from_cart() {
	}
}
