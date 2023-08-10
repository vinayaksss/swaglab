package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Step_Def.Base_Test;
import Utilities.CommonSteps;

public class PIM_page extends Base_Test{
String userName;
	//public WebDriver driver = Base_Test.get_driver();
	CommonSteps cs= new CommonSteps();
	public PIM_page() {
		//WebDriver driver = Base_Test.get_driver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//a[@href='/web/index.php/pim/viewPimModule']"))
	WebElement PIM_option;
	@FindBy(xpath = ("//li[@class='oxd-topbar-body-nav-tab']"))
	WebElement PIM_AddEmploye;

	@FindBy(xpath = ("//li[@class='oxd-topbar-body-nav-tab --visited']//a"))
	WebElement PIM_EmployeeList;
	

	@FindBy(xpath = ("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"))
	WebElement PIM_Save;

	@FindBy(xpath = ("//input[@name='firstName']"))
	WebElement PIM_firstName;

	@FindBy(xpath = ("//input[@name='lastName']"))
	WebElement PIM_lastName;

	@FindBy(xpath = ("//input[@name='middleName']"))
	WebElement PIM_middleName;
	

	@FindBy(xpath = ("//div[@class='orangehrm-edit-employee-name']//h6"))
	WebElement PIM_VerifyEmpAdded;

	@FindBy(xpath = ("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input[1]"))
	WebElement PIM_searchEmployee;
	
	public void PIM_ClickAddEmplyee() {
		PIM_AddEmploye.click();
	}

	public void PIM_AddEmplyeeDetails() throws InterruptedException {
		Thread.sleep(1000);
		
		userName=cs.getSaltString();
		System.out.println("Generated Random String "+userName);
		PIM_firstName.sendKeys(userName);
		Thread.sleep(1000);
		PIM_middleName.sendKeys(cs.getSaltString());
		PIM_lastName.sendKeys(cs.getSaltString());

	}

	public void selectPIM() throws InterruptedException {
		Thread.sleep(2000);
		PIM_option.click();
	}

	public void PIM_save() {
		PIM_Save.click();
	}

	public void verfiyEmpAdded() throws InterruptedException {
		Thread.sleep(500);
		
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  
		  
		  Object EmplyName=executor.executeScript(PIM_VerifyEmpAdded.getText());
		  System.out.println("Name is "+EmplyName);
		 
		//WebElement element = driver.findElement(element locator);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PIM_VerifyEmpAdded); PIM_VerifyEmpAdded.click();
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
		//System.out.println("On Confirmation UserName "+PIM_VerifyEmpAdded.getText());
		//System.out.println("On Confirmation EmplyName "+EmplyName);
		
		Thread.sleep(500);
		//Assert.assertTrue(EmplyName.contains(userName));
		
		
	}
	
	public void searchEmployee() {
    PIM_searchEmployee.sendKeys("Test");
		
	}
	public void employeeList() {
	    PIM_EmployeeList.click();
			
		}
}
