package com.smyrnaqc.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.smyrnaqc.pageobject.Loginpage;



public class TC_loginTest_001 extends Baseclass {
	
	@Test
	public void logintest() throws InterruptedException {
		driver.get(baseurl);
		Logger.info("url is opened");
		Loginpage lp=new Loginpage(driver);
		Thread.sleep(5000);
		lp.username(username);
		Logger.info("Username entered");
		Thread.sleep(5000);
		lp.pasword(password);
		Logger.info("password entered");
		Thread.sleep(5000);
		lp.clicklogin();
		Logger.info("Login button clicked");
		if(driver.getTitle().equals("Smyrna QC Tool"))
		{
		   Assert.assertTrue(true); 
		   Logger.info("Login sucessfully");
		}else {
			  Assert.assertTrue(false); 
			  Logger.info("Login Failed");
		}
		
		System.out.println(driver.getTitle());
		
	}

}
