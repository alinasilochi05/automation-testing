package tests;

import handlers.SigninHandler;
import org.junit.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pages.*;

public class TestAccountDashboard extends TestBase {
    AccountDashboardPage accountDashboardPage;
    SigninPage signinPage;
    SigninHandler signinHandler;
    ChangePasswordPage changePasswordPage;
    EditAccountDetailsPage editAccountDetailsPage;
    ManageAddressBookPage manageAddressBookPage;
    WishListPage wishListPage;
    OrderHistoryPage orderHistoryPage;
    TransactionHistoryPage transactionHistoryPage;
    DownloadsPage downloadsPage;
    NotificationPage notificationPage;
    LogOutPage logoffPage;

    public TestAccountDashboard() {
        super();
        this.signinPage = new SigninPage(this.chromeDriver);
        this.accountDashboardPage = new AccountDashboardPage(this.chromeDriver);
        this.signinHandler = new SigninHandler(this.chromeDriver);
        this.changePasswordPage = new ChangePasswordPage(this.chromeDriver);
        this.editAccountDetailsPage = new EditAccountDetailsPage(this.chromeDriver);
        this.manageAddressBookPage = new ManageAddressBookPage(this.chromeDriver);
        this.wishListPage = new WishListPage(this.chromeDriver);
        this.orderHistoryPage = new OrderHistoryPage(this.chromeDriver);
        this.transactionHistoryPage = new TransactionHistoryPage(chromeDriver);
        this.downloadsPage = new DownloadsPage(chromeDriver);
        this.notificationPage = new NotificationPage(chromeDriver);
        this.logoffPage = new LogOutPage(chromeDriver);
    }

    @AfterMethod
    public void afterMethod() {
        this.chromeDriver.navigate().back();
    }

    @Test(priority = 0)
    public void openEditAccountDetailsPage() {
        this.accountDashboardPage.clickEditAccountDetailsButton();
        Assert.assertEquals("MY ACCOUNT INFORMATION", this.editAccountDetailsPage.getEditAccountDetailsTitlePage());
    }

    @Test(priority = 1)
    public void openChangePasswordPage() {
        this.accountDashboardPage.clickChangePasswordButton();
        Assert.assertEquals("CHANGE PASSWORD", this.changePasswordPage.getChangePasswordTitlePage());
    }

    @Test(priority = 1)
    public void openManageAddressBookPage() {
        this.accountDashboardPage.clickManageAddressBookButton();
        Assert.assertEquals("ADDRESS BOOK", this.manageAddressBookPage.getAddressBookTitlePage());
    }

    @Test(priority = 1)
    public void openWishListPage() {
        this.accountDashboardPage.clickWishListButton();
        Assert.assertEquals("MY WISH LIST", this.wishListPage.getWishListPageTitle());
    }

    @Test(priority = 1)
    public void openOrderHistoryPage() {
        this.accountDashboardPage.clickOrderHistoryButton();
        Assert.assertEquals("MY ORDER HISTORY", this.orderHistoryPage.getOrderHistoryPageTitle());
    }

    @Test(priority = 1)
    public void openTransactionHistoryPage() {
        this.accountDashboardPage.clickTransactionHistoryButton();
        Assert.assertEquals("MY TRANSACTIONS", this.transactionHistoryPage.getTransactionHistoryPageTitle());
    }

    @Test(priority = 1)
    public void openDownloadsPage() {
        this.accountDashboardPage.clickDownloadsButton();
        Assert.assertEquals("ACCOUNT DOWNLOADS", this.downloadsPage.getDownloadsPageTitle());
    }

    @Test(priority = 1)
    public void openNotificationPage() {
        this.accountDashboardPage.clickNotificationButton();
        Assert.assertEquals("NOTIFICATIONS AND NEWSLETTER", this.notificationPage.getNotificationPageTitle());
    }

    @Test(priority = 2)
    public void clickLogoff() {
        this.accountDashboardPage.clickLogoffButton();
        Assert.assertEquals("ACCOUNT LOGOUT", this.logoffPage.getLogoffPageTitle());
    }

    @Test
    public void openSectionFromSideMenu() {
        this.accountDashboardPage.selectCategoryFromSideBox(2);
        Assert.assertEquals(this.wishListPage.getWishListPageTitle(), "MY WISH LIST");
    }
}
