package com.automation.tests.day1;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
//10 minutes break
public class CalculatorTests {
    private AndroidDriver<MobileElement> driver;

    @Test
    public void test1() throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "7.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        //these 2 parameters are required if you want to automate existing application
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

        WebElement digit1 = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
        WebElement digit2 = getDigit(2);
        WebElement plus = driver.findElement(MobileBy.AccessibilityId("plus"));
        WebElement equals = driver.findElementByAccessibilityId("equals");
        WebElement result = driver.findElementById("com.android.calculator2:id/result");

        digit1.click();//click on 1
        digit2.click();//click on 2

        plus.click();//click on +

        digit2.click();//click on 2
        digit2.click();//click on 2

        equals.click();//click on equals

        String actual = result.getText();//get text of result

        Assert.assertEquals("34", actual);



        Thread.sleep(3000);
        driver.closeApp();

    }

    public WebElement getDigit(int digit) {
        return driver.findElement(By.id("com.android.calculator2:id/digit_" + digit));
    }
}
