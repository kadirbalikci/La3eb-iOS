package com.automation.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class ConnectPage extends BasePage{

    @FindBy(id = "GamesHubController.GamesHubFeedCell.1")
    public MobileElement secondChannel;

    @FindBy(id = "GameImageCell.0")
    public MobileElement gameImageConnect;
}
