package javapackage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScrenshotsOnFailure1 {
		
		WebDriver driver;
		
		public void captureScreenshot(ITestResult result) throws Exception {
			if(ITestResult.FAILURE == result.getStatus()) {
				
				//creating reference of TakeScreenshot interface and type casting
				TakesScreenshot ts = (TakesScreenshot)driver;//type casting of the interface
				
				//use getScreenshotAs() method to capture screenshot in form of FILE
				//getScreenshotAs() method eturn type is FILE
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				//copy file to specific location
				//FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
				System.out.println(result.getName() + "method() screenshot captured");
			}
			
			
		

	}

}
