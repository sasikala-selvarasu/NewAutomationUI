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
			//if(data == "mgoodey") {
				driver.findElementByXPath("//input[@formcontrolname='username']").sendKeys(data);
				return this;
			/*}
			else {
				System.out.println("Invalid User name");
			}
			return null;*/
		}
		
		public LoginPage enterPassword(String data) {
			//if(data == "eagle1") {
			driver.findElementByXPath("//input[@formcontrolname='password']").sendKeys(data);
			return this;
			/*}
			else {
				System.out.println("Invalid Password");
			}
			return null;*/
		}
		
		public LoginPage clickLoginButton() throws InterruptedException {
			driver.findElementByXPath("//span[text()='Log In']").click();
			Thread.sleep(3000);
			//return new HomePage();
			return this;
		
		}
		

}
