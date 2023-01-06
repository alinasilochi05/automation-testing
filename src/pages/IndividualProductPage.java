package pages;

import com.google.common.collect.BoundType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Integer.parseInt;

public class IndividualProductPage {
    WebDriver chromeDriver;
    By sizeDropdown = By.id("option330");
    By quantityInput = By.id("product_quantity");
    By finalPrice = By.xpath("//*[@id=\"product\"]/fieldset/div[3]/label/span");
    By basePrice = By.xpath("//*[@id=\"product_details\"]/div/div[2]/div/div/div[1]/div/div");
    By addToWishListText = By.xpath("//*[@id=\"product\"]/fieldset/div[6]/a[2]");
    By removeFromWishList = By.xpath("//*[@id=\"product\"]/fieldset/div[6]");
    public IndividualProductPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public void setSizeOption(String sizeOptions) {
        WebElement size = this.chromeDriver.findElement(sizeDropdown);
        Select selectOptions = new Select(size);
        selectOptions.selectByVisibleText(sizeOptions);
    }

    public String selectSize() {
        WebElement size = this.chromeDriver.findElement(sizeDropdown);
        Select selectOptions = new Select(size);
        return selectOptions.getFirstSelectedOption().getText();
    }

    public void deleteFromInputText() {
        this.chromeDriver.findElement(quantityInput).clear();
    }

    public void setQuantityInput(String quantity) {
        this.chromeDriver.findElement(quantityInput).sendKeys((quantity));
    }

    public float getFinalPrice() {
        String stringFinalPrice = this.chromeDriver.findElement(finalPrice).getText().substring(1);
        String parsedStringFinalPrice = stringFinalPrice.replace(",", "");
        return Float.parseFloat(parsedStringFinalPrice);
    }

    private float getBasePrice() {
        return Float.parseFloat(this.chromeDriver.findElement(basePrice).getText().substring(1));
    }

    public float getQuantity() {
        return Float.parseFloat(this.chromeDriver.findElement(quantityInput).getText());
    }

    public float calculateFinalPrice(int quantity) {
        return quantity * this.getBasePrice();
    }

    public void clickOnAddToWishList(){
        this.chromeDriver.findElement(addToWishListText).click();
    }
    public String getTextFromRemoveFromWishlist(){
        return chromeDriver.findElement(removeFromWishList).getText();
    }


}
