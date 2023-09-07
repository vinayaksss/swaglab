package Step_Def;

import PageObject.Admin_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Admin_StepDef extends Base_Test{
	Admin_Page admin;
	
	
		
	
	@Given("Select Admin option from Left menu options")
	public void select_option_from_left_menu_options() throws InterruptedException {
		admin = new Admin_Page(driver);
		Thread.sleep(1000);
		admin.select_Admin();
		
	}

	@Then("Click on Job Title under Job Section")
	public void click_on_under_section() throws InterruptedException {
		Thread.sleep(1000);
	admin.select_Job_And_Job_Tittle();
	Thread.sleep(1000);
	}
	
	@Then("Verify user is on Admin page")
	public void verify_user_is_on_admin_page() throws InterruptedException {
		Thread.sleep(1000);
		admin.job_Title_pageHeader();
	    	}
	
	@Then("Check all the job titles")
	public void check_all_the_job_titles() throws InterruptedException {
		Thread.sleep(1000);
		admin.select_All_JobTittles();
	   
	
	}

	


}
