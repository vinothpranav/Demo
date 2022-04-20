package com.nxtgenai.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nxtgenai.pages.RegisterDemoPage;

public class RegisterUser {

	public WebDriver driver;

	@Test(priority=1)
	public void launchApplication() {
		// To Set System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// To Create Driver Object in Driver Interface
		driver = new ChromeDriver();

		String url = "https://nxtgenaiacademy.com/demo-site/";
		// Launch the Home URL
		driver.get(url);

		// To Maximize Window
		driver.manage().window().maximize();
		Reporter.log("Application is launched");
	}

	@Test(priority=2)
	public void registerUser() {
		
		RegisterDemoPage regUser = new RegisterDemoPage(driver);
		regUser.setFirstName("Vinoth");
		regUser.setLastName("R");
		regUser.selectMaleRadioBtn();
		regUser.setEmailId("vinothrwins@gmail.com");
		regUser.setVerification("45");
		regUser.clickSubmitBtn();
		
	}

	@Test(priority=3)
	public void closeApplication() {
		driver.close();
		Reporter.log("Application is closed");		
	}


}
