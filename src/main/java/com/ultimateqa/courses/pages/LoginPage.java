package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By loginPageLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']//a[1]");
    By GetActualWelcomeText = By.xpath("//h1[@class='page__heading' and contains(text(),'Welcome Back!')]");

    By enterUserName = By.name("user[email]");
    By enterPassword = By.name("user[password]");
    By loginButtonClick = By.xpath("//input[@type='submit' and @value='Sign in']");
    By GetInvalidMessageText = By.xpath("//li[@class='form-error__list-item' and contains(text(),'Invalid email')]");


    public void clickOnLoginPage() {
        clickOnElement(loginPageLink);
    }

    public String VerifyWelcomeBackText() {
        return getTextFromElement(GetActualWelcomeText);

    }

    public void setEnterUserName(String userName){
        sendTextToElement(enterUserName,userName);
    }
    public void setEnterPassword(String password){
        sendTextToElement(enterPassword,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButtonClick);
    }
    public String getActualErrorMessage(){
        return getTextFromElement(GetInvalidMessageText);
    }
}
