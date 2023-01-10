package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AccountDashboardPage;
import pages.NotificationPage;

public class TestNotification extends TestBase{
    NotificationPage notificationPage;
    AccountDashboardPage accountDashboardPage;
    public TestNotification(){
        super();
        this.notificationPage = new NotificationPage(chromeDriver);
        this.accountDashboardPage = new AccountDashboardPage(chromeDriver);
    }
    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get(Urls.notificationPage);
    }
    @Test
    public void activateNewsletterViaEmail(){
        this.notificationPage.clickOnNewsletterCheckbox();
        this.notificationPage.clickOnContinueButton();
        Assert.assertEquals(this.accountDashboardPage.getSuccessNotificationMessage(), this.accountDashboardPage.successNotificationMessagee);
    }
}
