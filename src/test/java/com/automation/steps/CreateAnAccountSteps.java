package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.checkerframework.checker.units.qual.C;

public class CreateAnAccountSteps {
    @And("^I enter Email Address$")
    public void iEnterEmailAddress() {
        new CreateAccountPage().enterEmailAddressInCreateAccount();
    }

    @And("^I Click on Create an account button$")
    public void iClickOnCreateAnAccountButton() {
        new CreateAccountPage().clickOnCreateAnAccountButton();
    }

    @And("^I click on Gender radio Button$")
    public void iClickOnGenderRadioButton() {
        new CreateAccountPage().clickOnGenderRadioButton();
    }

    @And("^I enter Firstname$")
    public void iEnterFirstname() {
        new CreateAccountPage().enterFirstname("user");
    }

    @And("^I enter Lastname$")
    public void iEnterLastname() {
        new CreateAccountPage().enterLastname("name");
    }

    @And("^I enter Email$")
    public void iEnterEmail() {
//        new CreateAccountPage().enterAddress("username98gmail.com");
    }

    @And("^I enter Address$")
    public void iEnterAddress() {
        new CreateAccountPage().enterAddress("Cambridge");
    }

    @And("^I enter City$")
    public void iEnterCity() {
        new CreateAccountPage().enterCity("Finix");
    }

    @And("^I enter State$")
    public void iEnterState() {
        new CreateAccountPage().selectStateFromDropDown("New Jersey");
    }

    @And("^I enter Zip/Postal Code$")
    public void iEnterZipPostalCode() {
        new CreateAccountPage().enterPostcode("07019");
    }

    @And("^I enter Country$")
    public void iEnterCountry() {
        new CreateAccountPage().selectCountryFromDropDown();
    }

    @And("^I enter Mobile phone$")
    public void iEnterMobilePhone() {
        new CreateAccountPage().enterMobilePhone("0123456789");
    }

    @And("^I assign an address alias for future reference$")
    public void iAssignAnAddressAliasForFutureReference() {

    }

    @Then("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }



    @And("^I Verify message My Account$")
    public void iVerifyMessageMyAccount() {
        new CreateAccountPage().getTextOfMyAccount();
    }
}
