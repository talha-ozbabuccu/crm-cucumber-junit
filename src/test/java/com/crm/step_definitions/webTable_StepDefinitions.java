package com.crm.step_definitions;

import com.crm.pages.WebTableLoginPage;
import com.crm.utilies.BrowserUtils;
import com.crm.utilies.ConfigurationReader;
import com.crm.utilies.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webTable_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url= ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }
    @When("user enters username {string}")
    public void userEntersUsername(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginButton.click();
    }
    @Then("user shoul see url contains orders")
    public void user_shoul_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }


    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String pw) {
        webTableLoginPage.inputUsername.sendKeys(username);
        webTableLoginPage.inputPassword.sendKeys(pw);
        webTableLoginPage.loginButton.click();
    }
}
