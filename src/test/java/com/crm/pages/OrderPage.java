package com.crm.pages;

import com.crm.utilies.Driver;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
