package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductsCategoryPage {
    WebDriver chromeDriver;
    By sortByDropdown = By.id("sort");

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
}
