package com.automation.steps;

import com.automation.pages.Homepage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.time.Duration;

public class womencategorypagesteps {
    @When("^I click on WOMEN tab$")
    public void iClickOnWOMENTab() {
        new Homepage().clickOnWomenTab();
    }

    @Then("^I verify Women text$")
    public void iVerifyWomenText() {
        String expectedMessage="WOMEN ";
        Assert.assertEquals("Women page: ",expectedMessage,new WomenPage().getTextOfWomen());
    }

    @And("^I click on the product \"([^\"]*)\"$")
    public void iClickOnTheProduct(String product)  {
        new WomenPage().clickOnProduct(product);
    }
    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty) throws InterruptedException {
        Thread.sleep(2000);
        new ProductPage().SelectQuantity(qty);
    }



    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size)  {
        new ProductPage().selectSize(size);
    }

    @And("^I select colour \"([^\"]*)\"$")
    public void iSelectColour(String colour)  {
        new ProductPage().selectColour(colour);
    }

    @And("^I click on Add To Cart Button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("^I vetify the message Product successfully added to your shopping cart$")
    public void iVetifyTheMessageProductSuccessfullyAddedToYourShoppingCart(String mess) {
        new ProductPage().verifyProductAddedSuccessfullyMessage(mess);

    }

    @And("^I click on X button and close the popup$")
    public void iClickOnXButtonAndCloseThePopup() {
        new ProductPage().closePopUpMessage();
    }



}
