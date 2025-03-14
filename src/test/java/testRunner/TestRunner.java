package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features/myfeature4.feature",
		glue={"stepDefinition","applicationHooks"},   //name of package 
		tags="@smoke",
		plugin= {"html:target/cucmberHtmlRep.html",
				"json:target/cucumberJsonRep.json"}
		  
		
		)
public class TestRunner {

}
