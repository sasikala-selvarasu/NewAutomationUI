package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import wrappers.Annotations;

public class ChartsPage extends Annotations {

	public  ChartsPage ClickCharts(String fileWithPath) throws IOException {
		
		        //Convert web driver object to TakeScreenshot
		        //TakesScreenshot scrShot =((TakesScreenshot)webdriver);
				TakesScreenshot scrShot =((TakesScreenshot)driver);
		        //Call getScreenshotAs method to create image file
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		        //Move image file to new destination
		        File DestFile=new File(fileWithPath);
                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
                System.out.println("Screen shot has been taken into this path :" +fileWithPath);
                return this;
		
                
	}
}
