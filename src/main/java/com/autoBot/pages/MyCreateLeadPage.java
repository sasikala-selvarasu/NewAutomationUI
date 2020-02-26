package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class MyCreateLeadPage extends Annotations {

	public MyCreateLeadPage enterCompanyName(String data) {
		WebElement eleMyCompanyName = locateElement("id","createLeadForm_companyName");
		clearAndType(eleMyCompanyName, data);  
		return this;
	}
	public MyCreateLeadPage enterFirstName(String data) {
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		clearAndType(eleFirstName, data);
		return this;
	}
	public MyCreateLeadPage enterLastName(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		clearAndType(eleLastName, data);
		return this;
		
		}
	public MyViewLeadPage clickCreatLeadButton1() {
		WebElement eleClickButton = locateElement("name","submitButton");
		click(eleClickButton);
		return new MyViewLeadPage();
		}

}


