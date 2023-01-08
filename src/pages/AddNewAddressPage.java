package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddressPage {
    WebDriver chromeDriver;
    By firstNameInput = By.id("AddressFrm_firstname");
    By lastNameInput = By.id("AddressFrm_lastname");
    By addressInput = By.id("AddressFrm_address_1");
    By cityInput = By.id("AddressFrm_city");
    By zipCodeInput = By.id("AddressFrm_postcode");
    By countryInput = By.id("AddressFrm_country_id");
    By continueButton = By.xpath("//*[@id=\"AddressFrm\"]/div/fieldset/div[11]/div/button");


    public AddNewAddressPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public Boolean getRadioButtonValue() {
        WebElement radioButton = chromeDriver.findElement(By.id("AddressFrm_default"));
        return radioButton.isSelected();
    }

    public void setFirstNameInput(String firstName) {
        chromeDriver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void setLastNameInput(String lastName) {
        chromeDriver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void setAddressInput(String address) {
        chromeDriver.findElement(addressInput).sendKeys(address);
    }

    public void setZipCodeInput(String zipCode) {
        chromeDriver.findElement(zipCodeInput).sendKeys(zipCode);
    }

    public void setCityInput(String city) {
        chromeDriver.findElement(cityInput).sendKeys(city);
    }

    public void setRegionInput(String region) {
        WebElement selectedRegion = this.chromeDriver.findElement(By.id("AddressFrm_zone_id"));
        Select selectCountry = new Select(selectedRegion);
        selectCountry.selectByVisibleText(region);
    }

    public void setCountryInput(String country) {
        WebElement selectedCountry = this.chromeDriver.findElement(countryInput);
        Select selectCountry = new Select(selectedCountry);
        selectCountry.selectByVisibleText(country);
    }

    public void clickContinueButton() {
        chromeDriver.findElement(continueButton).click();
    }

}
