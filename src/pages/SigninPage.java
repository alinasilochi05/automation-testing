package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {

    WebDriver chromeDriver;
    By loginNameInput = By.id("loginFrm_loginname");
    By passwordInput = By.id("loginFrm_password");
    By loginButton = By.xpath("//button[@title='Login']");
    By actualLoginTitle = By.xpath("//*[@id='maincontainer']/div/div/div/div/div[2]/h2");

    public SigninPage(WebDriver chromeDriver)
    {
        this.chromeDriver = chromeDriver;
    }

    public void setLoginName(String loginName) {
        this.chromeDriver.findElement(loginNameInput).sendKeys(loginName);

    }

    public void setLoginPassword(String password){

        this.chromeDriver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin(){
        this.chromeDriver.findElement(loginButton).click();
    }
}
