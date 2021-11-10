package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radiobutton;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement cont;

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardno;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement cardmonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement cardyear;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement ccv;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book;

	public Select_Hotel(WebDriver dri) {
		this.driver=dri;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}

}
