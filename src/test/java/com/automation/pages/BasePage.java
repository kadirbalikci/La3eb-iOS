package com.automation.pages;

import com.automation.utilities.Driver;
import com.automation.utilities.MobileUtilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @AndroidFindBy(id = "com.etsy.android:id/btn_link")
    private MobileElement getStarted;

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }


    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
    public MobileElement allow;

    @FindBy(id = "OnboardingLoginView.continueAsGuestButton")
    public MobileElement continueAsAGuest;

    @FindBy(id = "DiscoverViewController.doneButton")
    public MobileElement skipButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Shop\"]")
    public MobileElement shop;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Connect\"]")
    public MobileElement connect;

    @FindBy(id = "HomeController.Optional<UITextField>")
    public MobileElement searchBox;





    public void clickOnGetStarted() {
        MobileUtilities.waitForPresence(By.id("com.etsy.android:id/btn_link"));
        getStarted.click();
    }
}
