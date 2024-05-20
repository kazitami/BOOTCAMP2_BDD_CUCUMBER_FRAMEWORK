package com.tutorialsNinja.Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/feature_files",
        glue = {"com.tutorialsninja.Step_Definitions", "com.tutorialsninja.Hooks"},
        tags = "@TutorialsNinjaLogin or @TutorialsNinjaRegistration or @TutorialsNinjaSearchProduct "
        		+ "or @TutorialsNinjaAddToCart or @TutorialsNinjaLogout",
         plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"}
            
        )

public class Runner_TestNG extends AbstractTestNGCucumberTests{

}
