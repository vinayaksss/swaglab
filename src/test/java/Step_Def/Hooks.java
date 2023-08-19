package Step_Def;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base_Test {

	@Before
	public void setUpBrowser() {

		get_driver();

	}

	@After
	public void tearDown() {
		
		closeBrowser();
	}

	
	public void screenShot(ITestResult result) throws IOException {

			if(result.getStatus()==ITestResult.FAILURE) {

				captureScreenShot(result.getTestContext().getName()+".png");
			}
			
		}
	
	
	static void captureScreenShot(String fileName) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		File destinationFile= new File("./ScreenShots/"+fileName);
		FileUtils.copyFile(sourcefile, destinationFile);
		System.out.println("ScreenShot saved Successfully");
		
		
		 
	}
	
	
}
