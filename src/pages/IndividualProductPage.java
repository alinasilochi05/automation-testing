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
        Select selectOptions = new Select(size);
        selectOptions.selectByVisibleText(sizeOptions);
    }

    public String getSelectedSize(){
        WebElement size = this.chromeDriver.findElement(sizeDropdown);
        Select selectOptions = new Select(size);
       return selectOptions.getFirstSelectedOption().getText();
    }
}
