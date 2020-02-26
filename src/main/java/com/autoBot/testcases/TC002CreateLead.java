package com.autoBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoBot.pages.LoginPage;
import com.autoBot.testng.api.base.Annotations;


public class TC002CreateLead extends Annotations {
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002CreateLead";
		testcaseDec = "Create Lead entry";
		author = "sasikala";
		category = "smoke";
		excelFileName = "TC002";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLead(String userName, String password, String logInName, String companyname, String firstname, String lastname, String firstName) {
		new LoginPage()
		.enterUserName(userName)
		.enterPassWord(password)
		.clickLogin()
		.verifyLoginName(logInName)
		.clickCRMButton()
		.clickLead()
		.clickCreateLeadButton()
		.enterCompanyName(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickCreatLeadButton1()
		.viewFirstName(firstname);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
