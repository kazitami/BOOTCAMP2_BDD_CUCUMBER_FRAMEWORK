package com.tutorialsNinja.Runner_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = "src/test/resources/feature_files",
                 glue = {"com.tutorialsNinja.Step_Definitions", "com.tutorialsNinja.Hooks"},
                 tags = "@TutorialsNinjaAddToCart or @TutorialsNinjaSearchProduct"
                 		+ " or @TutorialsNinjaRegistration or @TutorialsNinjaLogin",
                  plugin = {"pretty","html:target/site/cucumber.html", "json:target/cucumber1.json",
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                  monochrome = true,
                  publish = true
                     
		         )

public class TestRunner_JUNIT {
}
// "html:target/site/cucumber.html", "json:target/cucumber1.json",
