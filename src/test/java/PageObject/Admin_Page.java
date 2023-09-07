package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.CommonSteps;

public class Admin_Page {

	public WebDriver driver;
	CommonSteps cs = new CommonSteps();

	public Admin_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement viewAdmin;

	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']//li[2]/span")
	WebElement job_nav;

	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']//li[2]/ul/li[1]")
	WebElement job_tittle;
	@FindBy(xpath = "//div[@class='orangehrm-header-container']/h6")
	WebElement job_tittle_Header;

	public void select_Admin() throws InterruptedException {
		Thread.sleep(1000);
		viewAdmin.click();

	}

	public void select_Job_And_Job_Tittle() throws InterruptedException {
		Thread.sleep(1000);
		job_nav.click();
		Thread.sleep(1000);
		job_tittle.click();

	}

	public void job_Title_pageHeader() throws InterruptedException {
		Thread.sleep(1000);

		String page_Header = job_tittle_Header.getText();
		// Assert.assertEquals(page_Header, "Job Tilkeejr");
		// Assert.assertTrue(page_Header.equals("Jobdshadghs"));
	}

	public void select_All_JobTittles() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
		System.out.println(row.size());
		for (int i = 1; i <= row.size(); i++) {
		String values = driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div/div[2]")) .getText();
		
		System.out.println(values);

		WebElement pageCheck = driver .findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div/div[1]"));
		pageCheck.click();
		}
		Thread.sleep(2000);
		/*
		 * for (int i = 0; i <= row.size(); i++) {
		 * 
		 * Thread.sleep(1000);
		 * 
		 * String values = driver.findElement(By.xpath(
		 * "//div[@class='oxd-table-body']/div[1]/div/div[2]")) .getText();
		 * 
		 * WebElement pageCheck = driver .findElement(By.xpath(
		 * "//div[@class='oxd-table-body']/div[2]/div/div[1]//input"));
		 * pageCheck.click(); System.out.println(values); Thread.sleep(2000); }
		 */
	}

}
