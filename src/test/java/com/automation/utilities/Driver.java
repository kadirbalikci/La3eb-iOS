package com.automation.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private static AppiumDriver driver;

    public static AppiumDriver get() {
        if (driver == null) {
            String platform = ConfigurationReader.get("platform");
            switch (platform) {
                case "iOS":
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setCapability("platformName", "iOS");
                    desiredCapabilities.setCapability("platformVersion", "13.6");
                    desiredCapabilities.setCapability("deviceName", "iPhone 11");
                    desiredCapabilities.setCapability("automationName", "XCUITest");
                    desiredCapabilities.setCapability("app", "/Users/macbookpro/Library/Developer/Xcode/DerivedData/Mec-bubsqxrflqktfxcvrpoyatrhwork/Build/Products/Debug-iphonesimulator/La3eb.app");

                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                               // AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    throw new RuntimeException("Driver is not implemented yet!");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
