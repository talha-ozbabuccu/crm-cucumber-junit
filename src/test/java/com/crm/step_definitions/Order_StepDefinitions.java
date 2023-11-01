package com.crm.step_definitions;

import com.crm.pages.WebTableLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order_StepDefinitions {

    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        webTableLoginPage.login();
    }

    @When("user selects product type {string}")
    public void userSelectsProductType(String arg0) {
    }

    @And("user enters quantity {string}")
    public void userEntersQuantity(String arg0) {
    }

    @And("user enters costumer name {string}")
    public void userEntersCostumerName(String arg0) {
    }

    @And("user enters street {string}")
    public void userEntersStreet(String arg0) {
    }

    @And("user enters city {string}")
    public void userEntersCity(String arg0) {
    }

    @And("user enters state {string}")
    public void userEntersState(String arg0) {
    }

    @And("user enters zipcode {string}")
    public void userEntersZipcode(String arg0) {
    }

    @And("user selects credit card type {string}")
    public void userSelectsCreditCardType(String arg0) {
    }

    @And("user enterscredit card number {string}")
    public void userEnterscreditCardNumber(String arg0) {
    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String arg0) {
    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {
    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String arg0) {
    }
}
