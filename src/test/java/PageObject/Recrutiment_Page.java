package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.CommonSteps;

public class Recrutiment_Page {

	public WebDriver driver;
	CommonSteps cs = new CommonSteps();

	public Recrutiment_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")
	WebElement viewRecrutiment;

	@FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab']//a[1]")
	WebElement vacancies;

	@FindBy(xpath = "//div[@class='oxd-form-row']//div[4]//div[2]//div[1]/div[1]")
	WebElement statusDropdown;

	@FindBy(xpath = "//div[@role='listbox']//div[2]//span")
	WebElement statusDropdownlistActive;

	@FindBy(xpath = "//div[@role='listbox']//div[3]//span")
	WebElement statusDropdownlistclosed;

	@FindBy(xpath = "//div[@role='listbox']//div")
	WebElement statusDropdownSize;

	@FindBy(xpath = "//div[@class='oxd-form-actions']//button[2]")
	WebElement recSearch;

	@FindBy(xpath = "//div[@class='oxd-form-actions']//button[1]")
	WebElement recReset;

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
	WebElement vacanciesRecods;

	@FindBy(xpath = "//div[@class='oxd-table-card']")
	WebElement recodsDetails;

	public void selectRecrutiment() throws InterruptedException {
		Thread.sleep(1000);
		viewRecrutiment.click();
	}

	public void clickOnVacancies() throws InterruptedException {
		// Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", vacancies);
		System.out.println("Button Test" + vacancies.getText());
		Thread.sleep(2000);
	}

	public void selectDropDownvalue(String dropV) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Value from Feature File " + dropV);
		statusDropdown.click();

		List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']//div"));
		System.out.println("List Size is " + list.size());
		for (int i = 1; i < list.size(); i++) {
			int j = i;
			// statusDropdown.click();
			String dropvalue = list.get(i).getText();
			System.out.println("Status DropDown Values are " + i + dropvalue);

			if (dropvalue.equals(dropV)) {
				System.out.println("Inside if Loop" + dropvalue + dropV);
				// System.out.println("IIIIII"+i);
				i++;
				driver.findElement(By.xpath("//div[@role='listbox']//div[" + i + "]//span[1]")).click();
				// System.out.println("IIIIII"+i);

			}

		}
		Thread.sleep(2000);
		// statusDropdownlist.click();
		// System.out.println(driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']")).getText());

	}

	public void recSearch() throws InterruptedException {
		Thread.sleep(1000);
		recSearch.click();

	}

	public void recReset() throws InterruptedException {
		Thread.sleep(1000);
		recReset.click();

	}

	public void vancanciesRecord() throws InterruptedException {
		Thread.sleep(1000);
		String records = vacanciesRecods.getText();
		System.out.println(records);

	}

	public void recordDetails() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> rowSize = driver.findElements(By.xpath("//div[@class='oxd-table-body']//div//label"));
		List<WebElement> colSize = driver.findElements(By.xpath("//div[attribute::role='columnheader']"));
		String Vacancy = null;
		System.out.println("Col Size  " + colSize.size());
		for (int j = 0; j < colSize.size(); j++) {

			System.out.println(colSize.get(j).getText());
		}
		if (rowSize.size() != 0) {
			int i = 1;
			// for(int i=1;i<=rowSize.size();i++)
			while (i <= rowSize.size()) {
				System.out.println("Following are the Active vacancy ");
				for (int k = 2; k <= colSize.size() - 1; k++) {

					Vacancy = driver
							.findElement(By.xpath("//div[@class='oxd-table-body']//div[" + i + "]//div[" + k + "]"))
							.getText();

					System.out.println(Vacancy);

				}
				i++;
			}
		}
	}

	public void getDetailsByVacancy(String vac) throws InterruptedException {

		Thread.sleep(1000);
		List<WebElement> rowSize = driver.findElements(By.xpath("//div[@class='oxd-table-body']//div//label"));
		List<WebElement> colSize = driver.findElements(By.xpath("//div[attribute::role='columnheader']"));
			if (rowSize.size() != 0) {
			int i = 1;
						while (i <= rowSize.size()) {
					WebElement Vacancy = driver.findElement(By.xpath("//div[@class='oxd-table-body']//div[" + i + "]//div[2]"));
				
					if (Vacancy.getText().equals(vac)) {
				
				for (int k = 2; k <= colSize.size() - 1; k++) {

					String Vacancy1 = driver
							.findElement(By.xpath("//div[@class='oxd-table-body']//div[" + i + "]//div[" + k + "]"))
							.getText();

					System.out.println(Vacancy1);
					
					
				}
				//break;
			}
i++;
		}

	}}
}
