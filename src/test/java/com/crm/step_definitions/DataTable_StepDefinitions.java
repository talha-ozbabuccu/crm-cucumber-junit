package com.crm.step_definitions;

import com.crm.pages.DropdownsPage;
import com.crm.utilies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String>fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String>expecetedMonths) {

        Select select=new Select(dropdownsPage.monthDropdown);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();
        //create a List of string and pass all the actual web element options' string into that new list

        List<String>actualOptionsAsString= new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }

        Assert.assertEquals(expecetedMonths,actualOptionsAsString);
        //Assert will check the size ofhe lists first. If it is matching it will check content 1 by 1.


    }
}
