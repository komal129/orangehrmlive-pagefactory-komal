package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ForgotPassword extends Utility {

   // By errorMessage = By.xpath("//form/h6[text() = 'Reset Password']");
    @CacheLookup
    @FindBy(xpath = "//form/h6[text() = 'Reset Password']")
    WebElement errorMessage;
    public ForgotPassword() {
        PageFactory.initElements(driver, this);
    }
    public String getErrorMessage(){
        Reporter.log("User gets error message");
        return getTextFromElement(errorMessage);
    }
}
