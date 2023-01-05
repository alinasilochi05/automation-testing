package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {
    WebDriver chromeDriver;
    By successTitleChangedPassword = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    By currentPasswordInput = By.id("PasswordFrm_current_password");
    By newPasswordInput = By.id("PasswordFrm_password");
    By confirmedPasswordInput = By.id("PasswordFrm_confirm");
    By continueButton = By.xpath("//*[@id=\"PasswordFrm\"]/div[2]/div/button");

    public ChangePasswordPage(WebDriver chromeDriver){
        this.chromeDriver= chromeDriver;
    }
    public String getChangePasswordTitlePage() {
      String successTitleChangedPassword = this.chromeDriver.findElement(this.successTitleChangedPassword).getText();
    return successTitleChangedPassword;
    }
    public void setCurrentPasswordInput( String currentPassword){
        this.chromeDriver.findElement(currentPasswordInput).sendKeys(currentPassword);
    }
    public void setNewPasswordInput( String newPassword){
        this.chromeDriver.findElement(newPasswordInput).sendKeys(newPassword);
    }
    public void setConfirmedPasswordInput( String confirmedPassword){
        this.chromeDriver.findElement(confirmedPasswordInput).sendKeys(confirmedPassword);
    }
    public void clickContinueButton(){
        chromeDriver.findElement(continueButton).click();
    }

}
