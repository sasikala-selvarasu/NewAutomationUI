package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ResultPage;
import wrappers.Annotations;

public class TC001Login extends Annotations {

	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	
	}
	@Test(dataProvider = "fetchData")
	public void loginLogout(String Url, String userName, String password, String ReportNames, String ExpectedStrs, String  Timeouts) throws InterruptedException {
		
		new LoginPage()
		.enterUrl(Url)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton();
		
		 String[] result = ReportNames.split(",");
		 String[] expResults = ExpectedStrs.split(",");
		 String[] TimeOut = Timeouts.split(",");
	     for (int x=0; x<result.length; x++) {
		    //System.out.println();

			new HomePage()
			.ClickOnInbox()
			.ClickonReport(result[x])
			.ClickonAnalyse();
			
			Thread.sleep(Integer.parseInt(TimeOut[x]) );
			
			new ResultPage()
			.CheckTextCommentary(expResults[x])
			.CloseReportTab();
		}
	}
}
