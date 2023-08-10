package Step_Def;

import org.openqa.selenium.WebDriver;

import PageObject.Banker_Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Banker_Login_Step extends Base_Test {
	
	//public WebDriver driver=Base_Test.get_driver();
	Banker_Login_Page blp;
		
	@Given("User Opens the the XYZ Bank application")
	public void user_opens_the_the_xyz_bank_application() throws InterruptedException {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(2000);
	}
	@And("Login as Banker Manager")
	public void login_as_banker_manager() {
		blp=new Banker_Login_Page();
		blp.bankerLogin();
		//return driver;
		
	}
	
	


}
