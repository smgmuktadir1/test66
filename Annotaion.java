package testingFiless;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaion {

	/* Note: 
	  "BeforeTest" works before the entire test; 
	  "AfterTest" works after the entire test;
	  "BeforeMothod" works before each and every method / all test cases
	  "AfterMethod" works after each and every method /all test cases
	  The above fours are not considered as test and you can write anyone of these anywhere but they will work accordingly.
	 "Before Class"
	 "After Class"
	 
	 */
	
	
	
	@AfterMethod
	public void CheckingMethod ()
	{
		System.out.println("This block will execure after each test");
		
	}
	
	@BeforeMethod
	public void UserIdGeneration ()
	
	{
	
		System.out.println("This block will execute before each test");
		
	}
	
	@BeforeTest 
	public void Cookies ()
	{
		System.out.println("This block shoud be the run before all the test");
		
	}
	
	@AfterTest
	public void Cookiesclose ()
	{
		System.out.println("This block shoud be the run after all the test");
	}
	
	@Test
	
	public void OpeningBrowser ()
	{
	
		System.out.println ("Opening Browser");

	}
	
	@Test 
	public void FlightBooking ()
	{
		System.out.println("Flight Booking");
		
	}



}
