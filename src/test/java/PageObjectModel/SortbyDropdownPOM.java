package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortbyDropdownPOM {

	
	
	
	WebDriver driver;
	 
	 public SortbyDropdownPOM (WebDriver driver) {
		 this.driver = driver;
		 
		 PageFactory.initElements(driver,this);
		
	 }
	
	  
	 
	 @FindBy(id="search-field") 
	 WebElement type_searchbox;
	 public WebElement searchbox() { 
		    return type_searchbox;
		    
	 }
		    
		    @FindBy (xpath="//i[@automation-id= 'searchWidgetButton']")
		    WebElement click_searchbutton;
			 public WebElement searchbutton() { 
				    return click_searchbutton;
				    
			 }
		   
		    
		    
		    
		   @FindBy (id="sort_by")
		   public WebElement SoryBy;
		  
		    
			 
	
	
	
	
	
	
	
	
}
