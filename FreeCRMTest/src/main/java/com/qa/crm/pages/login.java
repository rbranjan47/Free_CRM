package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.bases.Base_class;

public class login extends Base_class
{
	//defining PAGE FACTORY----> Object Repository
	
	//email address
	@FindBy(name="email")
	WebElement email;
	
	
	//password
	@FindBy(name="password")
	WebElement password;
	
	//login button
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	//forgot pasword
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement forgotbtn;
	
	//Classic CRM btn
	@FindBy(xpath = "//a[contains(text(),'Classic CRM')]")
	WebElement crmbtn;
	
	//signup
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signupbtn;
	
	//Now, Intialize the PAGE OBJECT FACTORY by CONSTRUCTOR
	public login()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Now, Perform different actions 
	public String loginPage_title()
	{
		return driver.getTitle();
	}
	
	public boolean login_btn_Click()
	{
		return loginbtn.isEnabled();
	}
	
	
	//logeed IN into the class
	public Home_Page login_page(String un, String pw)  //this Login is not same as class name
	{
		email.sendKeys(un);
		password.sendKeys(pw);
		
		loginbtn.click();
		 
		return new Home_Page();
		
		//this method is returning Home_Page Class object
	}
	
	
	
}
