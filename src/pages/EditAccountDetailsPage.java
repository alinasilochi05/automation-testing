package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditAccountDetailsPage {
    WebDriver chromeDriver;
    By successTitleEditAccountDetails = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    By firstNameInput = By.id("AccountFrm_firstname");
    By lastnameInput = By.id("AccountFrm_lastname");
    By emailInput = By.id("AccountFrm_email");
    By continueButton = By.xpath("//*[@id=\"AccountFrm\"]/div[2]/div/button");
    By backButton = By.xpath("//*[@id=\"AccountFrm\"]/div[2]/div/a");


    public EditAccountDetailsPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getEditAccountDetailsTitlePage() {
        return chromeDriver.findElement(this.successTitleEditAccountDetails).getText();
    }

    public void setFirstNameInput(String firstname) {
        this.chromeDriver.findElement(firstNameInput).sendKeys(firstname);
    }

    public void deleteTextFromFirstNameInput() {
        WebElement firstNameI = chromeDriver.findElement(By.id("AccountFrm_firstname"));
        firstNameI.clear();
    }

    public void setLastnameInput(String lastName) {
        this.chromeDriver.findElement(lastnameInput).sendKeys(lastName);
    }

    public void setEmailInput(String email) {
        this.chromeDriver.findElement(emailInput).sendKeys(email);
    }

    public void clickContinueButton() {
        chromeDriver.findElement(continueButton).click();
    }

}
