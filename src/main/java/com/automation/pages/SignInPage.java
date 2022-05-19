package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    private static final Logger log=Logger.getLogger(SignInPage.class.getName());
    public SignInPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement username;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signInButton;

    @CacheLookup
    @FindBy(css = ".page-heading")
    WebElement authenticationFailedMessage;

    @CacheLookup
    @FindBy(linkText = "Sign out")
    WebElement signOutLink;


    public String getTextOfAuthentication(){
        log.info("Getting Authentication Text from: "+authenticationText.toString());
        return authenticationText.getText();
    }
    public void enterUserName(String userName){
        log.info("Sending Password :"+userName+ " to "+username.toString());
        sendTextToElement(username,userName);
    }
    public void enterPassword(String passWord){
        log.info("Sending Password :"+passWord+ " to "+password.toString());
        sendTextToElement(password,passWord);
    }
    public void clickOnSignInButton(){
        log.info("Clicking on sign in button: "+signInButton.toString());
        clickOnElement(signInButton);
    }
    public String getTextOfAuthenticationFailedMessage(){
        log.info("Getting authentication Failed Message Text from: "+authenticationFailedMessage.toString());
        return authenticationFailedMessage.getText();
    }
    public String getTextOfSignOutLink(){
        log.info("Getting Text of sign out link : "+signOutLink);
        return getTextFromElement(signOutLink);
    }
    public void enterEmailId(){
        log.info("entering username96@gmail.com to emialID field: "+username);
        sendTextToElement(username,"username96@gmail.com");
    }
    public void enterPassword(){
        log.info("Entering 123456789 to password field: "+password);
        sendTextToElement(password,"123456789");
    }
    public void clickOnSignOutLink(){
        log.info("Clicking on Sign out link :" +signOutLink);
        clickOnElement(signOutLink);
    }


}
