package TestRunner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
	features="Feature",	
	glue="StepDef",
		
	tags="@Logout"	
		)

public class TC002_Logout extends AbstractTestNGCucumberTests {}



