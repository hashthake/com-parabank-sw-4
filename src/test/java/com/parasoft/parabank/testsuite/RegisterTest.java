package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSignInPageDisplay(){
        homePage.clickOnRegister();
        String expectedText = "Signing up is easy!";
        String actualText = registerPage.signingUpIsEasyText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        homePage.clickOnRegister();
        registerPage.firstName("Carl");
        registerPage.lastName("Barby");
        registerPage.address("20 Carl Street");
        registerPage.city("London");
        registerPage.state("Middlesex");
        registerPage.zipCoder("CV11VC");
        registerPage.phoneNumber("1234567891");
        registerPage.ssn("345");
        registerPage.userName("Carl_london");
        registerPage.password("ABC1234");
        registerPage.confirmPassword("ABC1234");
        Thread.sleep(2000);
        registerPage.clickOnRegisterBtn();
        String expectedText = "Your account was created successfully. You are now logged in.";
        String actualMessage = registerPage.accountSuccessTxt();

    }
}
