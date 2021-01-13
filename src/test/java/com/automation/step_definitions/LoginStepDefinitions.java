package com.automation.step_definitions;

import com.automation.pages.LoginPage;
import com.automation.utilities.MobileUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.automation.utilities.Driver;


public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();



    @Given("should proceed to the login screen")
    public void should_proceed_to_the_login_screen() throws InterruptedException {
        Driver.get().findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]")).click();

        Driver.get().findElementByAccessibilityId("OnboardingLoginView.informationLabel").click();
        Driver.get().findElementByAccessibilityId("LoginOptionsController.emailButton").click();
        Driver.get().findElementByAccessibilityId("EmailOrUsernameInputCell.emailOrUsernameTextField").click();
        Driver.get().findElementByAccessibilityId("EmailOrUsernameInputCell.emailOrUsernameTextField").sendKeys("kadirbalikci@hotmail.com");
        Driver.get().findElementByAccessibilityId("PasswordInputCell.passwordTextField").click();
        Driver.get().findElementByAccessibilityId("PasswordInputCell.passwordTextField").sendKeys("987D412w");
        Driver.get().findElementByAccessibilityId("LoginButtonCell.loginButton").click();

    }

    @When("should proceed to Profile screen")
    public void should_proceed_to_Profile_screen() throws InterruptedException {
        Driver.get().findElementByAccessibilityId("DiscoverViewController.doneButton").click();
        Driver.get().findElementByAccessibilityId("BadgeBarButtonItem.notificationBarButton").click();

        Driver.get().findElement(By.xpath("//XCUIElementTypeApplication[@name=\"La3eb\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]")).click();

        Driver.get().findElementByAccessibilityId("ImageViewCollectionCell.imageView").click();

        Driver.get().findElementByAccessibilityId("More").click();

        Driver.get().findElementByAccessibilityId("Profile").click();

    }
    @Then("should open profile settings and edit")
    public void should_open_profile_settings_and_edit() throws InterruptedException {
        Thread.sleep(3000);
        /*Driver.get().findElementByAccessibilityId("UIBarButtonItem.settingsBarButton").click();
        Thread.sleep(3000);
        Driver.get().findElementByAccessibilityId("SettingsController.SettingsCell.").click();
        Thread.sleep(3000);*/

        Driver.get().findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Edit\"])[1]")).click();
        Thread.sleep(3000);
        Driver.get().findElementByAccessibilityId("AboutmeEditCell.textView").click();
        Driver.get().findElementByAccessibilityId("AboutmeEditCell.textView").clear();
        Driver.get().findElementByAccessibilityId("AboutmeEditCell.textView").sendKeys("king");
        Thread.sleep(3000);


    }



    /*

        it('should select profile', () => {
                $(accountSettingsPage.settingsCell + "1").click();

        it('should fill out the fields', () => {
                editProfilePage.aboutMeTextView.click();
        let randomSentence = chance.sentence({ words: 5 });
        editProfilePage.aboutMeTextView.clearValue();
        editProfilePage.aboutMeTextView.setValue(randomSentence);

        editProfilePage.nameTextField[0].click();
        editProfilePage.nameTextField[0].setValue(firstName);

        editProfilePage.nameTextField[1].click();
        editProfilePage.nameTextField[1].setValue(lastName);

        editProfilePage.birthdayTextField.click();
        globalPage.doneButton.click();

        editProfilePage.saveButton.waitForEnabled();
        editProfilePage.saveButton.click();

*/
}
