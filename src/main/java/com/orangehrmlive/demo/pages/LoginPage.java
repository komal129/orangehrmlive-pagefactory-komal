package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {

  //  By userNameField = By.name("username");
    @CacheLookup
    @FindBy(name="username")
    WebElement userNameField;
    //By passwordField = By.name("password");
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
   // By loginButton = By.xpath("//button[@type = 'submit']");
    @CacheLookup
    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement loginButton;

   // By errorMessage = By.xpath("//span/h6[text() = 'Dashboard']");
    @CacheLookup
    @FindBy(xpath = "//span/h6[text() = 'Dashboard']")
    WebElement errorMessage;
  //  By forgotPassword = By.xpath("//form/div/p [text() = 'Forgot your password? ']");
    @CacheLookup
    @FindBy(xpath = "//form/div/p [text() = 'Forgot your password? ']")
    WebElement forgotPassword;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String email){
        Reporter.log("Enter username " + email + " to email field " + userNameField.toString());
        sendTextToElement(userNameField, email);
    }

    public void enterPassword(String password){
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        Reporter.log("User clicks on Log In Button");
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        Reporter.log("User gets error message");
        return getTextFromElement(errorMessage);
    }

    public void clickOnForgotPasswordLink(){
        Reporter.log("Clicking on forgot password link");
        clickOnElement(forgotPassword);
    }



}
