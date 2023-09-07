package Step_Def;

import org.openqa.selenium.WebDriver;

import PageObject.Login_Page;
//import Utilities.Base_Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_Step extends Base_Test{
	//public WebDriver driver
	//=Base_Test.get_driver();
	Login_Page lp;

	@Given("Open the SwagLabs UrL")
	public void open_the_swag_labs_ur_l() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");


	}

@Given("Enter UserName {string}")
public void enter_user_name(String userName) {
lp=new Login_Page(this.driver);
	lp.enterUserName(userName);
}
@Given("Enter Password {string}")
public void enter_password(String password) throws InterruptedException {
	Thread.sleep(2000);
	
	lp.enterPassword(password);
}
	
	@Given("Click on Submit")
	public void click_on_submit() throws InterruptedException {
	   lp.clickLogin();
	}
	@Then("Verify page Tittle")
	public void verify_page_tittle() {
		lp.verify_Page_Title();
	}


@Then("Click on Main menu")
public void click_on_main_menu() throws InterruptedException {
	Thread.sleep(1000);
	lp.mainMenu();
	Thread.sleep(1000);
}
@Then("Click Logout")
public void click_logout() {
	lp.logout();
}

}
