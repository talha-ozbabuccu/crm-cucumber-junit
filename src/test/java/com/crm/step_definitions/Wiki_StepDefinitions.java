package com.crm.step_definitions;

import com.crm.pages.WikiSearchPage;
import com.crm.utilies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wiki_StepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String string) {
        wikiSearchPage.searchBox.sendKeys(string);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {

        wikiSearchPage.searchButton.click();

    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String string) {
        //verify actual title contains string (coming from feature file)
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("User sees {string} is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader(String string) {
        Assert.assertTrue(wikiSearchPage.mainHeader.isDisplayed());

        Assert.assertTrue(wikiSearchPage.mainHeader.getText().equals(string));
    }
}
