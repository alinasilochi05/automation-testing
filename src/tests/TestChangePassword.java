package tests;

import constants.Urls;
import handlers.SigninHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AccountDashboardPage;
import pages.ChangePasswordPage;

public class TestChangePassword extends TestBase {
    ChangePasswordPage changePasswordPage;
    SigninHandler signinHandler;
    AccountDashboardPage accountDashboardPage;

    public TestChangePassword() {
        super();
        this.accountDashboardPage = new AccountDashboardPage(chromeDriver);
        this.signinHandler = new SigninHandler(this.chromeDriver);
        this.changePasswordPage = new ChangePasswordPage(this.chromeDriver);

    }

    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get(Urls.changePassword);
    }

    @Test
    public void changePasswordWithValidData() {
        this.changePasswordPage.setCurrentPasswordInput("pass");
        this.changePasswordPage.setNewPasswordInput("pass");
        this.changePasswordPage.setConfirmedPasswordInput("pass");
        this.changePasswordPage.clickContinueButton();
        Assert.assertEquals(this.accountDashboardPage.getSuccessMessageForChangePassword(), this.accountDashboardPage.successMessageTitleChangePassword);
    }
}
