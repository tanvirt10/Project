package Stepdef;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjectModel.ComputerAccessoriesPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerAccessories {

	WebDriver driver;
	
	@Given("user visits Costco homepage")
	public void user_visits_costco_homepage() {
	    
		try {
			  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			     //soft wait
			   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			         
			           //how to maximize the browser
			  driver.manage().window().maximize();
			       
			       //how to open url  driver.get method
			   driver.get("https://www.costco.com/");
			        Thread.sleep(5000);
			}
			catch(Exception e) {
				System.out.println("Browser Error");
			}
		
		
	}

	@When("user hovers over Shop and clicks on Computers")
	public void user_hovers_over_shop_and_clicks_on_computers() {
	    try {
		
		Actions hover = new Actions (driver);
		
		ComputerAccessoriesPOM computer = new ComputerAccessoriesPOM (driver);
		
		hover.moveToElement(computer.Shop()).build().perform();
		computer.ComputerA().click();
		
		
		Thread.sleep(5000);
	    }
	    
	    catch (Exception e) {
	    	System.out.println("Error Clicking");
	    }
		
		
		
		
		
	}

	@Then("user will be redirected successfully")
	public void user_will_be_redirected_successfully() {
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
