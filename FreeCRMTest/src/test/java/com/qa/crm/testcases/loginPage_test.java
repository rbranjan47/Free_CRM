package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.bases.Base_class;
import com.qa.crm.pages.Home_Page;
import com.qa.crm.pages.login;



public class loginPage_test extends Base_class
{
	login ln;
	Home_Page Homepage;
	
	//Constructor to Use Base_class constructor
	public loginPage_test()
	{
		super();   //it will call super class constructor
		
	}
	
	
	@BeforeMethod
	public void SetUP()
	{
	//Calling method, to set Webdriver
	initialization() ;
	
	 ln=new login();
	
	}
  
	@Test(priority = 1)
	public void linktest()
	{
		String title =ln.loginPage_title();
		//using assert method, to make assertion, to pass the Test case and begain for next
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	
	@Test(priority = 2)
	public void login_check()
	{
		boolean clickable=ln.login_btn_Click();
		Assert.assertEquals(clickable, true);	
	}
	
	@Test(priority = 3)
	public void login_enter()
	{
		Homepage=ln.login_page(prop.getProperty("un"), prop.getProperty("pw"));
	}
	
	
	
	@AfterMethod
	 public void finshing()
	 {
		driver.quit();
	 }
	
}
