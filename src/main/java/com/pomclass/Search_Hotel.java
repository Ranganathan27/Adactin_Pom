package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkin;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkout;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultno;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childno;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultno() {
		return adultno;
	}

	public WebElement getChildno() {
		return childno;
	}

	public WebElement getSearch() {
		return search;
	}

	public Search_Hotel(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

}
