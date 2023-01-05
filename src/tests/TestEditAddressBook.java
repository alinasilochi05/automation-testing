package tests;

import constants.Urls;
import handlers.SigninHandler;
import pages.EditAddressBookPage;
import pages.ManageAddressBookPage;
import org.testng.annotations.Test;

public class TestEditAddressBook extends TestBase {
    EditAddressBookPage editAddressBookPage;
    SigninHandler signinHandler;
    ManageAddressBookPage manageAddressBookPage;

    public TestEditAddressBook(){
        super(Urls.signin);
        this.editAddressBookPage = new EditAddressBookPage(chromeDriver);
        this.signinHandler = new SigninHandler(chromeDriver);
        this.manageAddressBookPage = new ManageAddressBookPage(chromeDriver);
    }


}
