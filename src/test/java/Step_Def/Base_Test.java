package Step_Def;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

//import com.aventstack.extentreports.model.Test;

public class Base_Test {

	public static WebDriver driver;
	public void get_driver() {	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}

	public void closeBrowser() {

		driver.quit();
	}
		
	public static String captureScreenShot(String fileName) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		
		String destinationFile=System.getProperty("user.dir")+"//Screenshots/"+fileName+".jpg";
		FileUtils.copyFile(sourcefile, new File(destinationFile));
		System.out.println("ScreenShot saved Successfully");
		
		return destinationFile;
		 
	}

	
}