package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyOrderHistoryPage {
    WebDriver chromeDriver;
    By successTitle = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    By viewButton = By.xpath("//*[@id=\"button_edit\"]");
    public String successTitleOrderHistory = "MY ORDER HISTORY";

    public MyOrderHistoryPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getSuccessTitleMyOrderHistory() {
        return chromeDriver.findElement(successTitle).getText();
    }

    public void clickOnViewButton() {
        this.chromeDriver.findElement(viewButton).click();
    }
}
