package Step_Def;

import PageObject.OrangeHRMLogin_Page;
import Utilities.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrangeHRM_Step extends Base_Test{

	CommonSteps cs=new CommonSteps();
	//WebDriver driver=Base_Test.get_driver();

	OrangeHRMLogin_Page ohrm = new OrangeHRMLogin_Page();
	
	@Given("Open Orange HRM application")
	public void open_orange_hrm_application() {
	driver.get(cs.getUrl());
	}
	@Given("Login with Valid Crendetials")
	public void login_with_valid_crendetials() {
		
		//ohrm= new OrangeHRMLogin_Page();
		ohrm.loginToOrangeHrm();
			
	}
	
	@Then("Verify User on Dashboad Page")
	public void verify_user_on_dashboad_page() throws InterruptedException {
		ohrm.verify_Profile_image();
		//System.out.println("Page Tittle is "+driver.getTitle());
	}

}
