package com.automation.pages;

import com.automation.utilities.Driver;
import com.automation.utilities.MobileUtilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @AndroidFindBy(id = "com.etsy.android:id/btn_link")
    private MobileElement getStarted;

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }

    Actions actions = new Actions(Driver.get());


    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
    public MobileElement allow;

    @FindBy(name = "Login")
    public MobileElement errorLoginButton;

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

    @FindBy(id = "OnboardingLoginView.signUpButton")
    public MobileElement signUpButton;

    @FindBy(id = "OnboardingLoginView.informationLabel")
    public MobileElement signInButton;

    @FindBy(name = "Welcome La3eb")
    public MobileElement homeHeader;

    @FindBy(name = "أهلاً بك La3eb")
    public MobileElement homeHeaderArabic;

    @FindBy(id = "LoginOptionsController.emailButton")
    public MobileElement signInWithEmail;

    @FindBy(id = "EmailOrUsernameInputCell.emailOrUsernameTextField")
    public MobileElement loginEmail;

    @FindBy(id = "PasswordInputCell.passwordTextField")
    public MobileElement loginPassword;

    @FindBy(id = "LoginButtonCell.loginButton")
    public MobileElement loginButton;

    @FindBy(className = "UITableTextAccessibilityElement")
    public MobileElement homePage;

    @FindBy(id = "FeaturedCell.pageControl")
    public MobileElement homePage2;

    @FindBy(id = "Next")
    public MobileElement nextButton;

    @FindBy(id = "EmailInputCell.emailTextField")
    public MobileElement email;

    @FindBy(id = "UsernameInputCell.usernameTextField")
    public MobileElement userName;

    @FindBy(id = ".newPassword")
    public MobileElement password;

    @FindBy(id = ".repeatPassword")
    public MobileElement repeatPassword;

    @FindBy(id = "GenderInputCell.genderTextField")
    public MobileElement gender;

    @FindBy(name = "Done")
    public MobileElement doneButton;

    @FindBy(id = "BirthDateInputCell.dateTextField")
    public MobileElement dateOfBirth;

    @FindBy(id = "CheckBoxView.checkButton")
    public MobileElement tAndC;

    @FindBy(id = "RegisterHolderController.registerButton")
    public MobileElement registerButton;

    @FindBy(id ="RegistrationSummaryController.addPhotoButton")
    public MobileElement addPhoto;

    @FindBy(name = "Open photo library")
    public MobileElement openPhotoLibrary;

    @FindBy(name = "OK")
    public MobileElement okButton;

    @FindBy(name = "Photo, Landscape, August 08, 2012, 7:52 PM")
    public MobileElement selectPhoto;

    @FindBy(id = "RegistrationSummaryController.finishButton")
    public MobileElement finishButton;

    @FindBy(name = "More")
    public MobileElement moreButton;


//    @FindBy(id = "SurveyViewController.skipButton")
//    public MobileElement skipButton;


    public void homeShopBtn(){
//        actions
//        x=125 y=830
    }





    public void clickOnGetStarted() {
        MobileUtilities.waitForPresence(By.id("com.etsy.android:id/btn_link"));
        getStarted.click();
    }
}
