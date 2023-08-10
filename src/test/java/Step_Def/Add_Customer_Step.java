package Step_Def;

import org.openqa.selenium.WebDriver;

import PageObject.Add_Customer_Page;
import Utilities.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Add_Customer_Step extends Base_Test {
		
		//public WebDriver driver=Base_Test.get_driver();
		Add_Customer_Page acp;
		CommonSteps cS = new CommonSteps();
		
				
		@Given("Verify Add Customer is Page is displayed")
		public void verify_add_customer_is_page_is_displayed() throws InterruptedException {
			Thread.sleep(2000);
		
			//cS.verifyButtonIsDisplayed(acp.addCustomer);
			

		}
		@Then("Click on Add Customer button")
		public void click_on_add_customer_button() throws InterruptedException {
			acp= new Add_Customer_Page();
			acp.clickAddCustomer();
			
		}
		@Then("Add customer details")
		public void add_customer_details() throws InterruptedException {
	acp.addCustomerDetails();
			
		}
		@Then("Verify Customer added successfully with customer id")
		public void verify_customer_added_successfully_with_customer_id() throws InterruptedException {
		 Thread.sleep(1000);
			acp.ExceptAlert();
		 
		}
		@Then("Click on Home Page")
		public void click_on_home_page() throws InterruptedException {
			Thread.sleep(500);
			acp.homeButton();
			Thread.sleep(500);
		}
		

}
