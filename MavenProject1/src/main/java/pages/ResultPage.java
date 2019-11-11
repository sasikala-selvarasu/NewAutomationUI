package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import wrappers.Annotations;

public class ResultPage extends Annotations {

	public ResultPage CheckTextCommentary(String lookStr) throws InterruptedException {
		
		Thread.sleep(10000);
		//strong[text()='COMMENTARY']
		String lookVal = "//u[contains(text(),'"+lookStr+"')]";
		//String lookVal = "//u[contains(text()='"+lookStr+"')]";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement IsText = driver.findElementByXPath(lookVal);
		Reporter.log("<font color='green'>Checking the COMMENTARY in ANALYSE page</font>", true);
		if(IsText.isDisplayed()) {
			System.out.println("'"+lookStr+"' is present" );
			Reporter.log("<font color='green'>Expected String is present</font>", true);
			
		}
		else {
			System.out.println("Text is not present");
			Reporter.log("<font color='green'>Expected String is not present</font>", true);
		}
		return this;	
		}
	
	public ChartsPage ClickGoCharts() {
		driver.findElementByXPath("//div[text()=' Charts ']").click();
		Reporter.log("<font color='green'>Clicked the CHARTS Link in top right hand side</font>", true);
		return new ChartsPage();
		
	}
		
	public HomePage CloseReportTab() {
		driver.findElementByXPath("//span[@class='tab-close ng-star-inserted' and text()='x']").click();
		Reporter.log("<font color='green'>Closed the Report tab</font>", true);
		return new HomePage();
	}
		

			
		}

