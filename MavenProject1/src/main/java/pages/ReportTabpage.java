package pages;

import org.openqa.selenium.JavascriptExecutor;
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
	//Commentry details entry adding
	public ReportResultPage ClickOnReportTabReport(String data) throws InterruptedException {
		String lookVal = "//span[text()='"+data+"']";
		System.out.println("after clicking the searching the report");
		//WebElement findElementByXPath = driver.findElementByXPath("//span[text()='1 Month PLA Data']");
		Actions builder = new Actions(driver);
		Thread.sleep(10);
		WebElement elementLocator = driver.findElementByXPath(lookVal);
		System.out.println("still seraching");
		builder.contextClick(elementLocator).perform();
		driver.findElementByXPath("//span[@id='eName' and text()='Commentry ']").click();				
		Reporter.log("<font color='green'>The Report has been selected and Commentry details is entered</font>", true);
		return new ReportResultPage();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='buttonStyle']//input[@id='originTextField']")));
		//WebElement elem = driver.findElement(By.xpath("element_xpath"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", elem);
		
		
	}
	//Clicking Prototype on reports and checking excel is there or not
	public ReportTabpage ClickOnProtoType(String data) throws InterruptedException {
		
		String lookVal = "//span[text()='"+data+"']";
		driver.findElementByXPath("//input[@class='ag-floating-filter-input'][1]").sendKeys(data);
		Actions actions = new Actions(driver);
		WebElement elementLocator1 = driver.findElementByXPath(lookVal);
		//Thread.sleep(10);
		System.out.println(elementLocator1);
		actions.contextClick(elementLocator1).perform();
		driver.findElementByXPath("//span[@id='eName' and text()='ProtoType ']").click();
		Reporter.log("<font color='green'>The Report has been selected and Prototype is clicked</font>", true);
		//return this;
		
		
		WebElement textElement = driver.findElementByXPath("//input[@formcontrolname='ReportProtoType']");
		Thread.sleep(5000);
		String valueText = textElement.getAttribute("value");
		System.out.println(valueText);
		if(valueText.contains(".xlsx"))
				Reporter.log("<font color='green'>Report ProtoType excel file has been given</font>", true);								
		else
			Reporter.log("<font color='red'>Report ProtoType excel file has not been given</font>", true);	
		
		return this;
		
	}
	// call inbox function here
}



