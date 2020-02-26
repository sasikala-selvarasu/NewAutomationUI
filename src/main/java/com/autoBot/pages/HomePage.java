package com.autoBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoBot.testng.api.base.Annotations;

public class HomePage extends Annotations{ 

	/*public HomePage() {
       PageFactory.initElements(driver, this);
	} 
*/
//	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	public LoginPage clickLogout() {
		WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);  
		return new LoginPage();
	}




public HomePage verifyLoginName(String data) {
	WebElement eleVerifyloginname=locateElement("tag","h2");
	getElementText(eleVerifyloginname);
	verifyExactText(eleVerifyloginname, data);
	return this;
}

public LoginPage clickLogoutButton() {
	driver.findElementByClassName("decorativeSubmit").click();
	return new LoginPage();
}	
public MyHomePage clickCRMButton() {
	WebElement eleClick = locateElement("link","CRM/SFA");
	click(eleClick);
	return new MyHomePage();
}
}





