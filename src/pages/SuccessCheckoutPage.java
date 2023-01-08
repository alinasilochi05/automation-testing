package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessCheckoutPage {
    WebDriver chromeDriver;
    By successTitle = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]");

    public SuccessCheckoutPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getSuccessOrderTitle() {
        return chromeDriver.findElement(successTitle).getText();
    }

}
