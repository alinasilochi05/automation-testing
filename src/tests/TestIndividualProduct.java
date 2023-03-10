package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CategoryMenuPage;
import pages.IndividualProductPage;
import pages.ProductsCategoryPage;

public class TestIndividualProduct extends TestBase {
    IndividualProductPage individualProductPage;
    CategoryMenuPage categoryMenuPage;
    ProductsCategoryPage productsCategoryPage;

    public TestIndividualProduct() {
        super();
        this.individualProductPage = new IndividualProductPage(chromeDriver);
        this.categoryMenuPage = new CategoryMenuPage(chromeDriver);
        this.productsCategoryPage = new ProductsCategoryPage(chromeDriver);
    }

    @Test
    public void changeSizeOfProduct() {
        String sizeOption = "50ml $20.00";
        this.categoryMenuPage.hoverOverElement(5);
        this.categoryMenuPage.clickToSubmenuCategory(5, 2);
        this.productsCategoryPage.clickOnProduct(1);
        this.individualProductPage.setSizeOption(sizeOption);
        Assert.assertEquals(this.individualProductPage.selectSize(), sizeOption);
    }

    @Test
    public void changeQuantityOfProduct() throws InterruptedException {
        int quantity = 3;
        this.categoryMenuPage.hoverOverElement(5);
        this.categoryMenuPage.clickToSubmenuCategory(5, 2);
        this.productsCategoryPage.clickOnProduct(1);
        this.individualProductPage.deleteFromInputText();
        this.individualProductPage.setQuantityInput(String.valueOf(quantity));
        Thread.sleep(1000);
        Assert.assertEquals(this.individualProductPage.getFinalPrice(),
                this.individualProductPage.calculateFinalPrice(quantity));
    }

    @Test
    public void addProductToWishList() {
        this.categoryMenuPage.hoverOverElement(5);
        this.categoryMenuPage.clickToSubmenuCategory(5, 2);
        this.productsCategoryPage.clickOnProduct(1);
        this.individualProductPage.clickOnAddToWishList();
        Assert.assertEquals(this.individualProductPage.getTextFromRemoveFromWishlist(), " Remove from wish list");
    }
}
