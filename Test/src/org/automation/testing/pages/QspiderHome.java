package org.automation.testing.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testing.utility.Utility;

public class QspiderHome {
	WebDriver driver;
	public QspiderHome(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterName(String name) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocatorsValue("qspider_name_id"))).sendKeys(name);
	}
	public void enterEmail(String email) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocatorsValue("qspider_email_id"))).sendKeys(email);
	}
	public void enterPassword(String password) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocatorsValue("qspider_password_id"))).sendKeys(password);
	}
	public void clickRegister() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorsValue("qspider_register_xpath"))).click();
	}

}
