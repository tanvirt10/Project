package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		features = {"Features"},
		glue = {"Stepdef"}
		)
public class TestNgRunner extends AbstractTestNGCucumberTests {

}
