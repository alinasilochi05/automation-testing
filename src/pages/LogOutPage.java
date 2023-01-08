package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {
    WebDriver chromeDriver;
    By successTitleLogoffPage = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]");
    public final String logOutSuccessTitle = "ACCOUNT LOGOUT";

    public LogOutPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getLogoffPageTitle() {
        return chromeDriver.findElement(this.successTitleLogoffPage).getText();
    }
}
