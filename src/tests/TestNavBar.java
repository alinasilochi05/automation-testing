package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EditAccountDetailsPage;
import pages.NavBarPage;
import pages.SearchPage;

public class TestNavBar extends TestBase{
    NavBarPage navBarPage;
    EditAccountDetailsPage editAccountDetailsPage;
    SearchPage searchPage;
    public TestNavBar(){
        super(Urls.signin);
        this.navBarPage = new NavBarPage(chromeDriver);
        this.editAccountDetailsPage = new EditAccountDetailsPage(chromeDriver);
        this.searchPage = new SearchPage(chromeDriver);
    }
    @Test
    public void openCustomerMenuCategory(){
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(3);
        Assert.assertEquals(this.editAccountDetailsPage.getEditAccountDetailsTitlePage(), String.format("%S", "My Account Information"));

    }

    @Test
    public void searchCategoryProductWithSearchBar(){
        this.navBarPage.setSearchBar("gucci");
        Assert.assertEquals(this.searchPage.getSuccessTitleForSearch(), "Products meeting the search criteria");
    }

    @Test
    public void selectMainMenuCategory(){
        this.navBarPage.SmallScreen_selectCategoryFromMainMenu(" Specials");
    }
}
