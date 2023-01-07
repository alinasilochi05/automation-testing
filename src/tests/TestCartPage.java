package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCartPage extends TestBase{
    CartPage cartPage;
    CategoryMenuPage categoryMenuPage;
    ProductsCategoryPage productsCategoryPage;
    NavBarPage navBarPage;
    CheckoutPage checkoutPage;
    public TestCartPage(){
        super(Urls.signin);
        this.cartPage = new CartPage(chromeDriver);
        this.categoryMenuPage = new CategoryMenuPage(chromeDriver);
        this.productsCategoryPage = new ProductsCategoryPage(chromeDriver);
        this.navBarPage = new NavBarPage(chromeDriver);
        this.checkoutPage = new CheckoutPage(chromeDriver);
    }
    @Test
    public void goToCheckout(){
       this.categoryMenuPage.hoverOverElement(3);
       this.categoryMenuPage.clickToSubmenuCategory(3,1);
       this.productsCategoryPage.clickOnAddToCartButton(1);
       this.navBarPage.SmallScreen_selectCategoryFromMainMenu(5);
       this.cartPage.clickToCheckoutButton();
        Assert.assertEquals(this.checkoutPage.getSuccessTitle(), "CHECKOUT CONFIRMATION");
    }
    @Test
    public void goToCheckoutPage(){
        this.navBarPage.SmallScreen_selectCategoryFromMainMenu(5);
        this.cartPage.clickToCheckoutButton();
        Assert.assertEquals(this.checkoutPage.getSuccessTitle(), "CHECKOUT CONFIRMATION");
    }
}
