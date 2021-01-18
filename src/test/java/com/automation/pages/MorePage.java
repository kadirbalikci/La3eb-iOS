package com.automation.pages;

import com.automation.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MorePage extends BasePage{

    public MorePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }

    @FindBy(id = "TabbarMoreController.SettingsCell.2")
    public MobileElement settings;

    @FindBy(name = "Change language, Change the app language")
    public MobileElement changeLanguage;

    @FindBy(name = "عربي")
    public MobileElement arabicLanguage;


}
