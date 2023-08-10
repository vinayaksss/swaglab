package Step_Def;

import org.openqa.selenium.WebDriver;

import PageObject.PIM_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PIM_AddEmployee_Step extends Base_Test {
	
	//public WebDriver driver=Base_Test.get_driver();
	PIM_page pim=new PIM_page();
	
	@Given("Select PIM option")
	public void select_pim_option() throws InterruptedException {
		
		Thread.sleep(1000);
		pim.selectPIM();
	}
	@Given("Select Add Employee")
	public void select_add_employee() {
		pim.PIM_ClickAddEmplyee();
	}
	@Then("Add Employee Details")
	public void add_employee_details() throws InterruptedException {
		pim.PIM_AddEmplyeeDetails();
		Thread.sleep(1000);
	}
	@Then("Click on Save")
	public void click_on_save() throws InterruptedException {
		Thread.sleep(1000);
		pim.PIM_save();
		Thread.sleep(1000);
	}
	@Then("Verify Successful Message")
	public void verify_successful_message() throws InterruptedException {
		Thread.sleep(1000);
		pim.verfiyEmpAdded();
		System.out.println("SuccessFull");
	}
	
	@Given("click on EmployeeList")
	public void clcik_on_employee_list() {
		pim.employeeList();
	}
	@Then("Search for employee")
	public void search_for_employee() {
		pim.searchEmployee();
	}





}
