package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CategoryMenuPage;
import pages.NavBarPage;
import pages.ProductsCategoryPage;

public class TestProductsCategory extends TestBase {
    ProductsCategoryPage productsCategoryPage;
    CategoryMenuPage categoryMenuPage;
    CartPage cartPage;
    NavBarPage navBarPage;
    private ProductsCategoryPage productsCategoryPage1;

    public TestProductsCategory() {
        super();
        this.productsCategoryPage = new ProductsCategoryPage(chromeDriver);
        this.categoryMenuPage = new CategoryMenuPage(chromeDriver);
        this.cartPage = new CartPage(chromeDriver);
        this.navBarPage = new NavBarPage(chromeDriver);
    }

    @Test
    public void addProductInCart() {
        this.categoryMenuPage.hoverOverElement(6);
        this.categoryMenuPage.clickToSubmenuCategory(6, 1);
        this.productsCategoryPage.clickOnAddToCartButton(2);
        Assert.assertEquals(this.productsCategoryPage.getPrice(), this.cartPage.getTotalPrice());
    }

    @Test
    public void sortElementsBy() {
        this.categoryMenuPage.hoverOverElement(3);
        this.categoryMenuPage.clickToSubmenuCategory(3, 2);
        this.productsCategoryPage.setSortByDropdown("Price High > Low");
    }

    @Test
    public void clickOnProduct() {
        this.categoryMenuPage.hoverOverElement(3);
        this.categoryMenuPage.clickToSubmenuCategory(3, 1);
        this.productsCategoryPage.clickOnProduct(3);
        Assert.assertEquals(chromeDriver.getTitle(), "BeneFit Girl Meets Pearl");
    }
    @Test
    public void openReviewSection(){
        this.categoryMenuPage.hoverOverElement(2);
        this.categoryMenuPage.clickToSubmenuCategory(2, 1);
        this.productsCategoryPage.hoverOverProduct(3);
       this.productsCategoryPage.clickOnWriteReview(2, 3);
        Assert.assertEquals(chromeDriver.getTitle(), "Shoes");
    }

}
