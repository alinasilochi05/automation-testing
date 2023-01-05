package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationPage {
    WebDriver chromeDriver;
    By succesTitleNotificationPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");

    public NotificationPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
    public String getNotificationPageTitle() {
        String successTitleNotificationPage = chromeDriver.findElement(this.succesTitleNotificationPage).getText();
        return successTitleNotificationPage;
    }
}
