package tests;

import constants.Urls;
import handlers.SigninHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {
    protected WebDriver chromeDriver;
    protected String siteUrl;
    protected Actions browserInteractions;
    protected SigninHandler signinHandler;
    protected WebDriverWait webDriverWait;

    protected TestBase(String siteUrl) {
        System.setProperty("webdriver.chrome.driver", constants.TestBase.chromeDriverLocation);
        this.chromeDriver = new ChromeDriver();
        this.siteUrl = siteUrl;
        this.browserInteractions = new Actions(this.chromeDriver);
        this.signinHandler = new SigninHandler(this.chromeDriver);
        this.webDriverWait = new WebDriverWait(this.chromeDriver, Duration.ofSeconds(2));
    }

    protected TestBase() {
        System.setProperty("webdriver.chrome.driver", constants.TestBase.chromeDriverLocation);
        this.chromeDriver = new ChromeDriver();
        this.siteUrl = Urls.signin;
        this.browserInteractions = new Actions(this.chromeDriver);
        this.signinHandler = new SigninHandler(this.chromeDriver);
        this.webDriverWait = new WebDriverWait(this.chromeDriver, Duration.ofSeconds(2));
    }

    @BeforeSuite
    public void setUp() {
        this.chromeDriver.get(this.siteUrl);
        this.signinHandler.Signin();
    }

//    @AfterSuite
//    public void close() {
//        this.chromeDriver.close();
//    }
//
}
