package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class ProductsCategoryPage {
    WebDriver chromeDriver;
    By sortByDropdown = By.id("sort");
    By reviewButton = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[4]/div[2]/div[1]/a[2]");
    By price = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[2]/div[2]/div[3]/div/div");


    public ProductsCategoryPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public void clickOnAddToCartButton(int buttonNumber) {
        By addToCartButton = By.xpath(String.format("//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[%d]/div[2]/div[3]/a", buttonNumber));
        chromeDriver.findElement(addToCartButton).click();
    }

    public void setSortByDropdown(String option) {
        WebElement selectedOption = this.chromeDriver.findElement(sortByDropdown);
        Select selectOption = new Select(selectedOption);
        selectOption.selectByVisibleText(option);
    }

    public void clickOnProduct(int productNumber) {
        By product = By.cssSelector(String.format("#maincontainer > div > div > div > div > div.thumbnails.grid.row.list-inline > div:nth-child(%d) > div.thumbnail > a", productNumber));
        WebElement selectedProduct = chromeDriver.findElement(product);
        selectedProduct.click();

    }

    public void hoverOverProduct(int productNumber) {
        By product = By.cssSelector(String.format("#maincontainer > div > div > div > div > div.thumbnails.grid.row.list-inline > div:nth-child(%d) > div.thumbnail > a", productNumber));
        WebElement selectedProduct = chromeDriver.findElement(product);
        Actions actions = new Actions(chromeDriver);
        actions.moveToElement(selectedProduct);
    }

    public void clickOnWriteReview(int categoryNumber, int reviewNumber) {
        WebElement selectReview = chromeDriver.findElement(By.xpath(String.format("//*[@id=\"maincontainer\"]/div/div/div/div/div[%d]/div[%d]/div[2]/div[1]/a[2]", categoryNumber, reviewNumber)));
    }

    public String getPrice() {
        return chromeDriver.findElement(price).getText();
    }
}
