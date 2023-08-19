package Test_Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Feature",
		glue={"Step_Def","Utilities"},
		tags= "@Directory",
		dryRun=false,
		monochrome=true,
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
		
public class TestRunner {
}
