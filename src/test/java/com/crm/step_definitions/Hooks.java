package com.crm.step_definitions;

import com.crm.utilies.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java not from junit
//    @Before(order = 0)
//    public void setupScenario(){
//        System.out.println("====Setting up browser using cucumber @Before");
//    }
//
//    @Before (value = "@Login",order = 1)
//    public void setupScenarioForLogins(){
//        System.out.println("====This will only apply to scenarios with @login tag");
//    }

//    @Before (value = "db",order = -1)
//    public void setupForDatabaseScenarios(){
//        System.out.println("====This will only apply to scenarios with @db tag");
//    }

    @After
    public void teardownScenario(Scenario scenario){
        if (scenario.isFailed()) {
            byte []screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        Driver.closeDriver();
        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended take screenshot if failed!");
    }
//    @BeforeStep
//    public void setupStep(){
//        System.out.println("---------> applying setup using @BeforeStep");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("---------> applying tearDown using @AfterStep");
//    }
}
