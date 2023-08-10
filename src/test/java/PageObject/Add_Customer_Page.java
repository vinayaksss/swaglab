package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Step_Def.Base_Test;

public class Add_Customer_Page extends Base_Test {
	
////public WebDriver driver=Base_Test.get_driver();
	
	public Add_Customer_Page() {
	//	this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//button[@ng-click='addCust()']")
	public  WebElement addCustomer;
	


	@FindBy(xpath="//button[@class='btn btn-default']")
	public  WebElement addCustomerD;
	
	
	
	@FindBy(xpath="//input[@ng-model='fName']")
	public  WebElement firstName;
	

	@FindBy(xpath="//input[@ng-model='lName']")
	public  WebElement lastName;
	

	@FindBy(xpath="//input[@ng-model='postCd']")
	public  WebElement postCode;
	@FindBy(xpath="//button[@ng-click='home()']")
	public  WebElement home;


	public void clickAddCustomer() throws InterruptedException {
		addCustomer.click();
		Thread.sleep(1000);
		
		
	}
	
	public void addCustomerDetails() throws InterruptedException {
		Thread.sleep(1000);
		firstName.sendKeys("VinaTest");
		Thread.sleep(2000);
		lastName.sendKeys("Sonar");
		Thread.sleep(1000);
		postCode.sendKeys("56789393");
		Thread.sleep(2000);

		addCustomerD.click();
		Thread.sleep(3000);
		
		
	}
	
	public void ExceptAlert() throws InterruptedException {
		String Message=driver.switchTo().alert().getText();
		System.out.println("Pop Up"+Message);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}
	
	public void homeButton() throws InterruptedException {
		Thread.sleep(1000);
		home.click();
		
		Thread.sleep(500);
	}
	
	
	
	
	
	
	
	
	
}
