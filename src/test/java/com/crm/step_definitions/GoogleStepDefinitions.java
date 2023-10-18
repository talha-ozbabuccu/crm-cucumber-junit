package com.crm.step_definitions;

import com.crm.utilies.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        //System.out.println("User is on Google search page");
        Driver.getDriver().get("https://www.google.com");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        //System.out.println("User is seeing title is Google");
        String expectedTitle = "Google";
        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();
    }

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
    }

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
    }
}
