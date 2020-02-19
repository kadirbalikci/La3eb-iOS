package com.automation.tests.day2;

public class CloudTesting {
    public static String userName = "vasyl75";
    public static String accessKey = "KG3cs7UeTL6sxVVbcVq3";
    //instead of connecting to the localhost, we gonna connect to the browserstack server
    //that server, has access to lots of real phones
    //By doing this, we don't need appium server or emulator in our computer
    //appium server and device is on cloud, we don't need local one.
    public static String URL = "https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
}
