package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver chromeDriver;
    By successTitle = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/h1/span");
    By quantityInput = By.id("cart_quantity65");
    By removeButton = By.xpath("//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[2]/td[7]/a");
    By checkoutButton = By.id("cart_checkout2");
    By updateButton = By.id("cart_update");
    By continueShoppingButton = By.xpath("//*[@id=\"cart\"]/div/div[3]/div/a[1]");

    public CartPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }
    public String getSuccessTitleForCartPage(){
        return chromeDriver.findElement(successTitle).getText();
    }
    public void deleteValueFromInput(){
        chromeDriver.findElement(quantityInput).clear();
    }
    public void setQuantityInput(String quantity){
       chromeDriver.findElement(quantityInput).sendKeys(quantity);
    }
    public void clickToRemoveButton(){
        chromeDriver.findElement(removeButton).click();
    }
    public void clickToUpdateButton(){
        chromeDriver.findElement(updateButton).click();
    }
    public void clickToContinueShoppingButton(){
        chromeDriver.findElement(continueShoppingButton).click();
    }
    public void clickToCheckoutButton(){
        chromeDriver.findElement(checkoutButton).click();
    }

}
