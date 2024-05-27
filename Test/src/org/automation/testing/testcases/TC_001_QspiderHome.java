package org.automation.testing.testcases;

import java.io.IOException;

import org.automation.testing.base.CreateDriverInstance;
import org.automation.testing.datagenerator.DataGenerators;
import org.automation.testing.pages.LoginPage;
import org.automation.testing.pages.QspiderHome;
import org.testng.annotations.Test;

public class TC_001_QspiderHome extends CreateDriverInstance{
	@Test(dataProvider="Register", dataProviderClass=DataGenerators.class)
	public void tc_001_QspiderRegister(String name, String email, String password) throws IOException 
	{
		QspiderHome qhome= new QspiderHome(driver);
		qhome.enterName(name);
		qhome.enterEmail(email);
		qhome.enterPassword(password);
		qhome.clickRegister();
	}

}
