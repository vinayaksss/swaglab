package Step_Def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Test {

	public static WebDriver driver;

	public void get_driver() {
	//	if (driver == null) {
		//	driver = new ChromeDriver();
		//}
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//return driver;

	}

	public void closeBrowser() {

		driver.quit();
	}

}