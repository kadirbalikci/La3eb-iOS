package com.automation.step_definitions;

import com.automation.pages.BasePage;
import com.automation.pages.MorePage;
import com.automation.pages.ShopPage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.MobileUtilities;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class RegisteredUserEnStepDefinitions extends BasePage{

    MorePage morePage = new MorePage();
    ShopPage shopPage = new ShopPage();
    

    Faker faker = new Faker();
    String fakeName = faker.name().firstName() + "1234";
    String fakeEmail = fakeName+"@mail.com";

    @Then("user clicks on Sign up button")
    public void user_clicks_on_Sign_up_button() {
        allow.click();
        signUpButton.click();
        MobileUtilities.wait(4);
    }

    @Then("user fill credentials and select T&C")
    public void user_fill_credentials_and_select_T_C() {

        morePage.email.click();
        MobileUtilities.wait(1);
        morePage.email.sendKeys(fakeEmail);
        morePage.userName.click();
        morePage.userName.sendKeys(fakeName);
        morePage.password.sendKeys(ConfigurationReader.get("password3"));
        morePage.repeatPassword.sendKeys(ConfigurationReader.get("password3"));
        morePage.gender.click();
        morePage.doneButton.click();
        MobileUtilities.wait(1);
        morePage.doneButton.click();
        morePage.tAndC.click();
        MobileUtilities.wait(1);
    }

    @Then("user clicks on done button")
    public void user_clicks_on_done_button() {
        morePage.registerButton.click();

    }

    @Then("user should add photo")
    public void user_should_add_photo() {
        MobileUtilities.wait(3);
        morePage.addPhoto.click();
        morePage.openPhotoLibrary.click();
        morePage.okButton.click();
        MobileUtilities.wait(2);
        morePage.selectPhoto.click();
        MobileUtilities.wait(2);
        morePage.doneButton.click();
        MobileUtilities.wait(2);
        morePage.finishButton.click();
        MobileUtilities.wait(3);
        morePage.skipButton.click();
        MobileUtilities.wait(2);
        skipButton.click();
        MobileUtilities.wait(2);
    }

    @Then("verify new account created successfully")
    public void verify_new_account_created_successfully() {
        Assert.assertTrue(homeHeader.isDisplayed());
    }

    @Given("user should logged in")
    public void user_should_logged_in() {
        allow.click();
        signInButton.click();
        MobileUtilities.wait(2);
        morePage.signInWithEmail.click();
        MobileUtilities.wait(2);
        morePage.loginEmail.click();
        morePage.loginEmail.sendKeys(ConfigurationReader.get("email2"));
        morePage.loginPassword.sendKeys(ConfigurationReader.get("password2"));
        morePage.loginButton.click();
    }

    @Then("user should add multiple product to cart")
    public void user_should_add_multiple_product_to_cart() {


//        morePage.shopButton.click();
//        morePage.






    }

    @Then("user should add promo code")
    public void user_should_add_promo_code() {


    }
}
