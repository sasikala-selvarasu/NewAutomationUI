package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import wrappers.Annotations;

public class LogicBuilder2 extends Annotations {

	public LogicBuilder2 doCalculation() throws IOException, InterruptedException {
		
		System.out.println("Logic builder concepts");
		Actions builder = new Actions(driver);
		//clicking the first row(EglEqFn1)and right clicking the View logic
		//WebElement elementLocator = driver.findElementByXPath("//span[@class='ag-group-value'][1]");
		Thread.sleep(9000);
//		WebElement elementLocator = driver.findElementByXPath("//span[@class='ag-header-cell-text' and text()='eglRoll_up_Demo_filed']");
//		builder.contextClick(elementLocator).perform();
//		driver.findElementByXPath("//span[text()='View Logic']").click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(1000,1000)");
		List<WebElement> elements = driver.findElementsByXPath("//span[@class='ag-header-cell-text']");
		//span[@class='ag-header-cell-text' and text()='eglRoll_up_Demo_filed']
		js.executeScript("arguments[0].scrollIntoView();", elements);
		for (int i=1; i<=elements.size(); i++)
		{	
			
			System.out.println(elements.get(i).getText());
			if (elements.get(i).getText() == "eglRoll_up_Demo_filed")
			{
				builder.contextClick(elements.get(i)).perform();
				System.out.println(elements.get(i).getText());
				System.out.println("Inside");
				driver.findElementByXPath("//span[text()='View page source']").click();
				Thread.sleep(3000);
			}
		}
		
		//builder.contextClick(elementLocator).perform();
		//driver.findElementByXPath("//span[text()='View Logic']").click();
//		driver.findElementByXPath("//span[text()='View page source']").click();
//		Thread.sleep(3000);
		return this;
		                
	}
	
	public LogicBuilder2 LogicbuilderPage() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Create New']").click();
		driver.findElementByXPath("//button[@class='egl-value-icon clauseTile egl-disable']/child::span[text()='IF']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//em[@class='pi pi-plus'][1]").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//span[text()='=']").click();
		Thread.sleep(6000);
		
	
		Select items = new Select(driver.findElementByXPath("//select[starts-with(@class, 'egl-logic-field-control')][1]"));
		items.selectByVisibleText("Field");
		//driver.findElementByXPath("//option[@value='f']").click();
		WebElement searchBox = driver.findElementByXPath("//input[@formcontrolname='search']");
		Thread.sleep(4000);
		searchBox.sendKeys("Cash Balance Field1");
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.DOWN);
		searchBox.sendKeys(Keys.ENTER);
		searchBox.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		
		System.out.println("*******************");
				
		
		driver.findElementByXPath("//option[@value='>=']").click();
		Thread.sleep(4000);
		
		//Select items = new Select(driver.findElementByXPath("//select[starts-with(@class, 'egl-logic-field-control')][1]"));
		//items.selectByVisibleText("Field");
		driver.findElementByXPath("//option[@value='f']").click();
		WebElement searchBox1 = driver.findElementByXPath("//input[@formcontrolname='search']");
		Thread.sleep(4000);
		searchBox1.sendKeys("EA Fund Return");
		
		
		//Select items1 = new Select(driver.findElementByXPath("//select[starts-with(@class, 'egl-logic-field-control')][1]"));
		//items1.selectByVisibleText("Value");
		Thread.sleep(4000);
		
		
		//driver.findElementByXPath("//input[starts-with(@class, 'egl-logic-input-control')]").sendKeys("4500");
		Thread.sleep(4000);

		
		driver.findElementByXPath("//span[text()='(A+B)']").click();
		driver.findElementByXPath("//button[@class='headerButtons closeButtons']").click();
		
		Thread.sleep(4000);
		driver.findElementByXPath("//em[@class='pi pi-plus'][2]").click();
		driver.findElementByXPath("//span[text()='=']").click();
		Thread.sleep(6000);
		
		
		Thread.sleep(4000);
		Select items2 = new Select(driver.findElementByXPath("//select[starts-with(@class, 'egl-logic-field-control')][1]"));
		items2.selectByVisibleText("Field");
		//driver.findElementByXPath("//option[@value='f']").click();
		Thread.sleep(4000);
		WebElement searchBox2 = driver.findElementByXPath("//input[@formcontrolname='search']");
		Thread.sleep(4000);
		searchBox2.sendKeys("AMAK - Risk 1");
		Thread.sleep(4000);
		searchBox2.sendKeys(Keys.DOWN);
		searchBox2.sendKeys(Keys.ENTER);
		searchBox2.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		
		//= symbol find the element
		
		//driver.findElementByXPath("/html/body/egl-root/egl-shell/mat-sidenav-container/mat-sidenav-content/div/egl-reporting/mat-drawer-container/mat-drawer-content/mat-drawer-container/mat-drawer-content/egl-routed-tab/div[2]/egl-logic-builder-new/div/p-overlaypanel[1]/div/div/div/div[2]/select").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//option[@value='<']").click();
		//input[starts-with(@class, 'egl-logic-input-control')]
		driver.findElementByXPath("//input[starts-with(@class, 'egl-logic-input-control')]").sendKeys("100");

		driver.findElementByXPath("//span[text()='(A+B)']").click();
		driver.findElementByXPath("//button[@class='headerButtons closeButtons']").click();
		
		Thread.sleep(5000);
				

		//THEN part
		
		driver.findElementByXPath("//em[@class='pi pi-plus'][1]").click();
		driver.findElementByXPath("//button[@title='Click Here']").click();
		//driver.findElementByXPath("//span[text()='=']").click();
		driver.findElementByXPath("//option[@value='v']").click();
		driver.findElementByXPath("//input[starts-with(@class, 'egl-logic-input-control')]").sendKeys("TRUE");
		driver.findElementByXPath("//button[@class='headerButtons closeButtons']").click();
		
//		driver.findElementByXPath("//span[text()='(A+B)']").click();
		
		
		
        
		return this;
		
	}
}
