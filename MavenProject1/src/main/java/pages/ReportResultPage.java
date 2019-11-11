package pages;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import wrappers.Annotations;

public class ReportResultPage extends Annotations {
	Boolean bEditMode ;
	public ReportResultPage CommentarySetGet(Boolean bEditMode, String URL, String Key) throws InterruptedException {
		
		String ReportResultPage = driver.getCurrentUrl();
		Reporter.log("<font color='green'>The Report Result page URL is</font>", true);
		System.out.println("The Report Result page URL is: " +ReportResultPage);
		String Title = driver.getTitle();
		System.out.println("Commentry Details Title is :" +Title);
		if (bEditMode) {
			driver.findElementByXPath("//input[@formcontrolname='ArriaAPIUrl']").clear();
			driver.findElementByXPath("//input[@formcontrolname='ArriaAPIUrl']").sendKeys(URL);		
			driver.findElementByXPath("//input[@formcontrolname='ArriaAPIKeyToken']").clear();
			driver.findElementByXPath("//input[@formcontrolname='ArriaAPIKeyToken']").sendKeys(Key);		
			driver.findElementByXPath("//span[@class='mat-button-wrapper' and text()='Save']").click();
		}
		else
		{
			System.out.println("Loop triggering the bEditMode false case");
			System.out.println("Testing*************************");
			WebElement textElement = driver.findElementByXPath("//input[@formcontrolname='ArriaAPIUrl']");
			Thread.sleep(5000);
			String valueText = textElement.getAttribute("value");
			
			System.out.println(valueText);
			if(valueText.equals(URL))
				Reporter.log("<font color='green'>Given values has been updated and both are same</font>", true);
			
				
				
			else
				Reporter.log("<font color='red'>Given values has not been updated and the values are different</font>", true);
				
		}
		driver.findElementByXPath("//span[@class='mat-button-wrapper' and text()='Close']").click();
		
		Reporter.log("<font color='green'>Report commentry details has updated</font>", true);
		
		
		return this;
	}
	
	
}
	
	
