package pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import wrappers.Annotations;

public class LogicBuilder extends Annotations {

	public LogicBuilder doCalculation() throws IOException, InterruptedException {
		
		System.out.println("Logic builder concepts");
		Actions builder = new Actions(driver);
		WebElement elementLocator = driver.findElementByXPath("//span[@class='ag-group-value'][1]");
		builder.contextClick(elementLocator).perform();
		driver.findElementByXPath("//span[text()='View Logic']").click();
		Thread.sleep(3000);
		return this;
		                
	}
	
	public LogicBuilder LogicbuilderPage() throws InterruptedException {
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
		searchBox.sendKeys("Cash Activity - Base Amount");
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.DOWN);
		searchBox.sendKeys(Keys.ENTER);
		searchBox.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		
		System.out.println("*******************");
				
		
		driver.findElementByXPath("//option[@value='>=']").click();
		Thread.sleep(4000);
		//Select items1 = new Select(driver.findElementByXPath("//select[starts-with(@class, 'egl-logic-field-control')][1]"));
		//items1.selectByVisibleText("Value");
		Thread.sleep(4000);
		
		
		driver.findElementByXPath("//input[starts-with(@class, 'egl-logic-input-control')]").sendKeys("2500");
		Thread.sleep(4000);

		
		driver.findElementByXPath("//span[text()='(A+B)']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//em[@class='pi pi-plus'][1]").click();
		driver.findElementByXPath("//span[text()='=']").click();
		Thread.sleep(6000);
		
		
		Thread.sleep(4000);
		Select items2 = new Select(driver.findElementByXPath("//select[starts-with(@class, 'egl-logic-field-control')][1]"));
		items2.selectByVisibleText("Field");
		//driver.findElementByXPath("//option[@value='f']").click();
		Thread.sleep(4000);
		WebElement searchBox1 = driver.findElementByXPath("//input[@formcontrolname='search']");
		Thread.sleep(4000);
		searchBox1.sendKeys("AMAK - Risk 1");
		Thread.sleep(4000);
		searchBox1.sendKeys(Keys.DOWN);
		searchBox1.sendKeys(Keys.ENTER);
		searchBox1.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		
		//= symbol find the element
		
		//driver.findElementByXPath("/html/body/egl-root/egl-shell/mat-sidenav-container/mat-sidenav-content/div/egl-reporting/mat-drawer-container/mat-drawer-content/mat-drawer-container/mat-drawer-content/egl-routed-tab/div[2]/egl-logic-builder-new/div/p-overlaypanel[1]/div/div/div/div[2]/select").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//option[@value='<']").click();
		//input[starts-with(@class, 'egl-logic-input-control')]
		driver.findElementByXPath("//input[starts-with(@class, 'egl-logic-input-control')]").sendKeys("100");

		driver.findElementByXPath("//span[text()='(A+B)']").click();
		Thread.sleep(5000);
				

		//THEN part
//		driver.findElementByXPath("//em[@class='pi pi-plus'][1]").click();
		
		
//		driver.findElementByXPath("//span[text()='(A+B)']").click();
		
		
		
        
		return this;
		
	}
}
