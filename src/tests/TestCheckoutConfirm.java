package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
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
    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get(Urls.checkoutConfirmation);
    }
    @Test (priority = 2)
    public void confirmOrder() {
        this.checkoutPage.clickOnConfirmOrder();
        Assert.assertEquals(this.successCheckoutPage.getSuccessOrderTitle(), "CHECKOUT CONFIRMATION");
    }
    @Test (priority = 1)
    public void goToPreviousPage(){
        this.checkoutPage.clickOnBackButton();
        Assert.assertEquals(chromeDriver.getTitle(), "Payment Information");
    }
}
