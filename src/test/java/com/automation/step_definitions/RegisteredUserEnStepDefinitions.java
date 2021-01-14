package com.automation.step_definitions;

import com.automation.pages.BasePage;
import com.automation.pages.RegisteredEnPage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.MobileUtilities;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;

public class RegisteredUserEnStepDefinitions extends BasePage{

    RegisteredEnPage registeredEnPage = new RegisteredEnPage();

    Faker faker = new Faker();
    String fakeName = faker.name().firstName();
    String fakeEmail = fakeName+"@mail.com";

    @Then("user clicks on Sign up button")
    public void user_clicks_on_Sign_up_button() {
        allow.click();
        MobileUtilities.wait(3);
        registeredEnPage.signUpButton.click();
        MobileUtilities.wait(3);
    }

    @Then("user fill credentials and select T&C")
    public void user_fill_credentials_and_select_T_C() {

        System.out.println("fakeName = " + fakeName);
        System.out.println("fakeEmail = " + fakeEmail);
//        registeredEnPage.email.sendKeys(fakeEmail);
//        registeredEnPage.userName.sendKeys(fakeName);
//        registeredEnPage.password.sendKeys(ConfigurationReader.get("password3"));
//        registeredEnPage.repeatPassword.sendKeys(ConfigurationReader.get("password3"));
//        registeredEnPage.gender.sendKeys(ConfigurationReader.get("male"));
//        registeredEnPage.dateOfBirth.sendKeys(ConfigurationReader.get("dob"));
//        registeredEnPage.tAndC.click();
//        MobileUtilities.wait(2);



    }

    @Then("user clicks on done button")
    public void user_clicks_on_done_button() {


    }



}
