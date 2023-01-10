package tests;

import org.testng.Assert;
import pages.AccountDashboardPage;
import pages.AddNewAddressPage;
import org.testng.annotations.Test;
import pages.ManageAddressBookPage;

public class TestAddNewAddress extends TestBase {
    AddNewAddressPage addNewAddressPage;
    AccountDashboardPage accountDashboardPage;
    ManageAddressBookPage manageAddressBookPage;

    public TestAddNewAddress() {
        super();
        this.addNewAddressPage = new AddNewAddressPage(chromeDriver);
        this.accountDashboardPage = new AccountDashboardPage(chromeDriver);
        this.manageAddressBookPage = new ManageAddressBookPage(chromeDriver);
    }

    @Test
    public void addNewAddressWithValidData() throws InterruptedException {
        this.accountDashboardPage.clickManageAddressBookButton();
        this.manageAddressBookPage.scrollDown();
        this.manageAddressBookPage.clickToAddNewAddressButton();
        this.addNewAddressPage.setFirstNameInput("DemoName");
        this.addNewAddressPage.setLastNameInput("Demo last name");
        this.addNewAddressPage.setAddressInput("address Demo");
        this.addNewAddressPage.setCityInput("Demo City");
        this.addNewAddressPage.setZipCodeInput("0000000");
        this.addNewAddressPage.setCountryInput("Romania");
        Thread.sleep(300);
        this.addNewAddressPage.setRegionInput("Alba");
        this.addNewAddressPage.clickContinueButton();
        Assert.assertEquals(chromeDriver.getTitle(), "Your address has been successfully inserted");

    }
}
