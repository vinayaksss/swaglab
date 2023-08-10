package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	
	public WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="user-name")
	WebElement userName;

	@FindBy(id="password")
	WebElement passWord;

	@FindBy(id="login-button")
	WebElement login;

	@FindBy(xpath="//div[@class='header_secondary_container']/span")
	WebElement PageEle;
	

	@FindBy(id="react-burger-menu-btn")
	WebElement mainMenu;
	

	@FindBy(xpath="//nav[@class='bm-item-list']//a[3]")
	WebElement logOut;
	
	public void enterUserName(String Username) {
		userName.sendKeys(Username);
	}
		
	public void enterPassword(String Password) {
		passWord.sendKeys(Password);
		
	}
	
	public void clickLogin() throws InterruptedException {
		
		login.click();
		Thread.sleep(2000);
	}
	
	public void verify_Page_Title() {
		System.out.println(PageEle.getText());
		PageEle.isDisplayed();
	}
	
	public void logout() {
		logOut.click();
		
	}
	public void mainMenu() throws InterruptedException {
		
		mainMenu.click();
		Thread.sleep(2000);
	}
}
