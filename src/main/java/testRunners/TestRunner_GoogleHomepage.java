package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


 
@RunWith(Cucumber.class) // tells junit to run class as cucumber test
@CucumberOptions(features="resources/features", glue="stepDefinitions") //feature- location of feature file, glue- path of step definition class
public class TestRunner_GoogleHomepage {
 
}

