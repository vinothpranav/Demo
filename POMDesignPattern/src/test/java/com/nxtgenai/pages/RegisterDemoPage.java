package com.nxtgenai.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class RegisterDemoPage {
	
	WebDriver driver;
	
	// Initialize the webelements locators value using BY class
	By firstName = By.id("vfb-5");
	By lastName = By.name("vfb-7");
	By genderMale = By.xpath("//*[@id=\"vfb-8-1\"]");
	By emailId  = By.cssSelector("#vfb-14");
	By verificationNum = By.id("vfb-3");
	By submitBtn = By.id("vfb-4");

	public RegisterDemoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Actions methods
	public void setFirstName(String fname)
	{
		driver.findElement(firstName).sendKeys(fname);
		Reporter.log("First Name is "+ fname);
	}
	
	public void setLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
		Reporter.log("Last Name is "+ lname);
	}
	
	public void selectMaleRadioBtn() {
		driver.findElement(genderMale).click();
		Reporter.log("Male radio button is selected");
	}
	
	public void setEmailId(String eid) {
		driver.findElement(emailId).sendKeys(eid);
		Reporter.log("Email id is "+ eid);
	}
	
	// 	By verificationNum = By.id("vfb-3");
	public void setVerification(String vnum) {
		driver.findElement(verificationNum).sendKeys(vnum);
		Reporter.log("Verification Number is "+ vnum);
	}
	
	public void clickSubmitBtn() {
		driver.findElement(submitBtn).click();
		Reporter.log("Submit Button is clicked");
	}
	

}
