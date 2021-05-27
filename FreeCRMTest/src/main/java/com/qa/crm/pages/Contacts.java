package com.qa.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.crm.qa.bases.Base_class;

public class Contacts extends Base_class 
{
	Home_Page hp;
	//when we have more elements, then we passing directly not by Page factor

	public boolean contactIconVerify()
	{
		 hp=new Home_Page();
		return hp.contact_icon.isDisplayed();
	}
	
	
	public void creatContact()
	{
		//clicking on "new" button
		driver.findElement(By.xpath("//button[@class='ui linkedin button']/../a/button")).click();
		
		//firstname
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Rabi");
		
		//middlename
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ranjan");
		
		//lastname
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kumar");
		
		//company_name
		driver.findElement(By.xpath("//div[@name='company']//input[@type='text']")).sendKeys("ThinkSys Software Pvt Ltd");
		
		//Access
		driver.findElement(By.xpath("//button[normalize-space()='Public']")).click();
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//button[normalize-space()='Private']"))));
		
		//drop-down
		driver.findElement(By.xpath("//div[@class='ui fluid multiple selection dropdown']//i[@class='dropdown icon']")).click();
		
		//selection
		WebElement name=driver.findElement(By.xpath("//span[@class='text'][normalize-space()='Rabi Ranjan Kumar']"));
		wait.until(ExpectedConditions.elementToBeClickable(name));
	    name.click();
	    //tags
	    driver.findElement(By.xpath("//div[@class='ui fluid multiple search selection dropdown']")).sendKeys("Tester");
	    
	    //email
	    driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("rbranjan47@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Personal email, Business, Alt...']")).sendKeys("Personal");
	    
	   //second drop-down
	    driver.findElement(By.xpath("//div[@name='category']//i[@class='dropdown icon']")).click();
	    
	    WebElement contact_category=driver.findElement(By.xpath("//div[@name='category']/../div[4]"));
	    wait.until(ExpectedConditions.elementToBeClickable(contact_category));
	    contact_category.click();
	    
	    //third drop-down
	    driver.findElement(By.xpath("//div[@name='status']//i[@class='dropdown icon']")).click();
	    WebElement dropdown=driver.findElement(By.xpath("//div[@name='status']/../div[3]"));
	    wait.until(ExpectedConditions.elementToBeClickable(dropdown));
	    dropdown.click();
	    
	   //description
	    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("My name is name Rabi Ranjan Kumar");
	    
	    //social
	    driver.findElement(By.xpath("//div[@name='channel_type']//i[@class='dropdown icon']")).click();
	    WebElement social=driver.findElement(By.xpath("//div[@class='three fields']//div[@class='ui field']//div[3]"));
	    wait.until(ExpectedConditions.elementToBeClickable(social));
	    social.click();
	    driver.findElement(By.xpath("//input[@placeholder='LinkedIn profile link']")).sendKeys("rbranjan47");
	    
	    //timezone
	    driver.findElement(By.xpath("//div[@name='timezone']//i[@class='dropdown icon']")).click();
	    driver.findElement(By.xpath("//div[@name='timezone']//input[@type='text']")).sendKeys("India");
	    WebElement timezone=driver.findElement(By.xpath("//div[@name='timezone']/div[2]/div[16]"));
	    wait.until(ExpectedConditions.elementToBeClickable(timezone));
	    timezone.click();
	    
	    //street
	    driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys("Bhuli C Block");
	    driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("Dhanbad");
	    driver.findElement(By.xpath("//input[@placeholder='State / County']")).sendKeys("Jharkhand");
	    driver.findElement(By.xpath("//input[@placeholder='Zip Code']")).sendKeys("828104");
	    
	    driver.findElement(By.xpath("//div[@name='country']//input[@type='text']")).sendKeys("india");
	    WebElement country=driver.findElement(By.xpath("//div[@class='visible menu transition']/div[2]/span"));
	    wait.until(ExpectedConditions.elementToBeClickable(country));
	    country.click();
	    
	    //phone
	    driver.findElement(By.xpath("//div[@name='hint']//input[@type='text']")).sendKeys("india");
	    WebElement phone=driver.findElement(By.xpath("//div[@class='four fields']/div[1]/div/div[2]/div[2]"));
	    wait.until(ExpectedConditions.elementToBeClickable(phone));
	    phone.click();
	    driver.findElement(By.xpath("//input[@placeholder='Number']")).sendKeys("7991129678");
	    driver.findElement(By.xpath("//input[@placeholder='Home, Work, Mobile...']")).sendKeys("Mobile");
	    
	    //add more phone number
	    driver.findElement(By.xpath("//div[@class='four fields']/div[4]/button")).click();
	    //HNADLING SIMILAR ELEMETS GETTING AFTER CLICKING ON ADD BUTTON
	   
	    
	}
}
