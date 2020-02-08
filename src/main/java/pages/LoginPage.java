package pages;

import org.openqa.selenium.Keys;

import seleniumBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage enterUserName()
	{
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("email").sendKeys(Keys.TAB);
		return this;
	}
	public LoginPage enterPassword()

	{
		
		driver.findElementById("password").sendKeys("leaf@12");
		return this;
	}
	
	public HomePage enterLogin()
	{
		driver.findElementById("buttonLogin").click();	
		return new HomePage();
		
	}
	
}
