package com.crm.pages;

import com.crm.utilies.Driver;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
