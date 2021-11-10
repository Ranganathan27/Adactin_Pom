package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	public static WebDriver driver;

	@FindBy(id = "my_itinerary")
	private WebElement itinerary;

	@FindBy(id = "logout")
	private WebElement logout;

	public Booking_Confirmation(WebDriver co) {
		this.driver = co;

		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}

}
