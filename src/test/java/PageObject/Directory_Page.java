package PageObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Step_Def.Base_Test;
import Utilities.CommonSteps;

public class Directory_Page extends Base_Test {
	public WebDriver driver;
	CommonSteps cs = new CommonSteps();

	//public static Logger log ;
	public Directory_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//log = (Logger) LogManager.getLogger("");
	}

	@FindBy(xpath = "//a[@href='/web/index.php/directory/viewDirectory']")
	WebElement viewDirectory;

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
	WebElement directoryRecords;

	@FindBy(xpath = "//div[@class='oxd-grid-3']/div[2]//div[2]//div[2]")
	WebElement directory_Job_T_DrpDwn;

	@FindBy(xpath = "//div[@class='oxd-grid-3']/div[3]//div[2]//div[2]")
	WebElement directory_Lcation_DrpDwn;

	public void viewDirectory() throws InterruptedException {
		viewDirectory.click();
		Thread.sleep(1000);
	}

	public void directoryRecordDetails() throws InterruptedException {
		System.out.println("Number of Employees in Directory_records are " + directoryRecords.getText());
		Thread.sleep(1000);
		int j = 0;
		List<WebElement> directoryEmpl = driver.findElements(By.xpath("//div[@class='oxd-grid-4']//div//p"));
		System.out.println(directoryEmpl.size());
		for (int i = 1; i <=10; i++) {
			Thread.sleep(1000);
			// System.out.println(j++);
			// System.out.println(directoryEmpl.get(i).getText()+" "+j++);
			String emplyeeNames = driver.findElement(By.xpath("//div[@class='oxd-grid-4']//div[" + i + "]//p[1]"))
					.getText();
			System.out.println(emplyeeNames + "" + j++);
			Thread.sleep(1000);
		}

	}

	public void directory_JobTittle_DropDown() throws InterruptedException {

		Thread.sleep(1000);

		directory_Job_T_DrpDwn.click();

		Thread.sleep(1000);
		List<WebElement> drpdwnList = driver
				.findElements(By.xpath("//div[@class='oxd-grid-3']/div[2]//div[2]//div[2]//div"));
		System.out.println(drpdwnList.size());
		for (int i = 1; i <= drpdwnList.size(); i++) {
			String dpList = driver
					.findElement(By.xpath("//div[@class='oxd-grid-3']/div[2]//div[2]//div[2]//div[" + i + "]"))
					.getText();
			// System.out.println(dpList);

		}
		Thread.sleep(1000);
	}

	public void directory_location_DropDown() throws InterruptedException {
//String[] dvalues={"-- Select --","HQ - CA","New York Sales Office","USA","Canadian Regional HQ","Texas R&D"};
		ArrayList<String> al = new ArrayList<String>();
		//al.add("HQ - CA,USA");
		al.add("New York Sales Office");
		//al.add("No Records Found");
		al.add("Canadian Regional HQ");
		al.add("Texas R&D");
		al.add("-- Select --");
		//al.add("USA");

		Thread.sleep(1000);
		directory_Lcation_DrpDwn.click();
		Thread.sleep(1000);
		Set<String> actualset = new HashSet<String>();
		List<WebElement> locationlist = driver
				.findElements(By.xpath("//div[@class='oxd-grid-3']/div[3]//div[2]//div[2]//div"));
		for (int i = 1; i <= locationlist.size(); i++) {
			Thread.sleep(1000);
			WebElement locationList = driver
					.findElement(By.xpath("//div[@class='oxd-grid-3']/div[3]//div[2]//div[2]//div[" + i + "]"));

			actualset.add(locationList.getText());
		}
		if (actualset.contains("No Records Found")) {
			System.out.println("Dropdown is values are Not-Present");
		} else {
			System.out.println(actualset);
			System.out.println("matching Dropdown values are");
			for (int j = 0; j <=3; j++) {
				Iterator<String> it = actualset.iterator();
				if (actualset.contains(al.get(j))) {

					System.out.println( al.get(j));
					//log.info("Logs are working fine");

				}

				else {

					System.out.println("Not-Present" + al.get(j));
				}

			}

		}
	}
}
