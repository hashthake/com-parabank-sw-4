package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By signingUpIsEasyMessage = By.xpath("//h1[contains(text(),'Signing up is easy!')]");
    By firstNameField = By.id("customer.firstName");
    By lastNameField = By.id("customer.lastName");
    By addressField = By.id("customer.address.street");
    By cityField = By.id("customer.address.city");
    By stateField = By.id("customer.address.state");
    By zipCodeField = By.id("customer.address.zipCode");
    By phoneNumberField  = By.id("customer.phoneNumber");
    By ssnField = By.id("customer.ssn");
    By userNameField = By.id("customer.username");
    By passwordField = By.id("customer.password");
    By confirmPasswordField = By.id("repeatedPassword");
    By registerBtn = By.xpath("//input[@value='Register']");
    By accountSucessMessage = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");




    public String signingUpIsEasyText(){
        return getTextFromElement(signingUpIsEasyMessage);
    }
    public void firstName(String value){
        sendTextToElement(firstNameField,value);
    }
    public void lastName(String value){
        sendTextToElement(lastNameField,value);
    }
    public void address(String value){
        sendTextToElement(addressField,value);
    }
    public void city(String value){
        sendTextToElement(cityField,value);
    }
    public void state(String value){
        sendTextToElement(stateField,value);
    }
    public void zipCoder(String value){
        sendTextToElement(zipCodeField,value);
    }
    public void phoneNumber(String value){
        sendTextToElement(phoneNumberField,value);
    }
    public void ssn(String value){
        sendTextToElement(ssnField,value);
    }
    public void userName(String value){
        sendTextToElement(userNameField,value);
    }
    public void password(String value){
        sendTextToElement(passwordField,value);
    }
    public void confirmPassword(String value){
        sendTextToElement(confirmPasswordField,value);
    }
    public void clickOnRegisterBtn(){
        clickOnElement(registerBtn);
    }
    public String accountSuccessTxt(){
        return getTextFromElement(accountSucessMessage);
    }
}
