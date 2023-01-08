package tests;

import pages.OrderHistoryPage;

public class TestOrderHistory extends TestBase{
    OrderHistoryPage orderHistoryPage;
    public TestOrderHistory(){
        super();
        this.orderHistoryPage = new OrderHistoryPage(chromeDriver);
    }
}
