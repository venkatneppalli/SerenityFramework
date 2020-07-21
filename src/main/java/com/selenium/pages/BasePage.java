package com.selenium.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

	public void navigateToSignOnPage() {
		open();
	}

	public void verifyPageTitle(String expTitle) {
		String actTitle = getDriver().getTitle();
		if (actTitle.equals(expTitle)) {
			System.out.println("Page title:= " + expTitle);
		} else {
			System.out.println("Page title:= " + actTitle);
		}
	}

	public void WaitForAlert() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
