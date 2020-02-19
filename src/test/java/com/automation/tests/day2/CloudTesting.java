package com.automation.tests.day2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CloudTesting {
    public static String userName = "vasyl75";
    public static String accessKey = "KG3cs7UeTL6sxVVbcVq3";
    //instead of connecting to the localhost, we gonna connect to the browserstack server
    //that server, has access to lots of real phones
    //By doing this, we don't need appium server or emulator in our computer
    //appium server and device is on cloud, we don't need local one.
    public static String URL = "https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
    private AppiumDriver driver;

    @Test
    public void test1() throws Exception{
        //these capabilities are specific to browserstack
        //you will not use them when you would try to connect to the appium server directly
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("device", "Google Pixel 4");
        desiredCapabilities.setCapability("os_version", "10.0");
        desiredCapabilities.setCapability("project", "Calculator");
        desiredCapabilities.setCapability("build", "My First Build");
        desiredCapabilities.setCapability("name", "Calculator Test");
        //app is a parameter that is used to specify application for testing
        //when you are connecting to appium server, it's just enough to specify path to the app
        //with browserstack - it doesn't work like this
        //to make it work, we need to upload app on our account first, then we will be able to test it
        //break 10 minutes
        desiredCapabilities.setCapability("app", "bs://4f2361071a8857b7ecf08eb9ccae8325c879b2b9");
        driver = new AndroidDriver(new URL(URL), desiredCapabilities);



        Thread.sleep(5000);
        driver.closeApp();

    }
}
