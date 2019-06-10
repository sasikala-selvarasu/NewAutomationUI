package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ReportResultPage;
import pages.ReportTabpage;
import pages.ResultPage;
import wrappers.Annotations;

public class TC002Login extends Annotations {

		@BeforeTest
		public void setData() {
			excelFileName = "TC002";
		
		}
		@Test(dataProvider = "fetchData")
		public void loginLogout(String Url, String userName, String password, String ReportNames, String ExpectedStrs, String  Timeouts, String ReportsTabReport, String URL, String Key ) throws InterruptedException {
			
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
				
				new ReportTabpage()
				.ClickOnReports()
				.ClickOnReportTabReport(ReportsTabReport);
				Boolean bEditMode = true;
				new ReportResultPage()
				.CommentarySetGet(bEditMode, URL, Key);
				
				Thread.sleep(Integer.parseInt(TimeOut[x]) );

				new ReportTabpage()
				.ClickOnReports()
				.ClickOnReportTabReport(ReportsTabReport);
				bEditMode = false;
				new ReportResultPage()
				.CommentarySetGet(bEditMode, URL, Key);
				
				
}
		     
		}   
}
		  


