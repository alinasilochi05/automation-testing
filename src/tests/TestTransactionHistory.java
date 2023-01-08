package tests;

import pages.TransactionHistoryPage;

public class TestTransactionHistory extends TestBase{
    TransactionHistoryPage transactionHistoryPage;
    public TestTransactionHistory(){
        super();
        this.transactionHistoryPage = new TransactionHistoryPage(chromeDriver);
    }
}
