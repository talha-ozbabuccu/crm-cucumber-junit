package com.crm.step_definitions;

import com.crm.utilies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Wiki_StepDefinitions {
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }
    @When("User types {Steve Jobs} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
    }

}
