package com.selenium.StepDefinition;


import com.selenium.steps.serenity.BaseTestSteps;
import com.selenium.steps.serenity.LoginTestSteps;
import com.selenium.steps.serenity.SearchSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchTestStepDefinition {
	
	
	@Steps
	BaseTestSteps baseteststeps;

	@Steps
	LoginTestSteps loginteststeps;

	@Steps
	SearchSteps searchteststeps;

	
	
	@Given("^I want to login into application$")
	public void i_want_to_login_into_application() {
	   
	}

	@When("^I select location type as \"([^\"]*)\" from dropdown$")
	public void i_select_location_type_as_from_dropdown(String arg1) {
	   
	}

	@When("^select other mandatory fields$")
	public void select_other_mandatory_fields() {
	   
	}

	@When("^click on search button$")
	public void click_on_search_button() {
	   
	}

	@Then("^I validate the location on select hotel page$")
	public void i_validate_the_location_on_select_hotel_page() {
	   
	}


}
