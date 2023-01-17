package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DownloadsPage;

public class TestDownloads extends TestBase {
    DownloadsPage downloadsPage;

    public TestDownloads() {
        this.downloadsPage = new DownloadsPage(chromeDriver);
    }

    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get(Urls.downloadOrders);
    }

    @Test
    public void continueToNextPage() {
        this.downloadsPage.clickOnContinueButton();
        Assert.assertEquals(chromeDriver.getTitle(), "My Account");
    }
}
