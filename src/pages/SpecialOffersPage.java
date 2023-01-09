package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecialOffersPage {
    WebDriver chromeDriver;
    public String successTitleSpecialOf = "SPECIAL OFFERS";
    By successTitle = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]");
    public SpecialOffersPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }
    public String getSuccessTitleSpecialOfr(){
        return chromeDriver.findElement(successTitle).getText();
    }
}
