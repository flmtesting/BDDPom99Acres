package helpers;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "classpath:features/LoginPage2.feature", 
		tags="@wip2606",
		dryRun=true,
		plugin = { "pretty",	
				   "html:target/cucumber-reports/cucumber-pretty",
				   "json:target/cucumber-reports/CucumberTestReport.json",
				   "rerun:target/cucumber-reports/rerun.txt" }, 
		
		glue = { "helpers", "step_definitions" })

public class TestRunner extends  AbstractTestNGCucumberTests  {

}
