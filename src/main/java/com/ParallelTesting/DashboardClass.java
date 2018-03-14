package com.ParallelTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DashboardClass {
	
	@FindBy(id="primary-header-flight")
	WebElement Flights;
	
	@FindBy(id="flight-origin")
	WebElement flying_from;
	
	@FindBy(id="flight-destination")
	WebElement flying_to;
	@FindBy(id="flight-departing")
	WebElement Departing;
	
	@FindBy(id="flight-returning")
	WebElement Returning;
	
	@FindBy(id="flexibleDate")
	WebElement my_dates_are_flexible;
	
	@FindBy(id="flight-adults")
	WebElement adults_dd;
	
	@FindBy(id="flight-children")
	WebElement childrens_dd;
	
	@FindBy(id="flight-age-select-1")
	WebElement age_dd;
	
	@FindBy(id="advanced-options")
	WebElement advanced_options;
	
	@FindBy(id="advanced-flight-nonstop")
	WebElement nonstop;
	
	@FindBy(id="advanced-flight-refundable")
	WebElement refundable_flight;
	
	@FindBy(id="flight-advanced-preferred-airline")
	WebElement prefered_airline_dd;
	
	@FindBy(id="flight-advanced-preferred-class")
	WebElement prefered_class_dd;
	
	@FindBy(id="flight-add-hotel-checkbox")
	WebElement add_a_hotel;
	
	@FindBy(id="flight-add-car-checkbox")
	WebElement add_a_car;
	
	@FindBy(id="search-button")
	WebElement search;
	
	public void clickFlights() throws InterruptedException
	{
		Flights.click();
		Thread.sleep(3000);
		
		flying_from.clear();
		flying_from.sendKeys("Pune");
		
		Thread.sleep(3000);
		flying_to.clear();
		flying_to.sendKeys("Mumbai");

	    Departing.sendKeys("03/15/2018");
		Returning.sendKeys("03/17/2018");
	
		my_dates_are_flexible.click();
		
		Select sl=new Select(adults_dd);
		sl.selectByVisibleText("2");
		
		Select sl1=new Select(childrens_dd);
		sl1.selectByVisibleText("1");
		
		Select sl2=new Select(age_dd);
		sl2.selectByVisibleText("3");
		
		advanced_options.click();
		refundable_flight.click();
		
		Select s3=new Select(prefered_airline_dd);
		s3.selectByValue("A3");;
		
		Select s4=new Select(prefered_class_dd);
		s4.selectByValue("business");
		
		add_a_car.click();
		
		search.click();
		
	}

}
