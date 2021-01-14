package com.automation.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class RegisteredEnPage {


    @FindBy(name = "Sign up")
    public MobileElement signUpButton;

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

    @FindBy(id = "BirthDateInputCell.dateTextField")
    public MobileElement dateOfBirth;

    @FindBy(id = "CheckBoxView.checkButton")
    public MobileElement tAndC;

    @FindBy(id = "RegisterHolderController.registerButton")
    public MobileElement registerButton;

}
