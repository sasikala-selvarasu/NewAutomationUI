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

public class LoginPage_Testcases extends Annotations {
	Boolean bEditMode;

	@BeforeTest
	public void setData() {
		excelFileName = "LoginPage";

	}

	@Test(dataProvider = "fetchData")
	public void loginLogout(String Url, String userName, String password)
			throws InterruptedException, IOException {

		new LoginPage().enterUrl(Url).enterUserName(userName).enterPassword(password).clickLoginButton();

	   // driver.close();
			// }
		}
	
}
