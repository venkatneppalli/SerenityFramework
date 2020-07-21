package com.selenium.StepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.selenium.steps.serenity.LoginTestSteps;
import com.selenium.steps.serenity.BaseTestSteps;
import com.selenium.steps.serenity.SearchSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginTestStepDefinition {

	@Steps
	BaseTestSteps baseteststeps;

	@Steps
	LoginTestSteps loginteststeps;

	@Steps
	SearchSteps searchteststeps;

	
	@Given("^I want to navigate to mah application$")
	public void i_want_to_navigate_to_mah_application() {
		loginteststeps.navigateTO();
		baseteststeps.verifyPageTitle("Adactin.com - Hotel Reservation System");
	}

	@When("^I enter correct user id$")
	public void i_enter_correct_user_id() {

		loginteststeps.enterUsrid("seleniumtesting");
		//loginteststeps.enterUsrid("vapprod1@mailinator.com");
	}

	@When("^I enter correct password id$")
	public void i_enter_correct_password_id() {
		loginteststeps.enterPwdid("password1");
	}

	@When("^I click on signin button$")
	public void i_click_on_signin_button() {
		loginteststeps.clickSignIn();
	}

	@Then("^I login successfully$")
	public void i_login_successfully() throws InterruptedException {
		baseteststeps.verifyPageTitle("Adactin.com - Search Hotel");
		
	}

}
