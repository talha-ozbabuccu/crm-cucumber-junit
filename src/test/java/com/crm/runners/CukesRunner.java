package com.crm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html ",
        features = "src/test/resources/features",
        glue = "com/crm/step_definitions",
        dryRun = false,
        tags = ""
)
public class CukesRunner {

}
