package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.testbase.TestBase;
import com.parasoft.parabank.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.userName("Carl_london");
        homePage.password("ABC1234");
        homePage.logInButton();
        String expectedText = "Accounts Overview";
        String actualText = homePage.accountOverviewText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.userName("Carl_london11");
        homePage.password("ABC1234");
        homePage.logInButton();
        String expectedText = "The username and password could not be verified.";
        String actualText = homePage.errorMessage();
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        homePage.userName("Carl_london");
        homePage.password("ABC1234");
        homePage.logInButton();
        homePage.logOut();
        String expectedText = "Customer Login";
        String actualText = homePage.customerLoginMessage();
        Assert.assertEquals(expectedText,actualText);
    }
}
