package pages;

import seleniumBase.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	
	public HomePage verifyTitle()
	{
		String Title = driver.getTitle();
		System.out.println(Title);
		return this;
	}

}
