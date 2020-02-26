package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class MyViewLeadPage extends Annotations {
	public void viewFirstName(String data){
		WebElement eleFirstName= locateElement("id", "viewLead_firstName_sp");
		getElementText(eleFirstName);
		verifyExactText(eleFirstName, data);
		
		
	}

}
