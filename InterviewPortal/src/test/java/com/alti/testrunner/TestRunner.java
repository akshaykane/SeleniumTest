package com.alti.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="FeatureFiles",
		glue={"com.alti.stepdefinition"},
		plugin={"html:target/cucumber-html-report", 
				"json:target/cucumber-json-report.json", 
				"pretty:target/cucumber-pretty-report.txt", 
				"usage:target/cucumber-usage-report.json",
				"junit:target/cucumber-results.xml"
				},
		monochrome=true,
		dryRun = false,
		strict = true
		//tags = {"~@SmokeTest", "@RegressionTest"}
		//plugin={"pretty"}
		)
public class TestRunner {

}




/*
 Cucumber Tags - 
 
> To run tests with @SmokeTest OR @RegressionTest tag, use comma as OR operator for tags - {"@RegressionTest , @SmokeTest"}
> To run tests with @SmokeTest AND @RegressionTest tag, use comma with quotes for AND operator for tags - {"@RegressionTest" , "@SmokeTest"}
> To IGNORE tests with @SmokeTest tag - {"~@SmokeTest"}

*/


/*
Cucumber Hooks - 

@Before @After executed for each scenario 
Important - Import before and after from cucumber api and NOT junit 
import cucumber.api.java.After;
import cucumber.api.java.Before;

*/



/*


Cucumber Tagged Hooks - 

@Before("@ScenarioTag") @After("@ScenarioTag") executed for scenario defined with specified tags
Important - Import before and after from cucumber api and NOT junit 
import cucumber.api.java.After;
import cucumber.api.java.Before;

Order of execution - 
Global before
Tagged before
Method
Global After
Tagged After


Order can also be defined for Hooks like @Before(order=0), @Before(order=1), @After(order=0), @After(order=1) along with @Before() @After()
Order of execution - 
@Before(order=0)
@Before(order=1)
@Before()
Scenario Method
@After()
@After(order=1)
@After(order=0)


*/

