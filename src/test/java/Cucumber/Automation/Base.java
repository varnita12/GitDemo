package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
  public static WebDriver driver;
  public static Properties prop;
	public static WebDriver getdriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\varni\\eclipse-workspace\\VARN\\Automation\\src\\test\\java\\Cucumber\\Automation\\Global.properties");
		prop.load(fis);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varni\\eclipse-workspace\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(prop.getProperty("URL"));
	    
	    return driver;
	}
	
}
