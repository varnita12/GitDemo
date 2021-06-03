package StepDefination;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base
{
 
	@Before("@Sanity")
		public void beforevalidation()
	{
     
		System.out.println("Before Sanity Check");
		
	}
	
	@After("@Sanity")
		public void aftervalidation()
	{
     
		System.out.println("After Sanity Check");
		
	}
	@After("@SeleniumTest")
	public void afterselenium()
{
 
	driver.close();
	
}
}
