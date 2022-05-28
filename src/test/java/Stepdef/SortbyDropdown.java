package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.SortbyDropdownPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortbyDropdown {

	WebDriver Driver; 
	
	@Given("user goes to Costco home")
	public void user_goes_to_costco_home() {
	  
		
		try {
			  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  Driver = new ChromeDriver();
			     //soft wait
			   Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			         
			           //how to maximize the browser
			  Driver.manage().window().maximize();
			       
			       //how to open url  driver.get method
			   Driver.get("https://www.costco.com/");
			        Thread.sleep(5000);
			}
			catch(Exception e) {
				System.out.println("Browser Error");
			}
		
		
		
		
		
	}

	@When("user types {string} and clicks search button")
	public void user_types_and_clicks_search_button(String string) {
	    
		
		try {
			
			
			
			SortbyDropdownPOM proj = new SortbyDropdownPOM(Driver);
			proj.searchbox().sendKeys(string);
			proj.searchbutton().click();
			
			
			Thread.sleep(3500);
		}	
			catch(Exception e) {
				System.out.println("Error Click Search");
			}
			
			
			
			
		
		
		
	}

	@When("user clicks sort by dropdown and select one of the sort option")
	public void user_clicks_sort_by_dropdown_and_select_one_of_the_sort_option() {
	    
		try {
		
		
		SortbyDropdownPOM sort = new SortbyDropdownPOM(Driver);
		
		Select dropdown = new Select (sort.SoryBy);
		
		dropdown.selectByIndex(3);
		
		Thread.sleep(3000);
		}
		catch (Exception e) {
			
			System.out.println("Error In Dropdown");
		}
		
		
		
	}

	@Then("user will be able to see the results sorted out successfully")
	public void user_will_be_able_to_see_the_results_sorted_out_successfully() {
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
