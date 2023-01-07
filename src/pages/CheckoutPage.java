package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver chromeDriver;
    By successTitle = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
    By backButton = By.id("back");
    By confirmOrderButton = By.id("checkout_btn");
    public CheckoutPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }
    public String getSuccessTitle(){
        return chromeDriver.findElement(successTitle).getText();
    }
    public void clickOnConfirmOrder(){
        chromeDriver.findElement(confirmOrderButton).click();
    }
    public void clickOnBackButton(){
        chromeDriver.findElement(backButton).click();
    }
}
