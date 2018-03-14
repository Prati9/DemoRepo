package com.ParallelTesting;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
  
	public WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void initializeBrowser(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
		 System.setProperty("webdriver.gecko.driver", "C:\\Eclipse neon\\geckodriver\\geckodriver.exe");
	     driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome"))
		{
		  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse neon\\Chromedriver2.35\\chromedriver.exe");
		  driver=new ChromeDriver();
		}
		
		 driver.get("https://www.orbitz.com/Flights");
		 // driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  DashboardClass dash= PageFactory.initElements(driver, DashboardClass.class );
		  dash.clickFlights();
	}
	
	  
  }
    
	
  

