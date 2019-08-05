package myFirstPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ZoomCar {
	/*1. Open Chrome Browser
	2. Open https://www.zoomcar.com/chennai Website
	3. Click on the Start your wonderful journey link
	4. In the Search page, Click on the any of the pick up point under POPULAR PICK-UP POINTS
	5. Click on the Next button
	6. Specify the Start Date as tomorrow Date
	7. Click on the Next Button`displayed.
	10. Find the highest value and report the brand name.
	11. click on the Book Now button for it.
	12. Close the Browser.
	*/

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sselvarasux\\eclipse-workspace\\Selenium_Webdriver\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.findElementByClassName("search").click();
		//Thread.sleep(5000);
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.findElementByClassName("proceed").click();
		//driver.close();
		
		Date date = new Date();
		
		Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1); //minus number would decrement the days
        date = cal.getTime();
        DateFormat sdf = new SimpleDateFormat("dd");			
		String tomorrow = sdf.format(date);
		int day = Integer.parseInt(tomorrow);
		tomorrow = Integer.toString(day);
	
		
		driver.findElementByXPath("//div[contains(text(),"+tomorrow+")]").click();
		//div[contains(text(),17)]
		WebElement textElement1 = driver.findElementByXPath("//div[contains (@class, 'day picked')]");
		//System.out.println(textElement1.getText());
		tomorrow = textElement1.getText();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[@class='proceed']").click();
		WebElement textElement = driver.findElementByXPath("//div[contains (@class, 'day picked')]");
		String selectedDateText = textElement.getText();
		if (selectedDateText.equals(tomorrow))
		{
			System.out.println("start date and drop date is same");
			driver.findElementByXPath("//button[@class='proceed']").click();
		}
		else
		{
			System.out.println("start date and drop date is different");
			driver.findElementByXPath("//button[@class='proceed']").click();
		}
		Thread.sleep(10000);
		List<WebElement> noOfResults = driver.findElementsByXPath("//div[@class='car-item']");
		int size2 = noOfResults.size();
		System.out.println("Count of:" +size2);
		int highestValue = 0;
		String highestBrandName = "";
		WebElement highestElement=null; 
		List<WebElement> totalPrice = driver.findElementsByXPath("//div[@class='price']");
		for(int i =0; i<totalPrice.size();i++) {
			String text = totalPrice.get(i).getText();
			System.out.println(text);
			text = text.substring(1);
			String searchStr = text;
			text = text.replaceAll("\"", "");
			text = text.replaceAll(",", "");
			System.out.println(text);
			text=text.trim();
			int orgValue = Integer.parseInt(text);
			String brandName = driver.findElementByXPath("//div[contains(text(), '"+searchStr+"')]/preceding::h3[1]").getText();
			//button[@class='book-car']
			System.out.println("Price " + orgValue + " is for " + brandName);
			
			
			if (orgValue > highestValue ){
				highestValue = orgValue;
				highestBrandName = brandName;
				highestElement = driver.findElementByXPath("//div[contains(text(), '"+searchStr+"')]/following::button[@name='book-now']");
			}
	
			//driver.findElementByXPath("div[contains(text(),")
	
		}
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Highest value is : " + highestValue);
		System.out.println("Highest brand name is " +highestBrandName);
		System.out.println(highestElement);
		highestElement.click();
	
		//button[@class='book-car']/preceding::h3[1]/following::button[@class='book-car']
		
		driver.findElementByXPath("//button[@class='book-car']/preceding::h3[1]");
	}



	}


