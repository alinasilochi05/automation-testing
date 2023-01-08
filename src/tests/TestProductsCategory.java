package tests;

import org.testng.annotations.Test;
import pages.CategoryMenuPage;
import pages.ProductsCategoryPage;

public class TestProductsCategory extends TestBase {
    ProductsCategoryPage productsCategoryPage;
    CategoryMenuPage categoryMenuPage;

    public TestProductsCategory() {
        super();
        this.productsCategoryPage = new ProductsCategoryPage(chromeDriver);
        this.categoryMenuPage = new CategoryMenuPage(chromeDriver);
    }

    @Test
    public void addProductInCart() {
        this.categoryMenuPage.hoverOverElement(6);
        this.categoryMenuPage.clickToSubmenuCategory(6, 1);
        this.productsCategoryPage.clickOnAddToCartButton(2);
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
    }

}
