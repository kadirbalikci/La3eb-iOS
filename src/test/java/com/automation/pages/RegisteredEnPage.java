package com.automation.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class RegisteredEnPage extends BasePage{


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
    public  MobileElement finishButton;

    @FindBy(id = "LoginOptionsController.emailButton")
    public MobileElement signInWithEmail;

    @FindBy(id = "EmailOrUsernameInputCell.emailOrUsernameTextField")
    public MobileElement loginEmail;

    @FindBy(id = "PasswordInputCell.passwordTextField")
    public MobileElement loginPassword;

    @FindBy(id = "LoginButtonCell.loginButton")
    public MobileElement loginButton;




}
