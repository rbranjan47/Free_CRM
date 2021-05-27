//Test cases should be Independent of each other
//Each time chrome browser should launched 
//After each test case, browser should closed

package com.crm.qa.bases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.util.utiltest;


public class Base_class
{
	public static WebDriver driver=null;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public Base_class() 
	{
		try
		{
			prop= new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com"
					+ "\\qa\\crm\\config\\Config.properties");
			prop.load(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		 catch(IOException e)
		{
			 e.printStackTrace();
		}	
	}
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		
		if (browsername.equals("chrome"))
		{
			//setting the path of chrome driver
			System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "‪G:\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(browsername.equals("internetexplorer"))
		{
			System.setProperty("webrdriver.ie.driver", "G:\\IE_Driver\\msedgedriver.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(utiltest.Time_out, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(utiltest.Page_Loadout, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	
		driver.get(prop.getProperty("url"));
	}
}
