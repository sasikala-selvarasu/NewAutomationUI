package myFirstPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TANDE {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sselvarasux\\eclipse-workspace\\Selenium_Webdriver\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://texdev20:96/regularlogin.aspx");
		driver.manage().window().maximize();
		driver.findElementById("ctl00_cphPageContent_txtUsername").sendKeys("sselvarasux");		
		driver.findElementById("ctl00_cphPageContent_txtPassword").sendKeys("eagle123");	
		driver.findElementById("ctl00_cphPageContent_cmdLogin").click();
				
		driver.findElementByXPath("//span[@class='ui-button-icon-left ui-clickable pi pi-bars']").click();
				
		System.out.println("Trying to click the maintenance");
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@id=\"panel\"]/div/div[6]/div[1]/a/span[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"panel\"]/div/div[6]/div[2]/div/p-panelmenusub/ul/li[3]/a/span[1]").click();
		
		//driver.findElementByXPath("//span[@class='ui-menuitem-text' and text()='Cost Categories']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//p-panelmenusub[@class='ng-tns-c4-9 ng-tns-c4-7 ng-star-inserted']//child::span[text()='Cost Categories']").click();
		//check the cost category list
		String text = driver.findElementById("tblTitle").getText();
		if (text.equals("Cost Category List"))
			System.out.println("Cost categories menu title is:  " +text);
		
		else 
			System.out.println("Unable to find the title");
		
		driver.findElementByXPath("//span[@class='pi pi-times']").click();
		//driver.findElementByXPath("//span[@class='ui-button-text ui-clickable']//parent::button[@id='btnAdd']").click();
		driver.findElementByXPath("//span[@class='ui-button-text ui-clickable' and text()='Add']").click();	
		//driver.findElementByClassName("ui-button-text ui-clickable").click(); -- compound class names not permitted
		String text2 = driver.findElementById("dlgHeader").getText();
		if(text2.equals("Add Cost Category"))
			System.out.println("Add Cost category List title is : " +text2);
		else
			System.out.println("unable to find the title element");
		driver.findElementById("txtName").sendKeys("Cost Category 1");
		
		WebElement dropdown = driver.findElementByXPath("//*[@id='ddlStatus']/div/label");
		Select dropStatus = new Select(dropdown);
		
		List<WebElement> options = dropStatus.getOptions();
		int size = options.size();
		System.out.println(size);
		dropStatus.selectByVisibleText("Inactive");
		//dropStatus.selectByIndex(2);
		
		driver.findElementByXPath("//span[text()='Save']").click();
			
		

	}
	
}

		
		
							


	
