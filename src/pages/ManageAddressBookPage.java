package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageAddressBookPage {
    WebDriver chromeDriver;
    By successTitleAddressBookPage = (By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1"));
    By editAddressBookButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div/div[1]/table/tbody/tr/td[2]/button");
    By addNewAddressButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div/div[2]/a[2]");

    public ManageAddressBookPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getAddressBookTitlePage() {
        return chromeDriver.findElement(this.successTitleAddressBookPage).getText();
    }

    public void clickEditAddressBookButton() {
        chromeDriver.findElement(editAddressBookButton).click();
    }

    public void clickToAddNewAddressButton() {
        chromeDriver.findElement(addNewAddressButton).click();
    }

    public void clickToDeleteButton(int buttonNumber) {
        WebElement deleteButton = chromeDriver.findElement(By.xpath(String.format("//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/div[%d]/table/tbody/tr/td[2]/button[2]", buttonNumber)));
        deleteButton.click();
    }
}
