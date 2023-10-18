package com.crm.pages;

import com.crm.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    //create constructor
    //initialize the driver instance and this class' instance using PageFactory.initelements
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //We can start locating web elements using @FindBy annotation
    @FindBy(name = "q")
    public WebElement searchBox;

}
