package tests;

import constants.Urls;
import handlers.SigninHandler;
import org.testng.annotations.Test;
import pages.AccountDashboardPage;
import pages.ChangePasswordPage;

public class TestChangePassword extends TestBase{
    ChangePasswordPage changePasswordPage;
    SigninHandler signinHandler;
    AccountDashboardPage accountDashboardPage;

    public TestChangePassword(){
        super(Urls.signin);
        this.accountDashboardPage = new AccountDashboardPage(chromeDriver);
        this.signinHandler = new SigninHandler(this.chromeDriver);
        this.changePasswordPage= new ChangePasswordPage(this.chromeDriver);

    }
    @Test
    public void changePasswordWithValidData(){
        this.accountDashboardPage.clickChangePasswordButton();
        this.changePasswordPage.setCurrentPasswordInput("pass");
        this.changePasswordPage.setNewPasswordInput("pass");
        this.changePasswordPage.setConfirmedPasswordInput("pass");
        this.changePasswordPage.clickContinueButton();

    }
}
