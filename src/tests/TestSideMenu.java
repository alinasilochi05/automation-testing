package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestSideMenu extends TestBase {
    SideMenuPage sideMenuPage;
    AccountDashboardPage accountDashboardPage;
    WishListPage wishListPage;
    ChangePasswordPage changePasswordPage;
    OrderHistoryPage orderHistoryPage;
    TransactionHistoryPage transactionHistoryPage;
    DownloadsPage downloadsPage;
    NotificationPage notificationPage;
    LogOutPage logOutPage;
    ManageAddressBookPage manageAddressBookPage;
    EditAccountDetailsPage editAccountDetailsPage;

    public TestSideMenu() {
        super();
        this.sideMenuPage = new SideMenuPage(chromeDriver);
        this.accountDashboardPage = new AccountDashboardPage(chromeDriver);
        this.wishListPage = new WishListPage(chromeDriver);
        this.changePasswordPage = new ChangePasswordPage(chromeDriver);
        this.manageAddressBookPage = new ManageAddressBookPage(chromeDriver);
        this.orderHistoryPage = new OrderHistoryPage(chromeDriver);
        this.transactionHistoryPage = new TransactionHistoryPage(chromeDriver);
        this.downloadsPage = new DownloadsPage(chromeDriver);
        this.notificationPage = new NotificationPage(chromeDriver);
        this.logOutPage = new LogOutPage(chromeDriver);
        this.editAccountDetailsPage = new EditAccountDetailsPage(chromeDriver);
    }

    @Test
    public void openWishlistCategory() {
        this.sideMenuPage.selectCategoryFromSideMenu(2);
        Assert.assertEquals(this.wishListPage.getWishListPageTitle(), this.wishListPage.wishlistSuccessTitle);
    }

    @Test
    public void openEditAccountDetailsCategory() {
        this.sideMenuPage.selectCategoryFromSideMenu(3);
        Assert.assertEquals(this.editAccountDetailsPage.getEditAccountDetailsTitlePage(), editAccountDetailsPage.editDetailsSuccessTitle);
    }

    @Test
    public void openChangePasswordCategory() {
        this.sideMenuPage.selectCategoryFromSideMenu(4);
        Assert.assertEquals(this.changePasswordPage.getChangePasswordTitlePage(), this.changePasswordPage.changePasswordSuccessTitle);
    }

    @Test(groups = {"smoke"})
    public void openManageAddressBookCategory() {
        this.sideMenuPage.selectCategoryFromSideMenu(5);
        Assert.assertEquals(this.manageAddressBookPage.getAddressBookTitlePage(), this.manageAddressBookPage.manageAddressSuccessTitle);
    }

    @Test
    public void openOrderHistoryCategory() {
        this.sideMenuPage.selectCategoryFromSideMenu(6);
        Assert.assertEquals(this.orderHistoryPage.getOrderHistoryPageTitle(), this.orderHistoryPage.orderHistorySuccessTitle);
    }

    @Test (groups = {"smoke"})
    public void openTransactionCategory() {
        this.sideMenuPage.selectCategoryFromSideMenu(7);
        Assert.assertEquals(this.transactionHistoryPage.getTransactionHistoryPageTitle(), this.transactionHistoryPage.transactionHistorySuccessTitle);
    }

    @Test
    public void openDownloadsCategory() {
        this.sideMenuPage.selectCategoryFromSideMenu(8);
        Assert.assertEquals(this.downloadsPage.getDownloadsPageTitle(), this.downloadsPage.downloadsSuccessTitle);
    }

    @Test (groups = {"smoke"})
    public void openNotificationCategory() {
        this.sideMenuPage.selectCategoryFromSideMenu(9);
        Assert.assertEquals(this.notificationPage.getNotificationPageTitle(), this.notificationPage.notificationSuccessTitle);
    }

    @Test
    public void openLogoutCategory() {
        this.sideMenuPage.selectCategoryFromSideMenu(9);
        Assert.assertEquals(this.logOutPage.getLogoffPageTitle(), this.logOutPage.logOutSuccessTitle);
    }

}
