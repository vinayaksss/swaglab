package Step_Def;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import io.cucumber.java.After;
//import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Base_Test {
	

	@Before
	public void setUpBrowser() {

		get_driver();

	}

	@After
	public void closeBr() {
		driver.close();
	
	}
	
	}
