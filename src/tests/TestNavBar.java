package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestNavBar extends TestBase {
    NavBarPage navBarPage;
    EditAccountDetailsPage editAccountDetailsPage;
    SearchPage searchPage;
    CartPage cartPage;
    ManageAddressBookPage manageAddressBookPage;
    WishListPage wishListPage;
    ChangePasswordPage changePasswordPage;
    OrderHistoryPage orderHistoryPage;
    TransactionHistoryPage transactionHistoryPage;
    DownloadsPage downloadsPage;
    NotificationPage notificationPage;
    LogOutPage logOutPage;

    public TestNavBar() {
        super();
        this.navBarPage = new NavBarPage(chromeDriver);
        this.editAccountDetailsPage = new EditAccountDetailsPage(chromeDriver);
        this.searchPage = new SearchPage(chromeDriver);
        this.cartPage = new CartPage(chromeDriver);
        this.manageAddressBookPage = new ManageAddressBookPage(chromeDriver);
        this.wishListPage = new WishListPage(chromeDriver);
        this.changePasswordPage = new ChangePasswordPage(chromeDriver);
        this.orderHistoryPage = new OrderHistoryPage(chromeDriver);
        this.transactionHistoryPage = new TransactionHistoryPage(chromeDriver);
        this.downloadsPage = new DownloadsPage(chromeDriver);
        this.notificationPage = new NotificationPage(chromeDriver);
        this.logOutPage = new LogOutPage(chromeDriver);

    }

    @Test
    public void openCustomerMenuCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(3);
        Assert.assertEquals(this.editAccountDetailsPage.getEditAccountDetailsTitlePage(), "My Account Information".toUpperCase());
    }

    @Test(priority = 1)
    public void openWishlistCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(2);
        Assert.assertEquals(this.wishListPage.getWishListPageTitle(), this.wishListPage.wishlistSuccessTitle);
    }

    @Test(priority = 1)
    public void openEditAccountDetailsCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(3);
        Assert.assertEquals(this.editAccountDetailsPage.getEditAccountDetailsTitlePage(), editAccountDetailsPage.editDetailsSuccessTitle);
    }

    @Test(priority = 1)
    public void openChangePasswordCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(4);
        Assert.assertEquals(this.changePasswordPage.getChangePasswordTitlePage(), this.changePasswordPage.changePasswordSuccessTitle);
    }
    @Test (priority = 1)
    public void openManageAddressBookCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(5);
        Assert.assertEquals(this.manageAddressBookPage.getAddressBookTitlePage(), this.manageAddressBookPage.manageAddressSuccessTitle);
    }
    @Test (priority = 1)
    public void openOrderHistoryCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(6);
        Assert.assertEquals(this.orderHistoryPage.getOrderHistoryPageTitle(), this.orderHistoryPage.orderHistorySuccessTitle);
    }

    @Test (priority = 1)
    public void openTransactionCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(7);
        Assert.assertEquals(this.transactionHistoryPage.getTransactionHistoryPageTitle(), this.transactionHistoryPage.transactionHistorySuccessTitle);
    }

    @Test (priority = 1)
    public void openDownloadsCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(8);
        Assert.assertEquals(this.downloadsPage.getDownloadsPageTitle(), this.downloadsPage.downloadsSuccessTitle);
    }

    @Test (priority = 1)
    public void openNotificationCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(9);
        Assert.assertEquals(this.notificationPage.getNotificationPageTitle(), this.notificationPage.notificationSuccessTitle);
    }
    @Test (priority = 3)
    public void openLogoutCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(10);
        Assert.assertEquals(this.logOutPage.getLogoffPageTitle(), this.logOutPage.logOutSuccessTitle);
    }


    @Test (priority = 2)
    public void searchCategoryProductWithSearchBar() {
        this.navBarPage.setSearchBar("gucci");
        Assert.assertEquals(this.searchPage.getSuccessTitleForSearch(), "Products meeting the search criteria");
    }

    @Test
    public void openMainMenuCategory() {
        this.navBarPage.SmallScreen_selectCategoryFromMainMenu(5);
        Assert.assertEquals(this.cartPage.getSuccessTitleForCartPage(), "SHOPPING CART");

    }
}
