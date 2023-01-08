package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage {
    WebDriver chromeDriver;
    By successTitleWishListPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1");
   public final String wishlistSuccessTitle = "MY WISH LIST";

    public WishListPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public String getWishListPageTitle() {
        return chromeDriver.findElement(this.successTitleWishListPage).getText();
    }
}
