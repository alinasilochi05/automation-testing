package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavBarPage {
    WebDriver chromeDriver;
    Actions actions;

    public NavBarPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
        this.actions = new Actions(chromeDriver);
    }
    public void hoverElement(int sectionNumber){
        WebElement navSectionMenu = chromeDriver.findElement(By.xpath(String.format("//*[@id=\"customer_menu_top\"]/li[%d]/a/div", sectionNumber)));
        actions.moveToElement(navSectionMenu).perform();
    }
public void clickOnSubmenuCustomerNav(int subcategoryNumber){
    WebElement submenuCategory = chromeDriver.findElement(By.xpath(String.format("//*[@id=\"customer_menu_top\"]/li/ul/li[%d]", subcategoryNumber)));
    submenuCategory.click();
}
}