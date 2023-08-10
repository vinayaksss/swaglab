package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Step_Def.Base_Test;

public class CommonSteps extends Base_Test{
	
	//public WebDriver driver=Base_Test.get_driver() ;
	 public Properties prop;
	//String path="config.properties";
	public CommonSteps() {
	File src = new File("C:\\Users\\svinayak\\eclipse-workspace\\Swag_labs\\config\\config.properties");
	try {
		FileInputStream fis = new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
	} catch (Exception e) {
		System.out.println("Exception is : " + e.getMessage());
	}
}

	
	public void verifyButtonIsDisplayed(WebElement ele) {
		Boolean value=ele.isDisplayed();
		System.out.println("Add Customer Button is Displayed ? Yes : "+value);
	}

	public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
	}


public String getUrl() {
	String url=prop.getProperty("url");
	System.out.println("Url is ++++++++++"+url);
	return url;
}

public void selectDropDown() {
	
	

}
	
	
    
}
