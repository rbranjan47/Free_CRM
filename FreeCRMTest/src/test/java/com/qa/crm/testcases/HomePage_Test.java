package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.bases.Base_class;
import com.qa.crm.pages.Calender;
import com.qa.crm.pages.Calls;
import com.qa.crm.pages.Campaign;
import com.qa.crm.pages.Cases;
import com.qa.crm.pages.Contacts;
import com.qa.crm.pages.Deals;
import com.qa.crm.pages.Documents;
import com.qa.crm.pages.Emails;
import com.qa.crm.pages.Forms;
import com.qa.crm.pages.Home_Page;
import com.qa.crm.pages.Tasks;
import com.qa.crm.pages.login;

public class HomePage_Test extends Base_class
{
	Home_Page hp;
	login ln;
	Contacts cn;
	Calender cln;
	Calls cls;
	Campaign cmp;
	Cases cs;
	Documents ds;
	Emails eml;
	Forms frm;
	Tasks tsk;
	Deals dls;
	
	public HomePage_Test()
	{
		super(); //it will constructor of Home Page immadiately
	}
	
	@BeforeMethod
	public void SetUP()
	{
	//Calling method, to set Webdriver
	initialization() ;
	
	 ln=new login();
	 hp=ln.login_page(prop.getProperty("un"), prop.getProperty("pw"));
	 
	  cn=new Contacts();
	  cln=new Calender();
	  cls=new Calls();
	  cmp=new Campaign();
	  cs=new Cases();
	  ds=new Documents();
	  eml=new Emails();
	  frm=new Forms();
	  tsk=new Tasks();
	  dls=new Deals();
	}
	
	@Test(priority = 1)
	public void verifytitle_test()
	{
		String title=hp.verifyhoemtitle();
		Assert.assertEquals(title, "Cogmento CRM", "homePage title not matched");
		System.out.println(title);
	}
	
	@Test(priority = 2)
	public void username_test()
	{
		hp.User_name();
	}
	
	@Test(priority = 3)
	public void contacts_click() throws InterruptedException
	{
		cn=hp.contact_click();
	}
	
	@Test(priority = 4)
	public void Calender_click()
	{
		cln=hp.calender_click();
	}
	
	@Test(priority = 5)
	public void Calls_click() throws InterruptedException
	{
		cls=hp.calls_click();
	}
	
	@Test(priority = 6)
	public void Deals_click() throws InterruptedException
	{
		dls=hp.deals_click();
	}
	
	@Test(priority = 7)
	public void Documents_click() throws InterruptedException
	{
		ds=hp.documents_click();
	}
	
	@Test(priority = 8)
	public void emails_click() throws InterruptedException
	{
		eml=hp.emails_click();
	}
	
	@AfterMethod
	public void finish() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
