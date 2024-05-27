package org.automation.testing.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CreateDriverInstance {
	public WebDriver driver;
	@BeforeMethod
	public void initiateDriverInstance() throws Exception
	{
		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}
	@AfterMethod
	public void closeDriverInstance()
	{
		driver.quit();
	}

}
