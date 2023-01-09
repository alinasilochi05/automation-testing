package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NavBarPage {
    WebDriver chromeDriver;
    Actions actions;
    SearchPage searchPage;
    By searchBar = By.id("filter_keyword");
    By mainMenuDropdown = By.xpath("//*[@id=\"topnav\"]/select");


    public NavBarPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        this.actions = new Actions(chromeDriver);
        this.searchPage = new SearchPage(chromeDriver);
    }

    public void hoverElement(int sectionNumber) {
        WebElement navSectionMenu = chromeDriver.findElement(By.xpath(String.format("//*[@id=\"customer_menu_top\"]/li[%d]/a/div", sectionNumber)));
        actions.moveToElement(navSectionMenu).perform();
    }

    public void clickOnSubmenuCustomerNav(int subcategoryNumber) {
        WebElement submenuCategory = chromeDriver.findElement(By.xpath(String.format("//*[@id=\"customer_menu_top\"]/li/ul/li[%d]", subcategoryNumber)));
        submenuCategory.click();
    }

    public void setSearchBar(String keyWord) {
        WebElement searchedWord = chromeDriver.findElement(searchBar);
        searchedWord.sendKeys(keyWord);
        searchedWord.sendKeys(Keys.ENTER);
    }


    public void SmallScreen_selectCategoryFromMainMenu(int index) {
        WebElement mainMenu = chromeDriver.findElement(mainMenuDropdown);
        Select selectCategory = new Select(mainMenu);
        selectCategory.selectByIndex(index);
    }

}
