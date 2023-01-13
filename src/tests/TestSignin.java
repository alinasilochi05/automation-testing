package tests;

import constants.Urls;
import handlers.SigninHandler;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import pages.SigninPage;

public class TestSignin extends TestBase {
    SigninPage signinPage;

    SigninHandler signinHandler;

    public TestSignin() {
        super(Urls.signin);
        this.signinPage = new SigninPage(this.chromeDriver);
        this.signinHandler = new SigninHandler(this.chromeDriver);
    }
//    @BeforeTest
//    public void setUpBeforeTest(){
//        this.chromeDriver.get(Urls.signin);
//    }

    @Test()
    public void loginValidData() {
        this.signinHandler.Signin();
    }

    @Test
    public void loginInvalidPassword(){
        this.signinPage.setLoginName("gloria");
        this.signinPage.setLoginPassword("pas");
        this.signinPage.clickLogin();
        Assert.assertEquals(this.signinPage.getWarningMessage(), this.signinPage.warningMessage);
    }
    @Test
    public void loginInvalidUsername(){
        this.signinPage.setLoginName("glo");
        this.signinPage.setLoginPassword("pass");
        this.signinPage.clickLogin();
        Assert.assertEquals(this.signinPage.getWarningMessage(), this.signinPage.warningMessage);
    }
    @Test
    public void loginEmptyPassword(){
        this.signinPage.setLoginName("gloria");
        this.signinPage.setLoginPassword(" ");
        this.signinPage.clickLogin();
        Assert.assertEquals(this.signinPage.getWarningMessage(), this.signinPage.warningMessage);
    }
    @Test
    public void loginEmptyUsername(){
        this.signinPage.setLoginName(" ");
        this.signinPage.setLoginPassword("pass");
        this.signinPage.clickLogin();
        Assert.assertEquals(this.signinPage.getWarningMessage(), this.signinPage.warningMessage);
    }
    @Test
    public void loginCapitalUsername(){
        this.signinPage.setLoginName("GLORIA");
        this.signinPage.setLoginPassword("pass");
        this.signinPage.clickLogin();
        Assert.assertEquals(this.signinPage.getWarningMessage(), this.signinPage.warningMessage);
    }
    @Test
    public void loginCapitalPassword(){
        this.signinPage.setLoginName("gloria");
        this.signinPage.setLoginPassword("PASS");
        this.signinPage.clickLogin();
        Assert.assertEquals(this.signinPage.getWarningMessage(), this.signinPage.warningMessage);
    }


}
