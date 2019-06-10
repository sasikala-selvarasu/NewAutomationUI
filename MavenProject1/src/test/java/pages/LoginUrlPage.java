package pages;

import org.openqa.selenium.chrome.ChromeDriver;

//http://10.130.35.25:100/modules/olap/#/login (exernalized)
//login 
//click on inbox
public class LoginUrlPage {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\sselvarasux\\eclipse-workspace\\Selenium_Webdriver\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://10.130.35.25:100/modules/olap/#/login");
	driver.manage().window().maximize();
	
	
}
