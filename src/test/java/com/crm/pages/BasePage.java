package com.crm.pages;

import com.crm.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/*
In this class we will store WebElements common to all pages
that are stored in different page of the application
 */
public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public WebElement viewAllOrders;


}
