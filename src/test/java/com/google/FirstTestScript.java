package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTestScript {

	public static WebDriver driver;

	@BeforeClass
	public void beforeClass() {
	}

	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}
}
