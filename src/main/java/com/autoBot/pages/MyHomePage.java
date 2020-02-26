package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;


public class MyHomePage extends Annotations{ 

	/*public HomePage() {
       PageFactory.initElements(driver, this);
	} 
*/
//	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	
	public MyLeadPage clickLead() {
		WebElement eleLeads = locateElement("link", "Leads");
		click(eleLeads);
		return new MyLeadPage();
	}

}






