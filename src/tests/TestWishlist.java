package tests;

import constants.Urls;
import org.testng.annotations.BeforeTest;
import pages.WishListPage;

public class TestWishlist extends TestBase {
    WishListPage wishListPage;

    public TestWishlist(){
        super();
        this.wishListPage = new WishListPage(chromeDriver);
    }
    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get(Urls.wishList);
    }
}
