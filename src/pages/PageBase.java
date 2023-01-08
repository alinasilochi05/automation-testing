package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    protected WebDriverWait webDriverWait;

    public PageBase(WebDriver chromeDriver) {
        this.webDriverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(2));
    }
}
