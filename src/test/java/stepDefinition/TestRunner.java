package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepDefinition",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/report.html"},
		monochrome = true,
		tags = {"@datadriven"}
		)


public class TestRunner {
	
}
