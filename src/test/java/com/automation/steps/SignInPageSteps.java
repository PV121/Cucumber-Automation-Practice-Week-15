package com.automation.steps;

import com.automation.pages.Homepage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ro.Si;
import org.junit.Assert;

public class SignInPageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on SignIn link$")
    public void iClickOnSignInLink() {
        new Homepage().clickOnSignInLink();
    }

    @Then("^I should navigate to SignIn page$")
    public void iShouldNavigateToSignInPage() {
    }


    @And("^Verify that AUTHENTICATION message is displayed$")
    public void verifyThatAUTHENTICATIONMessageIsDisplayed() {
        String expectedMessage="AUTHENTICATION";
        Assert.assertEquals("User is on SignIn page",expectedMessage,new SignInPage().getTextOfAuthentication());
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String userName)  {
        new SignInPage().enterUserName(userName);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new SignInPage().enterPassword(password);
    }

    @Then("^I click on SignIn Button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickOnSignInButton();
    }

    @And("^Verify the error message \"([^\"]*)\"$")
    public void verifyTheErrorMessage(String message)  {
        new SignInPage().getTextOfAuthenticationFailedMessage();
    }

    @And("^I enter EmailID$")
    public void iEnterEmailID() {
        new SignInPage().enterEmailId();
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new SignInPage().enterPassword();
    }

    @Then("^Verity that Sign out link is displayed$")
    public void verityThatSignOutLinkIsDisplayed() {
        String expectedMessage="Sign out";
        Assert.assertEquals("User has successfully loged in",expectedMessage,new SignInPage().getTextOfSignOutLink());
    }

    @And("^I click on Sign Out Link$")
    public void iClickOnSignOutLink() {
        new SignInPage().clickOnSignOutLink();
    }

    @Then("^Verity that Sign In link is displayed$")
    public void verityThatSignInLinkIsDisplayed() {
        String expectedMessage="Sign in";
       Assert.assertEquals("Sign Out successfully ",expectedMessage,new Homepage().getTextOfSignInLink());
    }
}
