package org.automation.testing.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testing.base.CreateDriverInstance;
import org.automation.testing.datagenerator.DataGenerators;
import org.automation.testing.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFuntionality extends CreateDriverInstance{
	@Test(dataProvider="Excel", dataProviderClass=DataGenerators.class)
	public void tc_001_login_funtionality(String uname, String pass) throws IOException, InterruptedException
	{
		LoginPage login= new LoginPage(driver);
		login.enterUserName(uname);
		login.enterPassword(pass);
		login.clickSignIn();
		//Thread.sleep(10000);
	}

}
  