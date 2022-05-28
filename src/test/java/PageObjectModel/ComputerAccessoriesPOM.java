package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerAccessoriesPOM {

		 WebDriver driver;
		 
		 public ComputerAccessoriesPOM (WebDriver driver) {
			 this.driver = driver;
			 
			 PageFactory.initElements(driver,this);
			
		 }
		 
		 
		 @FindBy(xpath="//a[@id='navigation-dropdown']")
		  WebElement act_Shop;
		    public WebElement Shop() { 
		    return act_Shop;
		    }
		    
		    
		    @FindBy(xpath="(//a[@href='/computers.html'])[2]")
		
		    WebElement click_Computer;
		    public WebElement ComputerA() { 
			    return click_Computer;
			    }
		 
	
	
	
	
	
	
	
}
