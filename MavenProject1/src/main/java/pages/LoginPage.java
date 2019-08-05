package pages;

import java.util.concurrent.TimeUnit;

import wrappers.Annotations;

public class LoginPage extends Annotations {

		public LoginPage enterUrl(String data) {
			driver.get(data);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			return this;
		
		}
	
		public LoginPage enterUserName(String data) {
			driver.findElementByXPath("//input[@formcontrolname='username']").sendKeys(data);
			return this;
		}
		
		public LoginPage enterPassword(String data) {
			driver.findElementByXPath("//input[@formcontrolname='password']").sendKeys(data);
			return this;
		}
		
		public LoginPage clickLoginButton() throws InterruptedException {
			driver.findElementByXPath("//span[text()='Log In']").click();
			Thread.sleep(3000);
			//return new HomePage();
			return this;
		
		}
		

}
