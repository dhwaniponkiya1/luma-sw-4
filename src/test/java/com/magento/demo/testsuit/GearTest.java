package com.magento.demo.testsuit;

import com.magento.demo.pages.GearPage;
import com.magento.demo.pages.HomePage;
import com.magento.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBagsLink();
        gearPage.clickOnOvernightDuffle();
        String expectedText = "Overnight Duffle";
        String actualText = gearPage.getOverNightDuffleText();
        Assert.assertEquals(actualText, expectedText);
        gearPage.changeQtyTo3();
        gearPage.clickOnAddToCartButton();
        expectedText = "You added Overnight Duffle to your shopping cart.";
        actualText = gearPage.getAddToShoppingCartText();
        Assert.assertEquals(actualText, expectedText);
        gearPage.clickOnShoppingCartLink();
        expectedText = "Overnight Duffle";
        actualText = gearPage.getOverNightDufText();
        Assert.assertEquals(actualText, expectedText);
        expectedText = "3";
        actualText = gearPage.getAttributeForQty3();
        Assert.assertEquals(actualText, expectedText);
        expectedText = "$135.00";
        actualText = gearPage.getProductPrice();
        Assert.assertEquals(actualText, expectedText);
        gearPage.changeQtyTo5();
        gearPage.clickOnUpdateShoppingCartButton();
        expectedText = "$225.00";
        actualText = gearPage.getUpdatedPrice();
        Assert.assertEquals(actualText, expectedText);
    }

}
