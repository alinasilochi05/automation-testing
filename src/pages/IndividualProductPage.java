package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IndividualProductPage {
    WebDriver chromeDriver;
    By sizeDropdown = By.id("option330");
    public IndividualProductPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    public void setSizeOption(String sizeOptions) {
       WebElement size = this.chromeDriver.findElement(sizeDropdown);
        Select selectOption= new Select(size);
        selectOption.selectByVisibleText("75ml $30.00 ");
    }
}
