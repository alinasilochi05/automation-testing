package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage {
    WebDriver chromeDriver;
    By succesTitleOrderHistoryPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");

    public OrderHistoryPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }
    public String getOrderHistoryPageTitle() {
        String successOrderHistoryPage = chromeDriver.findElement(this.succesTitleOrderHistoryPage).getText();
        return successOrderHistoryPage;
    }
}
