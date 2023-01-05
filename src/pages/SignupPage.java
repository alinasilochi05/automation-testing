package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
    WebDriver chromeDriver;
    By firstNameInput = By.id("AccountFrm_firstname");
    By lastNameInput = By.id("AccountFrm_lastname");
    By emailInput = By.id("AccountFrm_email");
    By adressInput = By.id("AccountFrm_address_1");
    By cityInput = By.id("AccountFrm_city");
    By regionInput = By.id("AccountFrm_zone_id");
    By zipCodeInput = By.id("AccountFrm_postcode");
    By countryInput = By.id("AccountFrm_country_id");
    By loginNameInput = By.id("AccountFrm_loginname");
    By passwordInput = By.id("AccountFrm_password");
    By passwordConfirmInput = By.id("AccountFrm_confirm");
    By continueRegisterButton = By.xpath("//*[@id=\"AccountFrm\"]/div[5]/div/div/button");
    By privacyPolicyCheckBox = By.xpath("//*[@id=\"AccountFrm_agree\"]");


    public SignupPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public void setFirstNameInput(String value) {
        this.chromeDriver.findElement(firstNameInput).sendKeys(value);
    }

    public void setLastNameInput(String lastName) {
        this.chromeDriver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void setEmailInput(String email) {
        this.chromeDriver.findElement(emailInput).sendKeys(email);
    }

    public void setAdressInput(String address) {
        this.chromeDriver.findElement(adressInput).sendKeys(address);
    }

    public void setCountryInput(String country) {
        WebElement selectedCountry = this.chromeDriver.findElement(countryInput);
        Select selectCountry = new Select(selectedCountry);
        selectCountry.selectByVisibleText(country);
    }

    public void setRegionInput(String region) {
        WebElement selectedRegion = this.chromeDriver.findElement(regionInput);
        Select selectRegion = new Select(selectedRegion);
        selectRegion.selectByVisibleText(region);
    }

    public void setZipCodeInput(String zipCode) {
        this.chromeDriver.findElement(zipCodeInput).sendKeys(zipCode);
    }

    public void setLoginNameInput(String loginName) {
        this.chromeDriver.findElement(loginNameInput).sendKeys(loginName);
    }

    public void setPasswordInput(String password) {
        this.chromeDriver.findElement(passwordInput).sendKeys(password);
    }

    public void setPasswordConfirmInput(String passwordConfirm) {
        this.chromeDriver.findElement(passwordConfirmInput).sendKeys(passwordConfirm);
    }

    public void clickContinueButton() {
        this.chromeDriver.findElement(continueRegisterButton).click();
    }

    public void clickPrivacyPolicyCheckBox() {
        this.chromeDriver.findElement(privacyPolicyCheckBox).click();
    }

    public void setCityInput(String city) {
        this.chromeDriver.findElement(cityInput).sendKeys(city);
    }


}
