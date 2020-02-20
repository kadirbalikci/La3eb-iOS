package com.automation.tests.day3;

import io.appium.java_client.remote.MobileBrowserType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.*;

public class MobileWebTestAutomation {
    //for mobile web automation, we don't use appium drivers
    //we just use WebDriver or RemoteWebDriver
    //RemoteWebDriver - it's a class, that implements WebDriver interface
    //RemoteWebDriver - is a super class for all web drivers, like: ChromeDriver, FirefoxDriver, IEDriver, etc..
    private RemoteWebDriver driver;

    /**
     * In this test, instead of desktop chrome browser, we gonna use
     * mobile chrome browser.
     * For testing, we will use vytrack
     */
    @Test
    public void test1() throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", Platform.ANDROID);
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
        driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.get("http://qa1.vytrack.com");
        Thread.sleep(5000);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);


        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, 20);
        try {
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("div[class='loader-mask shown']"))));
        } catch (Exception e) {
            Thread.sleep(2000);
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("main-menu-toggle")));
        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(By.id("main-menu-toggle")));
        toggle.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
