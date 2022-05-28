package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.CostcoSignInPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CostcoSignIn {

	WebDriver driver;

@Given("user visit Costco homepage")
public void user_visit_costco_homepage() {
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

@When("user click on Sign In and type valid {string} , invalid {string}")
public void user_click_on_sign_in_and_type_valid_invalid(String string, String string2) {
	try {
	CostcoSignInPOM obj = new CostcoSignInPOM(driver);
	
	obj.SignIn().click();
    obj.email().sendKeys(string);
	obj.pass().sendKeys(string2);
	
	}
	
	catch (Exception e) {
		System.out.println("Error Not Signing In");
	}
	
}

@Then("user click on sign in")
public void user_click_on_sign_in() {
	
	try {
	CostcoSignInPOM obj = new CostcoSignInPOM(driver);
	obj.Submit().click();

	Thread.sleep(5000);
	
	}
	
	catch(Exception e) {
		
		System.out.println("Next button not working");
	}
	
	
	
	
}



}
