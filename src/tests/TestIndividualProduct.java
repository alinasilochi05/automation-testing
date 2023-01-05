package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CategoryMenuPage;
import pages.IndividualProductPage;
import pages.ProductsCategoryPage;

public class TestIndividualProduct extends TestBase {
    IndividualProductPage individualProductPage;
    CategoryMenuPage categoryMenuPage;
    ProductsCategoryPage productsCategoryPage;
    public TestIndividualProduct(){
        super(Urls.signin);
        this.individualProductPage = new IndividualProductPage(chromeDriver);
        this.categoryMenuPage = new CategoryMenuPage(chromeDriver);
        this.productsCategoryPage = new ProductsCategoryPage(chromeDriver);
    }
    @Test
    public void changeSizeOfProduct(){
       this.categoryMenuPage.hoverOverElement(5);
       this.categoryMenuPage.clickToSubmenuCategory(5, 2);
       this.productsCategoryPage.clickOnProduct(1);
       this.individualProductPage.setSizeOption("50ml $20.00");
       Assert.assertEquals(this.individualProductPage.getSelectedSize(), "50ml $20.00");

    }
}
