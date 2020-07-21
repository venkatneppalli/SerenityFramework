package com.selenium.steps.serenity;


import org.openqa.selenium.WebElement;

import com.selenium.pages.BasePage;
import com.selenium.pages.SearchPage;
import com.selenium.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTestSteps extends ScenarioSteps {

	BasePage basepage;
	LoginPage loginpage;
	SearchPage searchpage;

	@Step("navigate to MAH login page")
	public void navigateTO() {

		basepage.navigateToSignOnPage();
	}

	@Step("user enter user name in text field")
	public void enterUsrid(String userName) {

		loginpage.doEnterUserId(userName);

	}

	@Step("user enter password name in text field")
	public void enterPwdid(String passwordName) {

		loginpage.doEnterPasswordId(passwordName);

	}

	@Step("user try to click on sing in button")
	public void clickSignIn() {

		loginpage.doClickSignInButton();

	}
	
	
	
	
}
