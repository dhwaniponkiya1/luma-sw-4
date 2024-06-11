package com.magento.demo.testsuit;


import com.magento.demo.pages.HomePage;
import com.magento.demo.pages.MenPage;
import com.magento.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        homePage.mouseHoverOnmenMenu();
        homePage.mouseHoverOnBottomMenu();
        homePage.clickOnPantsLink();
        menPage.mouseHoverOnCronusYogaPants();
        menPage.selectSize32();
        menPage.mouseHoverOnCronusYogaPants();
        menPage.selectColourBlack();
        menPage.mouseHoverOnCronusYogaPants();
        menPage.clickOnAddToCartButton();
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menPage.addToShoppingCartText();
        Assert.assertEquals(actualText, expectedText);
        menPage.clickOnShoppingCartLink();
        expectedText = "Shopping Cart";
        actualText = menPage.shoppingCartText();
        Assert.assertEquals(actualText, expectedText);
        expectedText = "Cronus Yoga Pant";
        actualText = menPage.cronusYogaPantText();
        Assert.assertEquals(actualText, expectedText);
        expectedText = "32";
        actualText = menPage.size32Text();
        Assert.assertEquals(actualText, expectedText);
        Assert.assertEquals("32", getTextFromElement(By.xpath("//dd[contains(text(),'32')]")));
        expectedText = "Black";
        actualText = menPage.colourBlackText();
        Assert.assertEquals(actualText, expectedText);
    }

}
