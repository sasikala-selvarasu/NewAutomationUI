package pages;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;

import wrappers.Annotations;

public class LoginPage extends Annotations {

		public LoginPage enterUrl(String data) {
			driver.get(data);
			Reporter.log("<font color='green'>The Web URL is opened now</font>");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			return this;
		
		}
	
		public LoginPage enterUserName(String data) {
			System.out.println (data);
			//if(data.matches("mgoodey")) {
			if(data.matches(data)) {
				driver.findElementByXPath("//input[@formcontrolname='username']").sendKeys(data);
				//Reporter.log("<font color='red'> Hello world </font>");
				Reporter.log("<font color='green'>The User Name has entered</font>", true);
										
				//Reporter.log("The User Name has entered", true);
				//return this;
			}
			else {
				Reporter.log("<font color='red'> Invalid user name has entered</font>", true);

				return null;
			}
			return this;
		}
		
		public LoginPage enterPassword(String data) {
			System.out.println (data);
			if(data.matches("eagle1")){
			//if(data.matches("eagle1")) {
				driver.findElementByXPath("//input[@formcontrolname='password']").sendKeys(data);
				Reporter.log("<font color='green'>Password has entered</font>", true);
			//return this;
				}
			else {
				Reporter.log("<font color='red'>Invalid password entered</font>", true);
				//return null;
			}
		//	return null;*/
			return this;
		}
		
		public HomePage clickLoginButton() throws InterruptedException {
			driver.findElementByXPath("//span[text()='Log In']").click();
			Reporter.log("<font color='green'>Logged into the application</font>", true);
			Thread.sleep(3000);
			//return new HomePage();
			//return this;
			return new HomePage();
		
		}
		

}
