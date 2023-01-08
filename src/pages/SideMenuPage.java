package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideMenuPage {
    WebDriver chromeDriver;

    public SideMenuPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public void selectCategoryFromSideMenu(int categoryNumber) {
        WebElement sideMenuCategory = chromeDriver.findElement(By.xpath(String.format("//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[%d]/a", categoryNumber)));
        sideMenuCategory.click();
    }
}
