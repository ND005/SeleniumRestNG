package com.testing.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/TC 02 - Contact Us.feature", glue = {
		"com.testing.ui.stepdefinition" }, plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports.json" }
)
public class TestRunner {

}
