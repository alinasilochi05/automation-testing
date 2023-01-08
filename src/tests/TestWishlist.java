package tests;

import pages.WishListPage;

public class TestWishlist extends TestBase {
    WishListPage wishListPage;

    public TestWishlist(){
        super();
        this.wishListPage = new WishListPage(chromeDriver);
    }
}
