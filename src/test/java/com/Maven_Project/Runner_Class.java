package com.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pomclass.Booking_Confirmation;
import com.pomclass.Login_Page;
import com.pomclass.Search_Hotel;
import com.pomclass.Select_Hotel;

public class Runner_Class extends Base_Class {
	public static WebDriver driver = Base_Class.browser("chrome");

	public static Login_Page pg = new Login_Page(driver);

	public static Search_Hotel ho = new Search_Hotel(driver);

	public static Select_Hotel tel = new Select_Hotel(driver);

	public static Booking_Confirmation con = new Booking_Confirmation(driver);

	public static void main(String[] args) throws InterruptedException {

		geturl("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();

		inputmethod(pg.getUsername(), "ranganathan3027");

		inputmethod(pg.getPassword(), "ranganathan");

		clickmethod(pg.getLogin());

		drop_Down(ho.getLocation(), "Sydney");

		drop_Down(ho.getHotel(), "Hotel Sunshine");

		drop_Down(ho.getRoomtype(), "Super Deluxe");

		inputmethod(ho.getCheckin(), "12/03/2021");

		inputmethod(ho.getCheckout(), "21/30/2022");

		drop_Down(ho.getAdultno(), "3");

		drop_Down(ho.getChildno(), "2");

		clickmethod(ho.getSearch());

		clickmethod(tel.getRadiobutton());

		clickmethod(tel.getCont());

		inputmethod(tel.getFirstname(), "Ranganathan");

		inputmethod(tel.getLastname(), "G");

		inputmethod(tel.getAddress(), "12/B Bakers Street");

		inputmethod(tel.getCardno(), "1234567812345678");

		drop_Down(tel.getCardtype(), "MAST");

		drop_Down(tel.getCardmonth(), "1");

		drop_Down(tel.getCardyear(), "2021");

		inputmethod(tel.getCcv(), "1234");

		clickmethod(tel.getBook());

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		clickmethod(con.getItinerary());

		clickmethod(con.getLogout());

	}

}
