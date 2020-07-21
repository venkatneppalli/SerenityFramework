package com.selenium.steps.serenity;

import org.openqa.selenium.WebElement;


import com.selenium.pages.BasePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseTestSteps extends ScenarioSteps{
	
	BasePage basepage;
	
	@Step("verify page title")
	public void verifyPageTitle(String expectedTitle) {
		
		basepage.verifyPageTitle(expectedTitle);
	}

	@Step("verify page title")
	public void waitForAlertBox() {
		
		basepage.WaitForAlert();
	}
	
	
	
	
}
