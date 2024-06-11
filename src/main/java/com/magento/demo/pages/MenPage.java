package com.magento.demo.pages;


import com.magento.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    //Locator
    By cronusYogaPants = By.xpath("//a[normalize-space()='Cronus Yoga Pant']/parent::strong/parent::div");
    By size32 = By.id("option-label-size-143-item-175");
    By colourBlack = By.id("option-label-color-93-item-49");
    By addToCartButton = By.xpath("//span[text()='Add to Cart']");
    By addedShoppingCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.linkText("shopping cart");
    By shoppingCartText = By.xpath("//span[@class='base']");
    By cronusYogaPantsText = By.partialLinkText("Cronus Yoga");
    By sizeText32 = By.xpath("//dd[contains(text(),'32')]");
    By blackColourText = By.xpath("//dd[contains(text(),'Black')]");

    public void mouseHoverOnCronusYogaPants() {
        mouseHoverToElement(cronusYogaPants);
    }

    public void selectSize32() {
        clickOnElement(size32);
    }

    public void selectColourBlack() {
        clickOnElement(colourBlack);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String shoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    public String cronusYogaPantText() {
        return getTextFromElement(cronusYogaPantsText);
    }

    public String size32Text() {
        return getTextFromElement(sizeText32);
    }

    public String addToShoppingCartText() {
        return getTextFromElement(addedShoppingCartText);
    }

    public String colourBlackText() {
        return getTextFromElement(blackColourText);
    }

}
