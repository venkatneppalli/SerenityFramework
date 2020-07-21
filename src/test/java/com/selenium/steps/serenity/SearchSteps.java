package com.selenium.steps.serenity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import com.selenium.pages.SearchPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {

	SearchPage searchpage;


	@Step("Select Location Type List Box")
	public void selectLocationType(String locationType) {
		
		searchpage.doSelectLocationType(locationType);
	}
	
	@Step("click on alert message box")
	public void clickOnAlertBox() {
		
		
	}

}
