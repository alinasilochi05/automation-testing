package tests;

import constants.Urls;
import handlers.SigninHandler;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import pages.AccountDashboardPage;
import pages.EditAccountDetailsPage;
import org.testng.annotations.Test;

public class TestEditAccountDetails extends TestBase {
    EditAccountDetailsPage editAccountDetailsPage;
    SigninHandler signinHandler;
    AccountDashboardPage accountDashboardPage;


    public TestEditAccountDetails() {
        super();
        this.editAccountDetailsPage = new EditAccountDetailsPage(chromeDriver);
        this.signinHandler = new SigninHandler(this.chromeDriver);
        this.accountDashboardPage = new AccountDashboardPage(this.chromeDriver);
    }
    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get(Urls.editAccountDetails);
    }

    @Test
    public void editFirstNameInputWithValidData() {
        this.editAccountDetailsPage.deleteTextFromFirstNameInput();
        this.editAccountDetailsPage.setFirstNameInput("Mira");
        this.editAccountDetailsPage.clickContinueButton();
        Assert.assertEquals("×\n" +
                "Success: Your account has been successfully updated.", this.accountDashboardPage.getSuccessMessage());
    }
}
