package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import wrappers.Annotations;

public class ReportTabpage extends Annotations {
	
	public ReportTabpage ClickOnReports(){
		driver.findElementByXPath("//span[text()='Reports' and @aria-describedby='cdk-describedby-message-1']").click();
		String Reporttab = driver.getCurrentUrl();
		System.out.println("The current page url is: " + Reporttab);
		Reporter.log("<font color='green'>Successfully clicked the Reports tab</font>", true);
		System.out.println("***********************************");
		return this;
						
	}
	public ReportResultPage ClickOnReportTabReport(String data) {
		String lookVal = "//span[text()='"+data+"']";
		//WebElement findElementByXPath = driver.findElementByXPath("//span[text()='1 Month PLA Data']");
		Actions builder = new Actions(driver);
		WebElement elementLocator = driver.findElementByXPath(lookVal);
		builder.contextClick(elementLocator).perform();
		driver.findElementByXPath("//span[@id='eName' and text()='Commentry ']").click();				
		Reporter.log("<font color='green'>The Report has been selected and Commentry details is entered</font>", true);
		return new ReportResultPage();
		
	}
	
}



