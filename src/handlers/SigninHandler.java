package handlers;

import org.openqa.selenium.WebDriver;
import pages.SigninPage;

public class SigninHandler {

    SigninPage signinPage;

    public SigninHandler(WebDriver chromeDriver) {
        this.signinPage = new SigninPage(chromeDriver);
    }

    public void Signin() {
        this.signinPage.setLoginName("gloria");
        this.signinPage.setLoginPassword("pass");
        this.signinPage.clickLogin();
    }
}
