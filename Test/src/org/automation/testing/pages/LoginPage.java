package org.automation.testing.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testing.utility.Utility;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterUserName(String uname) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocatorsValue("login_username_id"))).sendKeys(uname);
	}
	public void enterPassword(String password) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocatorsValue("login_password_id"))).sendKeys(password);
	}
	
	public void clickOnCreateNewAccount() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorsValue("login_createnewaccount_xpath"))).click();
	}
	
	public void enterFirstName(String firstName) throws IOException
	{
		driver.findElement(By.name(Utility.fetchLocatorsValue("login_firstname_name"))).sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) throws IOException
	{
		driver.findElement(By.name(Utility.fetchLocatorsValue("login_lastname_name"))).sendKeys(lastName);
	}
	
	public void enterMobileNumber(String mobileNumber) throws IOException
	{
		driver.findElement(By.name(Utility.fetchLocatorsValue("login_mobile_name"))).sendKeys(mobileNumber);
	}
	public void clickSignIn() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorsValue("login_singin_xpath"))).click();
	}
	
}
