package com.selenium.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/SearchHotelType/searchTest.feature",
glue= {"com.selenium.StepDefinition"})
public class SearchTestRunner {

}
