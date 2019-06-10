package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wrappers.Annotations;

public class HomePage extends Annotations {
	
	
	static boolean ClickReport = true; 
	
	public HomePage ClickOnInbox() {
		driver.findElementByXPath("//span[text()='Inbox'][1]").click();
		String inboxUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		// to get current directory of the java code
		System.getProperty(title);
		System.out.println("The title is :" + title);
		System.out.println("The current page URL is: " + inboxUrl);
		System.out.println("Successfully clicked the Inbox ");
			
		return this;
		
	}
	public HomePage ClickonReport(String data) {
		String lookVal = "//div[@class='eagle-status-completed']/following::span[text()='"+data+"']";
		//String lookVal = "//span[text()='"+data+"']";
		Actions builder = new Actions(driver);
		WebElement elementLocator = driver.findElementByXPath(lookVal);
		if(ClickReport ==true) {						
			builder.click(elementLocator).perform();
			driver.findElementByXPath("//mat-icon[@class='mat-icon material-icons' and text()='more_horiz']").click();
			driver.findElementByXPath("//span[text()='View']").click();
			ClickReport = false;
		}
		else {
		
			builder.doubleClick(elementLocator).perform();
			ClickReport = true;
		}
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@role='row']"));
		if(findElements.size() >=1) {
			System.out.println("Report contains the data");
			System.out.println("Total data rows found in table:" +(findElements.size()-1));
		}
		else
		System.out.println("Report does not contains data");
		
		return this;
		
	}
	public ResultPage ClickonAnalyse() {
		driver.findElementByXPath("//div[@class='mat-tab-link ng-star-inserted' and text()=' Analyse ']").click();
		return new ResultPage();
	
	}
	
}