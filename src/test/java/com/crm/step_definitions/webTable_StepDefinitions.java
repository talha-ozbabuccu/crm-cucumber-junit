package com.crm.step_definitions;

import com.crm.pages.WebTableLoginPage;
import com.crm.utilies.BrowserUtils;
import com.crm.utilies.ConfigurationReader;
import com.crm.utilies.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

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
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }


    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String pw) {
//        webTableLoginPage.inputUsername.sendKeys(username);
//        webTableLoginPage.inputPassword.sendKeys(pw);
//        webTableLoginPage.loginButton.click();
        webTableLoginPage.login(username, pw);
    }
    @When("User enters below credential")
    public void user_enters_below_credential(Map<String, String>credentials) {
        //System.out.println("credentials.get(\"username\") = " + credentials.get("username"));
        //System.out.println("credentials.get(\"password\") = " + credentials.get("password"));

//        webTableLoginPage.inputUsername.sendKeys(credentials.get("username"));
//        webTableLoginPage.inputUsername.sendKeys(credentials.get("password"));
//        webTableLoginPage.loginButton.click();

        webTableLoginPage.login(credentials.get("username"), credentials.get("password") );

    }


}
