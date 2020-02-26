package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class MyLeadPage extends Annotations {
	public MyCreateLeadPage clickCreateLeadButton() {
		WebElement eleCreateLead=locateElement("link", "Create Lead");
		click(eleCreateLead);
		return new MyCreateLeadPage();
		
	}


}

