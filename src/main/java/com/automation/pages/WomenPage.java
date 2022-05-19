package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenPage.class.getName());
    public WomenPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/h1[1]/span[1]")
    WebElement womenText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement blouse;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement printedDress;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[7]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement printedChiffonDress;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement printedSummerDress;



    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement sizeDropDown;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='clearfix']/div[1]/h2")
    WebElement popUpMessageTextLink;

    @FindBy(xpath = "//span[@title='Close window']")
    WebElement popUpCloseButtonLink;

    public String getTextOfWomen(){
        return womenText.getText();
    }
    public void clickOnProduct(String Product){
        if (Product.equalsIgnoreCase("blouse")){
            clickOnElement(blouse);
        }else if (Product.equalsIgnoreCase("Printed Dress")){
            clickOnElement(printedDress);
        }else if (Product.equalsIgnoreCase("Printed Chiffon Dress")){
            clickOnElement(printedChiffonDress);
        }else if (Product.equalsIgnoreCase("Printed Summer Dress With Price $28.98")){
            clickOnElement(printedSummerDress);
        }else {
            System.out.println("Select Product");
        }
    }




}
