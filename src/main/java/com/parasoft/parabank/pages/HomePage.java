package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By registerLink = By.xpath("//a[contains(text(),'Register')]");
    By userNameField = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]");
    By passwordField = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]");
    By logInBtnLink = By.xpath("//input[@value='Log In']");
    By accountOverviewMessage = By.xpath("//h1[contains(text(),'Accounts Overview')]");
    By errorMessageText = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");
    By logOutBtn = By.xpath("//a[contains(text(),'Log Out')]");
    By customerLoginText = By.xpath("//h2[contains(text(),'Customer Login')]");

    public void clickOnRegister(){
        clickOnElement(registerLink);
    }
    public void userName(String value){
        sendTextToElement(userNameField,value);
    }
    public void password(String value){
        sendTextToElement(passwordField,value);
    }
    public void logInButton(){
        clickOnElement(logInBtnLink);
    }
    public String accountOverviewText(){
        return getTextFromElement(accountOverviewMessage);
    }
    public String errorMessage(){
        return getTextFromElement(errorMessageText);
    }
    public void logOut(){
        clickOnElement(logOutBtn);
    }
    public String customerLoginMessage(){
        return getTextFromElement(customerLoginText);
    }
}
