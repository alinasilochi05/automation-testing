package tests;

import handlers.SigninHandler;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import pages.*;

public class TestManageAddressBook extends TestBase {

    SigninHandler signinHandler;
    ManageAddressBookPage manageAddressBookPage;
    AccountDashboardPage accountDashboardPage;
    AddNewAddressPage addNewAddressPage;

    public TestManageAddressBook() {
        super();
        this.signinHandler = new SigninHandler(chromeDriver);
        this.manageAddressBookPage = new ManageAddressBookPage(chromeDriver);
        this.accountDashboardPage = new AccountDashboardPage(chromeDriver);
        this.addNewAddressPage = new AddNewAddressPage(chromeDriver);

    }

    @AfterMethod
    public void afterMethod() {
        this.chromeDriver.navigate().back();
    }

    @Test(priority = 0)
    public void openEditAddressBookPage() {
        this.accountDashboardPage.clickManageAddressBookButton();
        this.manageAddressBookPage.clickEditAddressBookButton();
        Assert.assertEquals("Address Book", chromeDriver.getTitle());
        this.chromeDriver.navigate().back();
    }

    @Test(priority = 1)
    public void openAddNewAddressPage() {
        this.accountDashboardPage.clickManageAddressBookButton();
        this.manageAddressBookPage.clickToAddNewAddressButton();
        Assert.assertTrue(this.addNewAddressPage.getRadioButtonValue());
    }
}
