package org.abc.automation.testcases;

import java.io.IOException;

import org.abc.automation.base.DriverInstance;
import org.abc.automation.datagenerators.DataGenerator;
import org.abc.automation.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends DriverInstance {


	@Test
	public void tc_001_login_functionality(String uname, String pass) throws IOException{
			
		LoginPage login = new LoginPage(driver);
		login.enterUserName("test");
		login.enterPassword("test");
		login.clickSignIn();
		
	}
	
	
			
			
			
}
