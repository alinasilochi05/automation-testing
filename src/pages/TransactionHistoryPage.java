package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionHistoryPage {

    WebDriver chromeDriver;
    By successTitleTransactionHistoryPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    public String transactionHistorySuccessTitle = "MY TRANSACTIONS";

    public TransactionHistoryPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getTransactionHistoryPageTitle() {
        return chromeDriver.findElement(this.successTitleTransactionHistoryPage).getText();
    }
}
