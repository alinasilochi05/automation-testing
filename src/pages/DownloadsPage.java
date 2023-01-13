package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadsPage {
    WebDriver chromeDriver;
    By successTitleDownloadsPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    By continueButton = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div/div/div/a");
    By successMessage =  By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div[1]");
    public String downloadsSuccessTitle = "ACCOUNT DOWNLOADS";


    public DownloadsPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getDownloadsPageTitle() {
        return this.chromeDriver.findElement(this.successTitleDownloadsPage).getText();
    }

    public void clickOnContinueButton() {
        chromeDriver.findElement(continueButton).click();
    }
    public String getSuccessMessage(){
        return chromeDriver.findElement(successMessage).getText();}

}
