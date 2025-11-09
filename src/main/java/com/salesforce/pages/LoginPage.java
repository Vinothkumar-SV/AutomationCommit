package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	
	public LoginPage enterUserName(String uName) {
		
		//locate the element
		WebElement locateElement = locateElement("username");
		//type userName
		type(locateElement, uName);
		//clear & Type - ClearAndType(locateElement, uName);
		reportStep("Enter the UserName as :"+uName, "pass");
		return this;
	}
	
	public LoginPage enterPassword(String pass) {
		
		type(locateElement("password"), pass);
		reportStep("Enter the PassWord as :"+pass, "pass");
		return this;
	}
	
	

	public HomePage clickOnLogin() {
		click(locateElement("Login"));
		reportStep("Login is Clicked", "pass");
		return new HomePage();
	}

}
