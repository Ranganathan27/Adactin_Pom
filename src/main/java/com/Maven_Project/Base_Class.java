package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver browser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//driver//chromedriver.exe");
			driver = new ChromeDriver();
		}

		return driver;
	}

	public static void clickmethod(WebElement method1) {
		method1.click();

	}

	public static void inputmethod(WebElement input, String value) {
		input.sendKeys(value);

	}

	public static void geturl(String url) {

		driver.get(url);
	}

	public static void drop_Down(WebElement ele, String Value) { //
		Select s = new Select(ele);
		s.selectByValue(Value);

	}

}
