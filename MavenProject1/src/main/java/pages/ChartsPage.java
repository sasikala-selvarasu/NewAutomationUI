package pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

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
		        //Delete the existing files Before copy the file into destination
		        System.out.println(DestFile);
		        		        
		         
		        if(DestFile.exists())
		        {
		        	DestFile.delete();
		        	//DestFile.deleteOnExit();
		        	Reporter.log("<font color='green'>Old files are deleted</font>", true);
		        }
		        else {
		        	Reporter.log("<font color='red'>File does not exist to delete</font>", true);
		        	 }
//		        if(DestFile.exists()) {
//		        	
//		        FileUtils.forceDelete(DestFile);
//		        System.out.println("Existing files are deleted");
//		       
//		        }
//		        else {
//		        	System.out.println("File does not exist to delete");	
//		        }
                FileUtils.copyFile(SrcFile, DestFile);
                System.out.println("Screen shot has been taken into this path :" +fileWithPath);
                Reporter.log("<font color='green'>Screen shot has been taken into this path</font>", true);
                return this;
                         
                
	}
}
