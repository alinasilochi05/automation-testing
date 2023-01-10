package tests;

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
    public void addNewAddressWithValidData() {
        this.accountDashboardPage.clickManageAddressBookButton();
        this.manageAddressBookPage.clickToAddNewAddressButton();
        this.addNewAddressPage.setFirstNameInput("DemoName");
        this.addNewAddressPage.setLastNameInput("Demo last name");
        this.addNewAddressPage.setAddressInput("address Demo");
        this.addNewAddressPage.setCityInput("Demo City");
        this.addNewAddressPage.setZipCodeInput("0000000");
        this.addNewAddressPage.setCountryInput("Romania");
        this.addNewAddressPage.setRegionInput("Alba");
        this.addNewAddressPage.clickContinueButton();

    }
}
