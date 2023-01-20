package tests;

import constants.Urls;
import handlers.UtilsHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.SignupPage;
import pages.SuccessSignUpPage;

public class TestSignup extends TestBase {
    SignupPage signupPage;
    SuccessSignUpPage successSignUpPage;
    UtilsHandler utilsHandler;

    public TestSignup() {
        super(Urls.signup, true, false);
        this.signupPage = new SignupPage(this.chromeDriver);
        this.successSignUpPage = new SuccessSignUpPage(chromeDriver);
        this.utilsHandler = new UtilsHandler();
    }
    @BeforeSuite()
    @Override()
    public void setUpBeforeSuite() {
    }
    @Test
    public void signUp() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(32));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("gloria1225@gmail.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(500);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("gloria02");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }

}
