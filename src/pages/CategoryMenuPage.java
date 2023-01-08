package pages;

import handlers.UtilsHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CategoryMenuPage extends PageBase {
    WebDriver chromeDriver;
    Actions actions;
    UtilsHandler utilsHandler;


    public CategoryMenuPage(WebDriver chromeDriver) {
        super(chromeDriver);
        this.chromeDriver = chromeDriver;
        this.actions = new Actions(chromeDriver);
        this.utilsHandler = new UtilsHandler();
    }

    public void hoverOverElement(int sectionNumber) {
        WebElement menuSection = chromeDriver.findElement(By.xpath(String.format("//*[@id=\"categorymenu\"]/nav/ul/li[%d]/a", sectionNumber)));
        actions.moveToElement(menuSection).perform();
    }

    public void clickToSubmenuCategory(int categoryNumber, int subcategoryNumber) {
        By submenuCategoryBy = By.xpath(String.format("//*[@id=\"categorymenu\"]/nav/ul/li[%d]/div/ul[1]/li[%d]/a", categoryNumber, subcategoryNumber));
        WebElement submenuCategory = this.chromeDriver.findElement(submenuCategoryBy);
        submenuCategory.click();
    }
}


