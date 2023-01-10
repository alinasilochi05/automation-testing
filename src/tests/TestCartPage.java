package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class TestCartPage extends TestBase {
    CartPage cartPage;
    CategoryMenuPage categoryMenuPage;
    ProductsCategoryPage productsCategoryPage;
    NavBarPage navBarPage;
    CheckoutPage checkoutPage;
    IndividualProductPage individualProductPage;
    private final String cartPageSuccessTitle = "CHECKOUT CONFIRMATION";

    public TestCartPage() {
        super();
        this.cartPage = new CartPage(chromeDriver);
        this.categoryMenuPage = new CategoryMenuPage(chromeDriver);
        this.productsCategoryPage = new ProductsCategoryPage(chromeDriver);
        this.navBarPage = new NavBarPage(chromeDriver);
        this.checkoutPage = new CheckoutPage(chromeDriver);
        this.individualProductPage = new IndividualProductPage(chromeDriver);
    }

    @BeforeTest
    public void setupBeforeTest() {
        this.chromeDriver.get("https://automationteststore.com/index.php?rt=product/category&path=68_69");
        this.productsCategoryPage.clickOnProduct(2);
        this.individualProductPage.clickOnAddToCartButton();
        this.chromeDriver.get(Urls.cartPage);
    }

    @Test (priority = 2)
    public void goToCheckout() {
        this.cartPage.clickToCheckoutButton();
        Assert.assertEquals(this.checkoutPage.getSuccessTitle(), this.cartPageSuccessTitle);
    }

    @Test (priority = 1)
    public void changeQuantityOfProduct() throws InterruptedException {
        int quantity = 2;
        this.cartPage.deleteValueFromInput();
        this.cartPage.setQuantityInput(String.valueOf(quantity));
        this.cartPage.clickToUpdateButton();
        Thread.sleep(200);
        Assert.assertEquals(this.cartPage.getTotalPrice(), this.cartPage.calculateFinalPrice(quantity));
    }
    @Test(priority = 1)
    public void changeQuantity_InvalidValue_Letter() throws InterruptedException {
        String quantity = "a";
        this.cartPage.deleteValueFromInput();
        this.cartPage.setQuantityInput(quantity);
        this.cartPage.clickToUpdateButton();
        Thread.sleep(200);
        Assert.assertEquals(this.checkoutPage.getWarningMessage(), "Your shopping cart is empty!\n" +
                "Continue");
    }
    @Test(priority = 1)
    public void changeQuantity_InvalidValue_LetterAndNumbers() throws InterruptedException {
        this.cartPage.deleteValueFromInput();
        this.cartPage.setQuantityInput("1o");
        this.cartPage.clickToUpdateButton();
        Thread.sleep(200);
        Assert.assertEquals(this.checkoutPage.getWarningMessage(), "Your shopping cart is empty!\n" +
                "Continue");
    }
    @Test(priority = 1)
    public void changeQuantity_InvalidValue_Decimals() throws InterruptedException {
        this.cartPage.deleteValueFromInput();
        this.cartPage.setQuantityInput("1.5");
        this.cartPage.clickToUpdateButton();
        Thread.sleep(200);
        Assert.assertEquals(this.checkoutPage.getWarningMessage(), "Your shopping cart is empty!\n" +
                "Continue");
    }
    @Test(priority = 1)
    public void changeQuantity_InvalidValue_NegativeNumber() throws InterruptedException {
        this.cartPage.deleteValueFromInput();
        this.cartPage.setQuantityInput("-1");
        this.cartPage.clickToUpdateButton();
        Thread.sleep(200);
        Assert.assertEquals(this.checkoutPage.getWarningMessage(), "Your shopping cart is empty!\n" +
                "Continue");
    }


}
