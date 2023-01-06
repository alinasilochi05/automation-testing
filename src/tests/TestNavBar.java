package tests;

import constants.Urls;
import org.testng.annotations.Test;
import pages.NavBarPage;

public class TestNavBar extends TestBase{
    NavBarPage navBarPage;
    public TestNavBar(){
        super(Urls.signin);
        this.navBarPage = new NavBarPage(chromeDriver);
    }
    @Test
    public void openCustomerMenuCategory(){
        this.navBarPage.hoverElement(1);
        this.navBarPage.clickOnSubmenuCustomerNav(3);
    }
}
