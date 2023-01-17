package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MyOrderHistoryPage;
import pages.OrderHistoryPage;

public class TestOrderHistory extends TestBase {
    MyOrderHistoryPage myOrderHistoryPage;

    public TestOrderHistory() {
        super();
        this.myOrderHistoryPage = new MyOrderHistoryPage(chromeDriver);
    }

    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get(Urls.orderHistory);
    }

    @Test
    public void openOrderDetailsPage() {
        this.myOrderHistoryPage.clickOnViewButton();
        Assert.assertEquals(chromeDriver.getTitle(), "Order Details");
    }
}
