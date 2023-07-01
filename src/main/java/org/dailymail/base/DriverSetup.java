package org.dailymail.base;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DriverSetup {
    private static WebDriver driver;

    /********* Invoke Chrome Driver **********/
    public static WebDriver getChromeDriver() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-infobars");
        co.addArguments("--disable-notifications");
        co.addArguments("--disable-gpu");
        co.addArguments("--remote-allow-origins=*");
        co.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS_AND_NOTIFY);
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
        return driver;
    }
    /********* Invoke MSEdge Driver **********/
    public static WebDriver getMSEdgeDriver() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
        return driver;
    }

    public static WebDriver getFirefoxDriver() {
        return null;
    }
}
