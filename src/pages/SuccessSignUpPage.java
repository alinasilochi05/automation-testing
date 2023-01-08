package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessSignUpPage {
    WebDriver chromeDriver;
    By successTitle = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");

    public SuccessSignUpPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getSuccessPageTitle() {
        return this.chromeDriver.findElement(this.successTitle).getText();
    }

}
