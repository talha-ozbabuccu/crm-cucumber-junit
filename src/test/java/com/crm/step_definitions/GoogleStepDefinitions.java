package com.crm.step_definitions;

import com.crm.pages.GoogleSearchPage;
import com.crm.utilies.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER );
    }

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
        String expectedTitle="apple - Google Search";
        String actualTitle=Driver.getDriver().getTitle();
        //Junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals("Title is not as expected!",expectedTitle,actualTitle);
        //Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
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


}
