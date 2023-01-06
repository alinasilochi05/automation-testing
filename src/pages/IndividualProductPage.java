package pages;

import org.openqa.selenium.By;
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
    public IndividualProductPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    public void setSizeOption(String sizeOptions) {
       WebElement size = this.chromeDriver.findElement(sizeDropdown);
       Select selectOptions = new Select(size);
       selectOptions.selectByVisibleText(sizeOptions);
    }

    public String selectSize(){
        WebElement size = this.chromeDriver.findElement(sizeDropdown);
        Select selectOptions = new Select(size);
       return selectOptions.getFirstSelectedOption().getText();
    }

    public void deleteFromInputText(){
      chromeDriver.findElement(quantityInput).clear();
    }

    public void setQuantityInput(String quantity){
        this.chromeDriver.findElement(quantityInput).sendKeys(quantity);
    }

    private float getBasePrice(){
        return Float.parseFloat(this.chromeDriver.findElement(basePrice).getText().substring(1));
    }
    public int getQuantity(){
      return parseInt(this.chromeDriver.findElement(quantityInput).getText());
    }

    public float calculateFinalPrice() {
        return  getQuantity() * getBasePrice();
    }

}
