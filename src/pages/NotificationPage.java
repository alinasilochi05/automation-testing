package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationPage {
    WebDriver chromeDriver;
    By successTitleNotificationPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    By newsletterCheckBox = By.xpath("//*[@id=\"imFrm_settingsnewsletteremail\"]");
    By continueButton = By.xpath("//*[@id=\"imFrm\"]/div/div/div/button");
    public String notificationSuccessTitle = "NOTIFICATIONS AND NEWSLETTER";

    public NotificationPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getNotificationPageTitle() {
        return chromeDriver.findElement(this.successTitleNotificationPage).getText();
    }

    public void clickOnNewsletterCheckbox() {
        this.chromeDriver.findElement(newsletterCheckBox).click();
    }

    public void clickOnContinueButton() {
        this.chromeDriver.findElement(continueButton).click();
    }
}
