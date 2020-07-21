package com.selenium.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

	private static final String USER_NAME_INPUT = "//input[@id='username']";
	private static final String PASSWORD_INPUT = "//input[@id='password']";
	private static final String LOGIN_BUTTON = "//input[@id='login']";
	private static final String LOGOUT_LINK = "//input[contains(@text(),'Logout')]";

	@FindBy(xpath = USER_NAME_INPUT)
	WebElementFacade userid_txt;

	@FindBy(xpath = PASSWORD_INPUT)
	WebElementFacade passwordid_txt;

	@FindBy(xpath = LOGIN_BUTTON)
	WebElementFacade login_button;

	@FindBy(xpath = LOGOUT_LINK)
	WebElementFacade logout_link;

	public void doEnterUserId(String sUserName) {
		userid_txt.sendKeys(sUserName);
	}

	public void doEnterPasswordId(String sPassword) {
		passwordid_txt.sendKeys(sPassword);
	}

	public void doClickSignInButton() {
		login_button.click();
	}

	
	public void doClickSignIn_with_javascript() {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", login_button);
	}

	
}
