package pages;


//import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import wrappers.Annotations;

public class HomePage extends Annotations {
	
	
	static boolean ClickReport = false; 

	
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
	public HomePage ClickonReport(String data) throws InterruptedException {
		
		String lookVal = "(//div[@class='eagle-status-completed']/following::span[text()='"+data+"'])[1]";
		//String lookVal = "(//div[@class='eagle-status-completed']/following::span[text()='Attrib And Risk Report'])[1]";
		//(//div[@class='eagle-status-completed']/following::span[text()='Attrib And Risk Report'])[1]  
		System.out.println(lookVal);
		Thread.sleep(4000);
		
		Actions builder = new Actions(driver);
		WebElement elementLocator = driver.findElementByXPath(lookVal);
		if(ClickReport ==true) {	
			//builder.click(elementLocator).perform();
			elementLocator.click ();
						
			WebElement element = driver.findElementByXPath("//mat-icon[text()='more_horiz']");
			Thread.sleep(8000);
			element.click();

	//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		//	WebElement tofindElement =wait2.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//mat-icon[@class='mat-icon material-icons' and text()='more_horiz']")));
		//	tofindElement.click();
	
			
			//driver.findElementByXPath("//mat-icon[@class='mat-icon material-icons' and text()='more_horiz']").click();
			driver.findElementByXPath("//span[text()='View']").click();
			ClickReport = false;
		}
		else {
		
			System.out.println("Inside click report == false");
			builder.doubleClick(elementLocator).perform();
//			ClickReport = true;
		}
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@role='row']"));
		if(findElements.size() >=1) {
			System.out.println("Report contains the data");
			System.out.println("Total data rows found in table:" +(findElements.size()-1));
		}
		else {
		System.out.println("Report does not contains data");
		}
		
		//assertEquals(data, "M2_PrototypeWithChart");
		System.out.println("trying to click the tabs");
		System.out.println(data);
		//if(data.equals("M2_PrototypeWithChart")){
		if(data.equals("Attrib And Risk Report")){	
			System.out.println("It is clicked the first tab");
			System.out.println("Now going to check the logic builder cases");
		
		//	Thread.sleep(10000);
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	/*		driver.findElementByXPath("//span[contains(@aria-describedby, 'cdk-describedby-message') and text()=1]").click();
			String tabOneText = driver.findElementByXPath("//div[text()='1. Portfolio and Benchmark - Weigths, Returns and Excess Returns']").getText();
			System.out.println("Tab One text is:" +tabOneText);
			driver.findElementByXPath("//span[contains(@aria-describedby, 'cdk-describedby-message') and text()=2]").click();
			String tabTwoText = driver.findElementByXPath("//div[text()='2. Brinson Fachler Attribution of Excess Returns']").getText();
			System.out.println("Tab Two text is:" +tabTwoText);
			driver.findElementByXPath("//span[contains(@aria-describedby, 'cdk-describedby-message') and text()=3]").click();
			String tabThreeText = driver.findElementByXPath("//div[text()='3. Calculation of Portfolio and Benchmark risk based on historical return time series']").getText();
			System.out.println("Tab Three text is:" +tabThreeText);
									
			driver.findElementByXPath("//span[contains(@aria-describedby, 'cdk-describedby-message') and text()=4]").click();
			String tabFourText = driver.findElementByXPath("//div[@title=\"<B15>4. Let's use M2 to de-leverage the portfolio returns \"]").getText();
			System.out.println("Tab Four text is:" +tabFourText);
			
			driver.findElementByXPath("//span[contains(@aria-describedby, 'cdk-describedby-message') and text()=5]").click();
			String tabFiveText = driver.findElementByXPath("//div[text()='5. Use the de-levered returns (M2) in Brinson Fachler attribution']").getText();
			System.out.println("Tab Five text is:" +tabFiveText);
			
			Thread.sleep(6000);*/
									
		}		

		return this;
		  //return new LogicBuilder(); 
		
	}
	
	
	public HomePage ClickonAnalyse() {
		
		
		driver.findElementByXPath("//div[text()=' Analyse ']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Clicked the ANALYSE Link on top");
		return this;
	
	}
	
}