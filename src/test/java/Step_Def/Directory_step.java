package Step_Def;

import org.openqa.selenium.WebDriver;

import PageObject.Directory_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Directory_step extends Base_Test{
	
	//public WebDriver driver=Base_Test.get_driver();
	Directory_Page dp;
	

@Given("Select Directory option from Left menu options")
public void select_directory_option_from_left_menu_options() throws InterruptedException {
	dp=new Directory_Page(driver);
	Thread.sleep(1000);
	dp.viewDirectory();
    
}
	@Then("Get the number records and details")
	public void get_the_number_records_and_details() throws InterruptedException {
		dp.directoryRecordDetails();
		
	
	}

@And("Get all the Job Tittle dropdown list")
public void all_the_job_tittle_dropdown_list() throws InterruptedException {
	dp.directory_JobTittle_DropDown();
	
}


@Then("Get all the Location dropdown list")
public void get_all_the_location_dropdown_list() throws InterruptedException {
	dp.directory_location_DropDown();
}



}
