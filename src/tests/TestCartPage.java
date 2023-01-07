package tests;

import constants.Urls;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CategoryMenuPage;
import pages.NavBarPage;
import pages.ProductsCategoryPage;

public class TestCartPage extends TestBase{
    CartPage cartPage;
    CategoryMenuPage categoryMenuPage;
    ProductsCategoryPage productsCategoryPage;
    NavBarPage navBarPage;
    public TestCartPage(){
        super(Urls.signin);
        this.cartPage = new CartPage(chromeDriver);
        this.categoryMenuPage = new CategoryMenuPage(chromeDriver);
        this.productsCategoryPage = new ProductsCategoryPage(chromeDriver);
        this.navBarPage = new NavBarPage(chromeDriver);
    }
    @Test
    public void goToCheckout(){
       this.categoryMenuPage.hoverOverElement(3);
       this.categoryMenuPage.clickToSubmenuCategory(3,1);
       this.productsCategoryPage.clickOnAddToCartButton(1);
       this.navBarPage.SmallScreen_selectCategoryFromMainMenu(5);
       this.cartPage.clickToCheckoutButton();
    }
}
