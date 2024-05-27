package org.automation.testing.testcases;

import java.io.IOException;

import org.automation.testing.base.CreateDriverInstance;
import org.automation.testing.datagenerator.DataGenerators;
import org.automation.testing.pages.LoginPage;
import org.testng.annotations.Test;

public class TC_002_RegisterNewUser extends CreateDriverInstance {
	
	@Test(dataProvider="Register", dataProviderClass=DataGenerators.class)
	public void tc_002_RegisterNewUser(String fname, String lname, String phnumber) throws IOException 
	{
		LoginPage login= new LoginPage(driver);
		login.clickOnCreateNewAccount();
		login.enterFirstName(fname); 
		login.enterLastName(lname);
		login.enterMobileNumber(phnumber);
	}

}
