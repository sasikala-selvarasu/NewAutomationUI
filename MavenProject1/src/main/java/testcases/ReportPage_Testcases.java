package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ResultPage;
import wrappers.Annotations;

import pages.ChartsPage;
import pages.HomePage;

import pages.ReportResultPage;
import pages.ReportTabpage;

//import wrappers.Annotations;

public class ReportPage_Testcases extends Annotations {
	Boolean bEditMode;

	@BeforeTest
	public void setData() {
		excelFileName = "ReportPage";

	}

	@Test(dataProvider = "fetchData")
	public void ReportPage(String Url, String userName, String password, String ReportNames,String ExpectedStrs,
			String Timeouts, String ReportsTabReport, String URL, String Key, String fileWithPath)
			throws InterruptedException, IOException {
		

		new LoginPage() .enterUrl(Url) .enterUserName(userName) .enterPassword(password).clickLoginButton(); 
		
		

		String[] result = ReportNames.split(",");
		String[] expResults = ExpectedStrs.split(",");
//		String[] TimeOut = Timeouts.split(",");
		
//		System.out.println (result);
//		System.out.println (expResults);
//		System.out.println (TimeOut);
		
		for (int x = 0; x < result.length; x++) {

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new HomePage()
			.ClickOnInbox()
			.ClickonReport(result[x])
			.ClickonAnalyse();
			
			new ResultPage()
			 .CheckTextCommentary(expResults[x])
			 .ClickGoCharts();

			new ChartsPage()
			 .ClickCharts(fileWithPath);
			
			 new ReportTabpage()
			 .ClickOnReports()
			 .ClickOnReportTabReport(ReportsTabReport);
			  bEditMode = true;
			 new ReportResultPage()
			 .CommentarySetGet(bEditMode, URL, Key);


			 driver.close();
			// }
		}
	}
}