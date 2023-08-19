package Step_Def;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//import com.aventstack.extentreports.model.Test;

public class Base_Test {

	public static WebDriver driver;




	

	

	public void get_driver() {	

		// WebDriverManager.chromedriver().setup();
		 
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//log.info("Chrome Broswer is initialized");
	}

	public void closeBrowser() {

		driver.quit();
	}

}