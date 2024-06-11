package com.magento.demo.pages;

import com.magento.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    //Locator
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By overNightDuffleText = By.xpath("//span[@class='base']");
    By qty = By.id("qty");
    By addToCartButton = By.id("product-addtocart-button");
    By addedShoppingCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.linkText("shopping cart");
    By overnightDufText = By.partialLinkText("Overnight Duf");
    By qty3Text = By.xpath("//input[@class='input-text qty']");
    By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By qtyBox = By.xpath("//input[@class='input-text qty']");
    By updatedShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By updatedPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");

    public void clickOnOvernightDuffle() {
        clickOnElement(overnightDuffle);
    }

    public String getOverNightDuffleText() {
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQtyTo3() {
        driver.findElement(qty).clear();
        sendTextToElement(qty, "3");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getAddToShoppingCartText() {
        return getTextFromElement(addedShoppingCartText);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    public String getOverNightDufText() {
        return getTextFromElement(overnightDufText);
    }

    public String getAttributeForQty3() {
        return driver.findElement(qty3Text).getAttribute("value");
    }

    public String getProductPrice() {
        return getTextFromElement(productPrice);
    }

    public void changeQtyTo5() {
        driver.findElement(qtyBox).clear();
        sendTextToElement(qtyBox, "5");
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(updatedShoppingCart);
    }

    public String getUpdatedPrice() {
        return getTextFromElement(updatedPrice);
    }
}
