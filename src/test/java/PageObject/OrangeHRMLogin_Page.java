package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Step_Def.Base_Test;
import Utilities.CommonSteps;

public class OrangeHRMLogin_Page extends Base_Test{
	CommonSteps cs=new CommonSteps();
	
//	public WebDriver driver=Base_Test.get_driver();
	
	
	public OrangeHRMLogin_Page(){
		//WebDriver driver=Base_Test.get_driver();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=("//input[@name='username']"))
	WebElement username;
	

	@FindBy(xpath=("//input[@name='password']"))
	WebElement password;

	@FindBy(xpath=("//button[@type='submit']"))
	WebElement Login;

	@FindBy(xpath=("//img[@alt='profile picture']"))
	WebElement profile;
	
	
	public void loginToOrangeHrm() {
		username.sendKeys(cs.prop.getProperty("userName"));
		password.sendKeys(cs.prop.getProperty("password"));
		Login.click();
		
		
	}
	public void verify_Profile_image() {
		profile.isDisplayed();
		System.out.println("Logged in User is " +profile.getText());
	}
	
	
}
