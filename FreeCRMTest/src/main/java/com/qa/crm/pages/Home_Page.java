package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.bases.base_class;

public class Home_Page extends base_class
{
	@FindBy(xpath = "//span[contains(text(),'Rabi Ranjan Kumar')]")
	WebElement name;
	
	@FindBy(xpath = "//i[@class='users icon']")
	WebElement contact_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement Contacts;  //we can click on contacts by Actions Class(Hover)
	
	@FindBy(xpath = "//i[@class='money icon']")
	WebElement deal_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement deals;
	
	@FindBy(xpath = "//i[@class='money icon']/../../../div[6]")
	WebElement tasks_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasks;
	
	@FindBy(xpath = "//i[@class='money icon']/../../../div[1]")
	WebElement calender_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Calender')]")
	WebElement calender;
	
	@FindBy(xpath = "//i[@class='money icon']/../../../div[4]")
	WebElement companies_icon;
	
	@FindBy(xpath = "")
	WebElement Companies;
	
	@FindBy(xpath = "//i[@class='money icon']/../../../div[7]")
	WebElement cases_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Cases')]")
	WebElement cases;
	
	@FindBy(xpath = "//i[@class='money icon']/../../../div[8]")
	WebElement calls_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Calls')]")
	WebElement calls;
	
	@FindBy(xpath = "//i[@class='money icon']/../../../div[9]")
	WebElement documents_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Documents')]")
	WebElement documents;
	
	@FindBy(xpath = "//i[@class='money icon']/../../../div[10]")
	WebElement emails_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Email')]")
	WebElement emails;
	
	@FindBy(xpath = "//i[@class='money icon']/../../../div[11]")
	WebElement campaign_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Campaigns')]")
	WebElement campaign;
	
	@FindBy(xpath = "//i[@class='money icon']/../../../div[12]")
	WebElement forms_icon;
	
	@FindBy(xpath = "//span[contains(text(),'Forms')]")
	WebElement forms;
	
	//Intializing the Page Object
	public Home_Page()
	{
		PageFactory.initElements(driver, this);  //here, this --> Active all Declared Webelements
	}
	
	
	//performing actions on it
	public String verifyhoemtitle()
	{
		return driver.getTitle();
	}
	
	public boolean User_name()
	{
		return name.isDisplayed();
	}
	
	public Calender calender_click() 
	{
		Actions act=new Actions(driver);
		act.moveToElement(calender_icon);
		calender.click();
		return new Calender();
	}
	
	public Contacts contact_click() throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(contact_icon).build().perform();
		Thread.sleep(2000);
		Contacts.click();
		
		return new Contacts();
	}
	
	public Companies companies_click() throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(companies_icon).build().perform();
		Thread.sleep(2000);
		Companies.click();
		return new Companies();
	}
	
	public Deals deals_click() throws InterruptedException
	{
		Actions acts=new Actions(driver);
		acts.moveToElement(deal_icon);
		Thread.sleep(2000);
		deals.click();
		
		return new Deals();
	}
	
	public Tasks tasks_click() throws InterruptedException
	{
		Actions acts=new Actions(driver);
		acts.moveToElement(contact_icon).build().perform();
		Thread.sleep(2000);
		Contacts.click();
		return new Tasks();
	}	
	
	public Cases cases_click() throws InterruptedException
	{
		Actions acts=new Actions(driver);
		acts.moveToElement(contact_icon).build().perform();
		Thread.sleep(2000);
		Contacts.click();
		return new Cases();
	}
	
	public Calls calls_click() throws InterruptedException
	{
		Actions acts=new Actions(driver);
		acts.moveToElement(contact_icon).build().perform();
		Thread.sleep(2000);
		Contacts.click();
		return new Calls();
	}
	
	public Documents documents_click() throws InterruptedException
	{
		Actions acts=new Actions(driver);
		acts.moveToElement(contact_icon).build().perform();
		Thread.sleep(2000);
		Contacts.click();
		return new Documents();
	}
	
	public Emails emails_click() throws InterruptedException
	{
		Actions acts=new Actions(driver);
		acts.moveToElement(contact_icon).build().perform();
		Thread.sleep(2000);
		Contacts.click();
		return new Emails();
	}
	
	public Campaign campaign_click() throws InterruptedException
	{
		Actions acts=new Actions(driver);
		acts.moveToElement(contact_icon).build().perform();
		Thread.sleep(2000);
		Contacts.click();
		return new Campaign();
	}
	
	public Forms forms_click() throws InterruptedException
	{
		Actions acts=new Actions(driver);
		acts.moveToElement(contact_icon).build().perform();
		Thread.sleep(2000);
		Contacts.click();
		return new Forms();
	}
}
