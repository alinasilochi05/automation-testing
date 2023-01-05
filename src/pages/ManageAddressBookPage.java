package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageAddressBookPage {
    WebDriver chromeDriver;
    By successTitleAddressBookPage =  (By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1"));
    By editAddressBookButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div/div[1]/table/tbody/tr/td[2]/button");
    By addNewAddressButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div/div[2]/a[2]");
    public ManageAddressBookPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }
    public String getAddressBookTitlePage(){
        String successTitleAddressBookPage = chromeDriver.findElement(this.successTitleAddressBookPage).getText();
        return successTitleAddressBookPage;
    }
    public void clickEditAddressBookButton(){
        chromeDriver.findElement(editAddressBookButton).click();
    }
    public void clickToAddNewAddressButton(){
        chromeDriver.findElement(addNewAddressButton).click();
    }
}
