package pages;

import org.openqa.selenium.WebElement;

import wrappers.Annotations;

public class ReportResultPage extends Annotations {
	public ReportResultPage CommentarySetGet(Boolean bEditMode, String URL, String Key) {
		
		String ReportResultPage = driver.getCurrentUrl();
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
			String text = driver.findElementByXPath("//input[@formcontrolname='ArriaAPIUrl']").getText();
			System.out.println(text);
			System.out.println(URL);
			if(text.equals(URL)){
				System.out.println("Given values has been updated and both are same");
			}
			else
				System.out.println("Given values has not been updated and the values are different");
//			if(driver.findElementByXPath("//input[@formcontrolname='ArriaAPIUrl']").equals(URL))
//				System.out.println("Given values has been updated and both are same");
//			else
//			    System.out.println("Given values has not been updated and the values are different");	
		
		}
		// need to find the save alert box text
		
		//close the button
		driver.findElementByXPath("//span[@class='mat-button-wrapper' and text()='Close']").click();
		
		return this;
	}
	
	
	
	
	
}
