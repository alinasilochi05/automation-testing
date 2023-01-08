package tests;

import handlers.SigninHandler;
import pages.EditAddressBookPage;
import pages.ManageAddressBookPage;

public class TestEditAddressBook extends TestBase {
    EditAddressBookPage editAddressBookPage;
    SigninHandler signinHandler;
    ManageAddressBookPage manageAddressBookPage;

    public TestEditAddressBook() {
        super();
        this.editAddressBookPage = new EditAddressBookPage(chromeDriver);
        this.signinHandler = new SigninHandler(chromeDriver);
        this.manageAddressBookPage = new ManageAddressBookPage(chromeDriver);
    }


}
