package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAddressBookPage {
    WebDriver chromeDriver;
    ManageAddressBookPage manageAddressBookPage;
    By successTitleForEditAddressBookPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");

    public EditAddressBookPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
        this.manageAddressBookPage =new ManageAddressBookPage(chromeDriver);
    }
    public String getSuccessTitleForEditAddressBookPage(){
        String successTitleForEditAddressBookPage = chromeDriver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]")).getText();
        return successTitleForEditAddressBookPage;
    }
}
