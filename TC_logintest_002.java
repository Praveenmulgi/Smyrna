package com.smyrnaqc.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_logintest_002 extends Baseclass {
   
	@Test
	public void exportSO() {
		driver.findElement(By.id("//a[@id='link8']")).click();
		
	}
}
