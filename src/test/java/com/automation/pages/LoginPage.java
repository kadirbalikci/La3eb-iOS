package com.automation.pages;

import com.automation.utilities.ConfigurationReader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "com.etsy.android:id/edit_username")
    private MobileElement emailOrUsernameElement;

    @AndroidFindBy(id = "com.etsy.android:id/password")
    private MobileElement passwordElement;

    @AndroidFindBy(id = "com.etsy.android:id/button_signin")
    private MobileElement signInBtnElement;


    public void login() {
        String email = ConfigurationReader.get("email");
        String password = ConfigurationReader.get("password");
        signInBtnElement.click();
    }
}
