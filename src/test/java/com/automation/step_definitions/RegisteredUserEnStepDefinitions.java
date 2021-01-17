package com.automation.step_definitions;

import com.automation.pages.BasePage;
import com.automation.pages.RegisteredEnPage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import com.automation.utilities.MobileUtilities;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

public class RegisteredUserEnStepDefinitions extends BasePage{

    RegisteredEnPage registeredEnPage = new RegisteredEnPage();

    Faker faker = new Faker();
    String fakeName = faker.name().firstName();
    String fakeEmail = fakeName+"@mail.com";

    @Then("user clicks on Sign up button")
    public void user_clicks_on_Sign_up_button() {
        allow.click();
        signUpButton.click();
        //Driver.get().findElementByAccessibilityId("OnboardingLoginView.signUpButton").click();
        MobileUtilities.wait(4);
    }

    @Then("user fill credentials and select T&C")
    public void user_fill_credentials_and_select_T_C() {

        registeredEnPage.email.click();
        MobileUtilities.wait(1);
        registeredEnPage.email.sendKeys(fakeEmail);
        registeredEnPage.userName.click();
        registeredEnPage.userName.sendKeys(fakeName);
        registeredEnPage.password.sendKeys(ConfigurationReader.get("password3"));
        registeredEnPage.repeatPassword.sendKeys(ConfigurationReader.get("password3"));
        registeredEnPage.gender.click();
        registeredEnPage.doneButton.click();
        MobileUtilities.wait(1);
        registeredEnPage.doneButton.click();
        registeredEnPage.tAndC.click();
        MobileUtilities.wait(1);
    }

    @Then("user clicks on done button")
    public void user_clicks_on_done_button() {
        registeredEnPage.registerButton.click();

    }

    @Then("user should add photo")
    public void user_should_add_photo() {
        registeredEnPage.addPhoto.click();
        registeredEnPage.openPhotoLibrary.click();
        registeredEnPage.okButton.click();
        MobileUtilities.wait(2);
        registeredEnPage.selectPhoto.click();
        registeredEnPage.doneButton.click();
        registeredEnPage.finishButton.click();

        MobileUtilities.wait(10);
    }

    @Then("verify new account created successfully")
    public void verify_new_account_created_successfully() {


    }

    @Given("user should logged in")
    public void user_should_logged_in() {
        allow.click();
        signInButton.click();
        registeredEnPage.signInWithEmail.click();

        registeredEnPage.loginEmail.sendKeys(ConfigurationReader.get("email2"));
        registeredEnPage.loginPassword.sendKeys(ConfigurationReader.get("password2"));
        registeredEnPage.loginButton.click();
    }

}
