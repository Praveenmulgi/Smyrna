package com.smyrnaqc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
       WebDriver ldriver;
 
  public Loginpage(WebDriver rdriver){
	  ldriver=rdriver;
	  PageFactory.initElements(rdriver, this);  
  }
  
  
    @FindBy(id="txtlogin")
    WebElement email;
    
    @FindBy(id="txtpassword")
    WebElement password;
    
    @FindBy(name="button")
    WebElement btnlogin;
    
  
   public void username(String name) {
	   
	   email.sendKeys(name);
	     
   }
   public void pasword(String pwd) {
	   
	   password.sendKeys(pwd);
   }
   public void clicklogin()
   
   {
	   btnlogin.click();
   }
}
