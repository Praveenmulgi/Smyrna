package com.smyrnaqc.testcases;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	public static Logger Logger;
	@SuppressWarnings("static-access")
	public String baseurl="http://ec2-18-224-1-205.us-east-2.compute.amazonaws.com/QCTestLive/";
	public String username="admin@smyrna.com";
	public String password="123";
	public  static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		BasicConfigurator.configure();
		//System.setProperty("webdriver.chrome.driver", "‪C:/Users/EMPULSE/Downloads/chromedriver_win32 (4)");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Logger = org.apache.log4j.Logger.getLogger("smyrna_QC");
		PropertyConfigurator.configure("log4j.properties");
		
	  
	
	}
	
	
	
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
