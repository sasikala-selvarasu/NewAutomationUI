package pages;

import org.openqa.selenium.WebElement;

import wrappers.Annotations;

public class ResultPage extends Annotations {

	public ResultPage CheckTextCommentary(String lookStr) {
		
		String lookVal = "//u[contains(text(),'"+lookStr+"')]";
		//String lookVal = "//u[contains(text()='"+lookStr+"')]";
		WebElement IsText = driver.findElementByXPath(lookVal);
		if(IsText.isDisplayed()) {
			System.out.println("'"+lookStr+"' is present" );
		}
		else {
			System.out.println("Text is not present");
		}
		return this;	
		}
		
	public HomePage CloseReportTab() {
		driver.findElementByXPath("//span[@class='tab-close ng-star-inserted' and text()='x']").click();
		return new HomePage();
	}
		

			
		}

