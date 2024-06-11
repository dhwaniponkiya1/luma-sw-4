package com.magento.demo.testsuit;


import com.magento.demo.pages.HomePage;
import com.magento.demo.pages.WomenPage;
import com.magento.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOntopMenu();
        homePage.clickOnJacketLink();
        List<String> actualText = womenPage.storeProductNamesInAscendingOrder();
        womenPage.selectFilterSortByNames();
        Thread.sleep(2000);
        List<String> expextedText = womenPage.storeProductNamesAfterFilterName();
        Assert.assertEquals(actualText, expextedText);
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOntopMenu();
        homePage.clickOnJacketLink();
        List<Double> actualText = womenPage.storeProductsNamesByPriceinAscendingOrder();
        womenPage.selectFilterSortByPriceLowToHigh();
        Thread.sleep(2000);
        List<Double> expextedText = womenPage.storeProductsNamesByPriceAfterFilterPriceLowToHigh();
        Assert.assertEquals(actualText, expextedText);
    }
}
