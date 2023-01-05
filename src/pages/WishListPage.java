package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage {
    WebDriver chromeDriver;
    By successTitleWishListPage = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1");

    public WishListPage(WebDriver chromeDriver){
        this.chromeDriver= chromeDriver;
    }
public String getWishListPageTitle(){
        String successTitleWishListPage = chromeDriver.findElement(this.successTitleWishListPage).getText();
        return successTitleWishListPage;
}
}
