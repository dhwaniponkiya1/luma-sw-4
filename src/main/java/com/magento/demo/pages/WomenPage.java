package com.magento.demo.pages;

import com.magento.demo.utilities.Utility;
import org.openqa.selenium.By;

import java.util.List;

public class WomenPage extends Utility {
    //Locator
    By productNames = By.xpath("//strong[@class='product name product-item-name']//a");
    By selectFilter = By.id("sorter");
    By productPrice = By.xpath("//span[@class='price-wrapper ']//span[@class='price']");

    public List<String> storeProductNamesInAscendingOrder() {
        return storeProductNamesIntoArrayList(productNames);
    }

    public void selectFilterSortByNames() {
        selectByValueFromDropDown(selectFilter, "name");
    }

    public List<String> storeProductNamesAfterFilterName() {
        return afterFilterProductNames(productNames);
    }

    public List<Double> storeProductsNamesByPriceinAscendingOrder() {
        return storeAndSortProductsByPriceInAscendingOrder(productPrice);
    }

    public void selectFilterSortByPriceLowToHigh() {
        selectByValueFromDropDown(selectFilter, "price");
    }

    public List<Double> storeProductsNamesByPriceAfterFilterPriceLowToHigh() {
        return storeAndSortProductsByPriceInAscendingOrder(productPrice);
    }
}
