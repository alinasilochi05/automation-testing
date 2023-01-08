package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationPage {
    WebDriver chromeDriver;
    By successTitleNotificationPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    public String notificationSuccessTitle = "NOTIFICATIONS AND NEWSLETTER";

    public NotificationPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getNotificationPageTitle() {
        return chromeDriver.findElement(this.successTitleNotificationPage).getText();
    }
}
