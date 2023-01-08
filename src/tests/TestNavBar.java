package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.EditAccountDetailsPage;
import pages.NavBarPage;
import pages.SearchPage;

public class TestNavBar extends TestBase {
    NavBarPage navBarPage;
    EditAccountDetailsPage editAccountDetailsPage;
    SearchPage searchPage;
    CartPage cartPage;

    public TestNavBar() {
        super();
        this.navBarPage = new NavBarPage(chromeDriver);
        this.editAccountDetailsPage = new EditAccountDetailsPage(chromeDriver);
        this.searchPage = new SearchPage(chromeDriver);
        this.cartPage = new CartPage(chromeDriver);
    }

    @Test
    public void openCustomerMenuCategory() {
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(3);
        Assert.assertEquals(this.editAccountDetailsPage.getEditAccountDetailsTitlePage(), "My Account Information".toUpperCase());

    }

    @Test
    public void searchCategoryProductWithSearchBar() {
        this.navBarPage.setSearchBar("gucci");
        Assert.assertEquals(this.searchPage.getSuccessTitleForSearch(), "Products meeting the search criteria");
    }

    @Test
    public void openMainMenuCategory() {
        this.navBarPage.SmallScreen_selectCategoryFromMainMenu(5);
        Assert.assertEquals(this.cartPage.getSuccessTitleForCartPage(), "SHOPPING CART");

    }
}
