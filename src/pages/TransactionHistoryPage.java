package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionHistoryPage {

        WebDriver chromeDriver;
        By succesTitleTransactionHistoryPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");

        public TransactionHistoryPage(WebDriver chromeDriver) {
            this.chromeDriver = chromeDriver;
        }
    public String getTransactionHistoryPageTitle() {
        String successTitleTransactionHistoryPage = chromeDriver.findElement(this.succesTitleTransactionHistoryPage).getText();
        return successTitleTransactionHistoryPage;
    }
}
