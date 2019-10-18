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

public class HomePage_Testcases extends Annotations {
	Boolean bEditMode;

	@BeforeTest
	public void setData() {
		excelFileName = "HomePage";

	}

	@Test(dataProvider = "fetchData")
	public void HomePage(String Url, String userName, String password, String ReportNames)
			throws InterruptedException, IOException {

		new LoginPage().enterUrl(Url).enterUserName(userName).enterPassword(password).clickLoginButton();

		String[] result = ReportNames.split(",");
//		String[] expResults = ExpectedStrs.split(",");
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


			 driver.close();
			// }
		}
	}
}