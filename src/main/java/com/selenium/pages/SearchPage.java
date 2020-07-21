package com.selenium.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends BasePage {

	private static final String LocationType="//select[@id='location']";
	private static final String HotelType="//select[@id='hotels']";
	private static final String RoomType="//select[@id='room_type']";
	private static final String NumberOfRoomsType="//select[@id='room_nos']";
	
	
	@FindBy(xpath = LocationType)
	WebElementFacade locationListBox;

	@FindBy(xpath = HotelType)
	WebElementFacade hotelListBox;

	@FindBy(xpath = RoomType)
	WebElementFacade roomListBox;

	@FindBy(xpath = NumberOfRoomsType)
	WebElementFacade numberofroomsListBox;

	
	
	
	public void doSelectLocationType(String locationType) {
		
		//Select select_Location= Select(locationListBox);
		
		locationListBox.selectByValue(locationType);
		
	}
	
	
	public void doClickOnAlertBox() {
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
		
	}


}
