package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.ws.wsaddressing.W3CEndpointReference;

public class Homepage extends Utility {

    private static final Logger log=Logger.getLogger(Homepage.class.getName());
    public Homepage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenTab;




    public void clickOnSignInLink(){
        log.info("Clicking On SignIn link by: "+signInLink.toString());
        clickOnElement(signInLink);
    }
    public String getTextOfSignInLink(){
        log.info("Getting Text Of Sign In link :" +signInLink);
        return getTextFromElement(signInLink);
    }
    public void clickOnWomenTab(){
        clickOnElement(womenTab);
    }

}
