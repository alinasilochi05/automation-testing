package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoffPage {
    WebDriver chromeDriver;
    By succesTitleLogoffPage = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]");

    public LogoffPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
    public String getLogoffPageTitle() {
        String successTitleLogoffPage = chromeDriver.findElement(this.succesTitleLogoffPage).getText();
        return successTitleLogoffPage;
    }
}
