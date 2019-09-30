 package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
//import pages.LogicBuilder;
import pages.LogicBuilder2;
import wrappers.Annotations;

//import pages.ChartsPage;
import pages.HomePage;
//import pages.LoginPage;
//import pages.ReportResultPage;
//import pages.ReportTabpage;
//import pages.ResultPage;
//import wrappers.Annotations;

public class TC001Login extends Annotations {
	Boolean bEditMode ;
	@BeforeTest
	public void setData() {
		excelFileName = "TC001 - Copy";
	
	}
	@Test(dataProvider = "fetchData")
	public void loginLogout(String Url, String userName, String password, String ReportNames, String ExpectedStrs, String  Timeouts,String ReportsTabReport, String URL, String Key, String fileWithPath) throws InterruptedException, IOException {
		
		new LoginPage()
		.enterUrl(Url)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton();
		
		 String[] result = ReportNames.split(",");
		 String[] expResults = ExpectedStrs.split(",");
		 String[] TimeOut = Timeouts.split(",");
		 
	     for (int x=0; x<result.length; x++) {
		  
	    	 
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        new HomePage()
			.ClickOnInbox()
			.ClickonReport(result[x]);
		//	.ClickonAnalyse();
			
			//Thread.sleep(Integer.parseInt(TimeOut[x]) );
			
			
	         //new LogicBuilder()
	           new LogicBuilder2()	                    
	           .doCalculation()
	           .LogicbuilderPage();
	        
			//	new ResultPage()
			//.CheckTextCommentary(expResults[x])
		//	.ClickGoCharts();
			//.CloseReportTab();
			
		//	new ChartsPage()
			//	.ClickCharts(fileWithPath);
			
			
			//	new ReportTabpage()
			//.ClickOnReports()
			//.ClickOnReportTabReport(ReportsTabReport);
			//bEditMode = true;
			//new ReportResultPage()
			//.CommentarySetGet(bEditMode, URL, Key);
			
			//Thread.sleep(Integer.parseInt(TimeOut[x]) );

			//new ReportTabpage()
			//.ClickOnReports()
			//.ClickOnReportTabReport(ReportsTabReport);
			//bEditMode = false;
			//new ReportResultPage()
//			.CommentarySetGet(bEditMode, URL, Key);
			
			//driver.close();
		//}
	}
}
}
