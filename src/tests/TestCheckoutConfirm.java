package tests;

import constants.Urls;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.NavBarPage;

public class TestCheckoutConfirm extends TestBase {
    CheckoutPage checkoutPage;
    NavBarPage navBarPage;

    public TestCheckoutConfirm(){
        super(Urls.signin);
        this.checkoutPage= new CheckoutPage(chromeDriver);
        this.navBarPage = new NavBarPage(chromeDriver);
    }
    @Test
    public void confirmOrder(){
        this.navBarPage.SmallScreen_selectCategoryFromMainMenu(6);
        this.checkoutPage.clickOnConfirmOrder();
    }
}
