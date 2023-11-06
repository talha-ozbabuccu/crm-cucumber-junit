package com.crm.pages;

import com.crm.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrdersPage extends BasePage {
    public ViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //We can locate with custom locators such as css or xpath to handle web tables
    //We need locate first cell of the first row
    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;

}
