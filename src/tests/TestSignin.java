package tests;

import constants.Urls;
import handlers.SigninHandler;
import org.junit.Test;
import pages.SigninPage;

public class TestSignin extends TestBase {
    SigninPage signinPage;

    SigninHandler signinHandler;

    public TestSignin() {
        super(Urls.signin);
        this.signinPage = new SigninPage(this.chromeDriver);
        this.signinHandler = new SigninHandler(this.chromeDriver);
    }

    @Test()
    public void login() {
        this.signinHandler.Signin();
    }

}
