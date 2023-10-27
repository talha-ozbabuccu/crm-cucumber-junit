package com.crm.pages;

import com.crm.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "username")
    public WebElement inputUsername;
    @FindBy(name = "password")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;



}
