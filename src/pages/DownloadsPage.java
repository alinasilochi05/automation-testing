package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadsPage {
    WebDriver chromeDriver;
    By succesTitleDownloadsPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");

    public DownloadsPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
    public String getDownloadsPageTitle() {
        String successTitleDownloadsPage = chromeDriver.findElement(this.succesTitleDownloadsPage).getText();
        return successTitleDownloadsPage;
    }
}
