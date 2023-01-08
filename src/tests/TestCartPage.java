package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class TestCartPage extends TestBase {
    CartPage cartPage;
    CategoryMenuPage categoryMenuPage;
    ProductsCategoryPage productsCategoryPage;
    NavBarPage navBarPage;
    CheckoutPage checkoutPage;
    private final String cartPageSuccessTitle = "CHECKOUT CONFIRMATION";

    public TestCartPage() {
        super();
        this.cartPage = new CartPage(chromeDriver);
        this.categoryMenuPage = new CategoryMenuPage(chromeDriver);
        this.productsCategoryPage = new ProductsCategoryPage(chromeDriver);
        this.navBarPage = new NavBarPage(chromeDriver);
        this.checkoutPage = new CheckoutPage(chromeDriver);
    }

    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get(Urls.cartPage);
    }

    @Test
    public void goToCheckout() {
        this.cartPage.clickToCheckoutButton();
        Assert.assertEquals(this.checkoutPage.getSuccessTitle(), this.cartPageSuccessTitle);
    }

    @Test
    public void changeQuantityOfProduct() {
        int quantity = 2;
        this.cartPage.deleteValueFromInput();
        this.cartPage.setQuantityInput(String.valueOf(quantity));
        this.cartPage.clickToUpdateButton();
        Assert.assertEquals(this.cartPage.getTotalPrice(), this.cartPage.calculateFinalPrice(quantity));
    }

    @Test
    public void deleteProductFromCart() {
    }
}
