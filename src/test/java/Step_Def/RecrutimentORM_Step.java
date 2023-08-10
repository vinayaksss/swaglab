package Step_Def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.Recrutiment_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RecrutimentORM_Step extends Base_Test{
	//public WebDriver driver=Base_Test.get_driver();
	Recrutiment_Page rp;
	

	@Given("Select Recrutiment option from Left menu option")
	public void select_option_from_left_menu_option() throws InterruptedException {
		rp=new Recrutiment_Page(driver);
		Thread.sleep(100);
		rp.selectRecrutiment();
	
	}
	@Given("click Vacancies button")
	public void click_button() throws InterruptedException {
		Thread.sleep(100);
		rp.clickOnVacancies();
		Thread.sleep(1000);
	}
	@Then("Select {string} from the dropDown")
	public void select_from_the_drop_down(String dropV) throws InterruptedException {
		Thread.sleep(500);
    rp.selectDropDownvalue(dropV);
    Thread.sleep(100);
	}
	@Then("click on search button")
	public void click_on_search_button() throws InterruptedException {
		Thread.sleep(500);
		rp.recSearch();
	}
	@Then("Verify the Number of Records")
	public void verify_the_number_of_records() throws InterruptedException {
		rp.vancanciesRecord();
		
	}
	@Then("Click on Reset button")
	public void click_on_reset_button() throws InterruptedException {
		rp.recReset();
	}

	@Then("Get the details of records")
	public void get_the_details_of_records() throws InterruptedException {
		rp.recordDetails();
		
	}

	@Then("Get the details of {string}")
	public void get_the_details_of(String vac) throws InterruptedException {
		rp.getDetailsByVacancy(vac);
	}

	
}
