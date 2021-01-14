package com.automation.step_definitions;

import com.automation.pages.RegisteredEnPage;
import com.automation.utilities.ConfigurationReader;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;

public class RegisteredUserEnStepDefinitions {

    RegisteredEnPage registeredEnPage = new RegisteredEnPage();

    Faker faker = new Faker();
    String fakeName = faker.name().firstName();
    String fakeLastName = faker.name().lastName();
    String fakeEmail = fakeName+"@mail.com";

    @Then("user clicks on Sign up button")
    public void user_clicks_on_Sign_up_button() {
        registeredEnPage.signUpButton.click();
    }

    @Then("user fill credentials and select T&C")
    public void user_fill_credentials_and_select_T_C() {
        registeredEnPage.email.sendKeys(fakeEmail);
        registeredEnPage.userName.sendKeys(fakeName);
        registeredEnPage.password.sendKeys(ConfigurationReader.get("password3"));
        registeredEnPage.repeatPassword.sendKeys(ConfigurationReader.get("password3"));


    }

    @Then("user clicks on done button")
    public void user_clicks_on_done_button() {


    }



}
