package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banker_Login_Page {
	public WebDriver driver;
	
	public Banker_Login_Page() {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@ng-click='manager()']")
	WebElement bankerLogin;
	
	
	public void bankerLogin() {
		System.out.println(bankerLogin.getText());
		bankerLogin.click();

		//Add_Customer_Page acp= new Add_Customer_Page(this.driver);
	}
	
	

}
