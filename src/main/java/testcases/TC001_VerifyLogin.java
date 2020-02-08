package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC001_VerifyLogin extends ProjectSpecificMethods{
	@Test
public void testLogin()
{
	LoginPage login = new  LoginPage();
	login.enterUserName().enterPassword().enterLogin().verifyTitle();
}
	
	@AfterMethod
	public void closeWindow()
	{
		driver.close();
	}
	


}
