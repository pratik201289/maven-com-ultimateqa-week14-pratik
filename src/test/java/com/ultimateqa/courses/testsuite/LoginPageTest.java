package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        loginPage.clickOnLoginPage();
        Assert.assertEquals(loginPage.VerifyWelcomeBackText(), "Welcome Back!", "Welcome Back Text is not display");


    }

    @Test
    public void verifyTheErrorMessage() {

        loginPage.clickOnLoginPage();
        loginPage.setEnterUserName("pratik.vyas");
        loginPage.setEnterPassword("rio1234");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getActualErrorMessage(), "Invalid email or password.", "Not display Error Message");

    }
}
