package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepDefination 
{
	public WebDriver driver;
	HomePage h;
	  @Given("User is on GreenKart Landing page")
	    public void user_is_on_green_kart_landing_page() throws Throwable 
	    
	    {
	    	driver = Base.getdriver();
		    
	    }
	    
	    @When("User search for (.+) vegitable")
	    public void user_search_for_vegitable(String str1) throws Throwable
	    {
	    	h= new HomePage(driver);
	    	h.getSearch().sendKeys(str1);
	      
	    	//driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys(str1);
	    	Thread.sleep(3000);
	    }
	    @Then("{string} Result is displayed")
	    public void result_is_displayed(String str2) throws Throwable
	    {
	     Assert.assertTrue((driver.findElement(By.cssSelector("h4.product-name")).getText().contains(str2)));
	    
	    }
	  
	    
	    @Then("^(.+) Result is added to checkout page$")
	    public void result_is_added_to_checkout_page(String name) throws Throwable 
	    {
	    	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(name));
	    	
	    }

	    @And("^added item to cart$")
	    public void added_item_to_cart() throws Throwable 
	    {
	        driver.findElement(By.className("increment")).click();
	        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	    }

	    @And("^user proceed to checkout$")
	    public void user_proceed_to_checkout() throws Throwable 
	    {
	       driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img")).click();
	       driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
	       
	    	
	    }
	
}
