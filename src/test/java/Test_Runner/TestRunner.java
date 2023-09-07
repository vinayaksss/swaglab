package Test_Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//feature//Login_To_SwagLabs.feature",
		glue={"Step_Def","Utilities"},
		tags= "@DataTable",
		dryRun=false,
		monochrome=true,
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
		
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
