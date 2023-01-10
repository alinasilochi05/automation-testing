package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CategoryMenuPage;

public class TestCategoryMenu extends TestBase {
    CategoryMenuPage categoryMenuPage;

    public TestCategoryMenu() {
        super();
        this.categoryMenuPage = new CategoryMenuPage(chromeDriver);
    }

    @Test
    public void openSubcategoryMenu() {
        this.categoryMenuPage.hoverOverElement(6);
        this.categoryMenuPage.clickToSubmenuCategory(6, 3);
        Assert.assertEquals(chromeDriver.getTitle(), "Pre-Shave & Shaving");
    }

}
