package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.NavBarPage;
import pages.SuccessCheckoutPage;

public class TestCheckoutConfirm extends TestBase {
    CheckoutPage checkoutPage;
    NavBarPage navBarPage;
    SuccessCheckoutPage successCheckoutPage;

    public TestCheckoutConfirm() {
        super();
        this.checkoutPage = new CheckoutPage(chromeDriver);
        this.navBarPage = new NavBarPage(chromeDriver);
        this.successCheckoutPage = new SuccessCheckoutPage(chromeDriver);
    }

    @Test
    public void confirmOrder() {
        this.navBarPage.SmallScreen_selectCategoryFromMainMenu(6);
        this.checkoutPage.clickOnConfirmOrder();
        Assert.assertEquals(this.successCheckoutPage.getSuccessOrderTitle(), "CHECKOUT CONFIRMATION");
    }
}
