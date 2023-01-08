package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage {
    WebDriver chromeDriver;
    By successTitleOrderHistoryPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    public String orderHistorySuccessTitle = "MY ORDER HISTORY";

    public OrderHistoryPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getOrderHistoryPageTitle() {
        return chromeDriver.findElement(this.successTitleOrderHistoryPage).getText();
    }
}
