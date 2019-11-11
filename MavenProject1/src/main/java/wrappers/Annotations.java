package wrappers;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class Annotations  {
	public static ChromeDriver driver;
	public String excelFileName;
	
	@BeforeMethod
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sselvarasux\\eclipse-workspace\\Selenium_Webdriver\\drivers\\chromedriver.exe" );
	Reporter.log("The Browser is opened now");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("The Browser is maximized now");
//	driver.get("http://10.130.35.25:100/modules/olap/#/login");
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
	driver.quit();
	}
	@DataProvider(name="fetchData")
	public String[][] getData() throws InvalidFormatException, IOException{
	return DataInputProvider
	.readExcel(excelFileName);
	}

	}




