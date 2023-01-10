package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AccountDashboardPage {
    WebDriver chromedriver;
    By editAccountDetailsButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[1]/a");
    By changePasswordButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[2]/a");
    By manageAddressBookButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[3]/a");
    By myWishListButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[4]/a");
    By orderHistoryButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[5]/a");
    By transactionHistoryButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[6]/a");
    By downloadsButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[7]/a");
    By notificationButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[8]/a");
    By logoffButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[9]/a");
    By successTitleForEditAccountDetails = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    By successMessageEdit = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div[1]");
    By successMessageChangedPassword = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div[1]");
    By successNotificationMessage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div[1]");
    public String successTitle = "MY ACCOUNT";
    public String successMessageEditDetails = "\n" +
            "Success: Your account has been successfully updated.";
    public String successMessageTitleChangePassword = "×\n" +
            "Success: Your password has been successfully updated.";
    public String successNotificationMessagee = "×\n" +
            "Success: Your notification settings has been successfully updated!";

    public AccountDashboardPage(WebDriver chromeDriver) {

        this.chromedriver = chromeDriver;
    }

    public void clickEditAccountDetailsButton() {
        this.chromedriver.findElement(editAccountDetailsButton).click();
    }

    public void clickChangePasswordButton() {
        this.chromedriver.findElement(changePasswordButton).click();
    }

    public void clickManageAddressBookButton() {
        this.chromedriver.findElement(manageAddressBookButton).click();
    }

    public void clickWishListButton() {
        this.chromedriver.findElement(myWishListButton).click();
    }

    public void clickOrderHistoryButton() {
        this.chromedriver.findElement(orderHistoryButton).click();
    }

    public void clickTransactionHistoryButton() {
        this.chromedriver.findElement(transactionHistoryButton).click();
    }

    public void clickDownloadsButton() {
        this.chromedriver.findElement(downloadsButton).click();
    }

    public void clickNotificationButton() {
        this.chromedriver.findElement(notificationButton).click();
    }

    public void clickLogoffButton() {
        this.chromedriver.findElement(logoffButton).click();
    }

    public String getSuccessTitleForEditAccountDetails() {
        return this.chromedriver.findElement(this.successTitleForEditAccountDetails).getText();
    }
    public String getSuccessMessageForChangePassword(){
        return this.chromedriver.findElement(successMessageChangedPassword).getText();
    }
    public String getSuccessNotificationMessage(){
        return this.chromedriver.findElement(successNotificationMessage).getText();
    }

}

