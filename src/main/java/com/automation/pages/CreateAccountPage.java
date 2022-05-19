package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {

    private static final Logger log=Logger.getLogger(CreateAccountPage.class.getName());
    public CreateAccountPage() {
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailAddressForCreateAccount;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement maleGenderRadioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement femaleGenderRadioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement address;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postCode;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhone;
    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement alias;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myaccountText;

    public void enterEmailAddressInCreateAccount(){
        sendTextToElement(emailAddressForCreateAccount,"username98@gmail.com");
    }
    public void clickOnCreateAnAccountButton(){
        clickOnElement(createAnAccountButton);
    }
    public void clickOnGenderRadioButton(){
        clickOnElement(maleGenderRadioButton);
    }
    public void enterFirstname(String firstName){
        sendTextToElement(firstname,firstName);
    }
    public void enterLastname(String lastName){
        sendTextToElement(lastname,lastName);
    }
    public void enterPassword(String passWord){
        sendTextToElement(password,passWord);
    }
    public void enterAddress(String Address){
        sendTextToElement(address,Address);
    }
    public void enterCity(String City){
        sendTextToElement(city,City);
    }
    public void selectStateFromDropDown(String State){
        selectByVisibleTextFromDropDown(state,State);
    }
    public void selectCountryFromDropDown(){
        selectByVisibleTextFromDropDown(country,"United States");
    }
    public void enterMobilePhone(String MobilePhone){
        sendTextToElement(mobilePhone,MobilePhone);
    }
    public void clickOnRegisterButton(){
       clickOnElement(registerButton);
    }
    public void enterPostcode(String Postcode){
        sendTextToElement(postCode,Postcode);
    }
    public String getTextOfMyAccount(){
        return getTextFromElement(myaccountText);
    }
}
