package tests;

import constants.Urls;
import org.testng.annotations.BeforeTest;
import pages.TransactionHistoryPage;

public class TestTransactionHistory extends TestBase{
    TransactionHistoryPage transactionHistoryPage;
    public TestTransactionHistory(){
        super();
        this.transactionHistoryPage = new TransactionHistoryPage(chromeDriver);
    }
    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get(Urls.transactionHistory);
    }
}
