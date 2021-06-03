package StepDefination;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination 
{
	WebDriver driver;
	 @Given("^User is on Netbanking landing Page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable 
	    {
	        //code
		 System.out.println("OPen landing page");
		 
	    }

	 @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("Validate the browser");
	    }

	    @When("^launch the browser$")
	    public void launch_the_browser() throws Throwable {
	    	System.out.println("launch the browser");
	    }


	 @When("^User login into application  with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable
	    {
		 System.out.println(strArg1);
		 System.out.println(strArg2);
	    }

	  @When("^User Sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) throws Throwable 
	    {
	     List<List<String>> obj = data.asLists();
	     System.out.println(obj.get(0).get(0));
	     System.out.println(obj.get(0).get(1));
	     System.out.println(obj.get(0).get(2));
	     System.out.println(obj.get(0).get(3));
	     System.out.println(obj.get(0).get(4));
	    }
	  
	  @When("^User logs in Netbanking using (.+) and (.+)$")
	    public void user_logs_in_netbanking_using_and(String username, String password) throws Throwable 
	    {
	    System.out.println(username);
	    System.out.println(password);
	    }  
		  
	 
	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable 
	    {
	        //code
	    	System.out.println("Home page is populated");
	    }
	    
	    @Then("^check if home page is loaded$")
	    public void check_if_home_page_is_loaded() throws Throwable {
	    	System.out.println("Check if home page is loaded");
	    }

	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String Arg1) throws Throwable
	    {
	    System.out.println(Arg1);
	    	
	    }
	
	    @And("^Cards is displayed are (.+)$")
	    public void cards_is_displayed_are(String cards) throws Throwable 
	    {
	       System.out.println(cards); 

	   }
	   
	     
	    
	    
}

