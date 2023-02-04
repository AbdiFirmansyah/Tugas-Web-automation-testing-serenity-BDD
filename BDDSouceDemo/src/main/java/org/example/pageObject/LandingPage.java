package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {

    public static WebDriver webDriver;

    public LandingPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    //    DEKLARASI ELEMENT
    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyLanding;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selecCountainer;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basket1;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basket2;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    private WebElement iconCart;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeCart;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement iconCheckout;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueCart;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement item_total;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement total;

    @FindBy(id = "//button[@id='finish']")
    private WebElement btnFinish;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishCart;


    public void sortProduct(String sort) {
        Select a = new Select(selecCountainer);
        a.selectByVisibleText(sort);
    }

    public boolean verifyLandigPage() {
        verifyLanding.isDisplayed();
        return true;
    }

    public void clickBasket1() {
        basket1.click();
    }

    public void clickBasket2() {
        basket2.click();
    }

    public void clickCart() {
        iconCart.click();
    }
    public void clickRemoveCart() {
        removeCart.click();
    }
    public void clickCheckout() {
        iconCheckout.click();
    }
    public void setFirstName(String user) {
        firstName.sendKeys(user);
    }
    public void setLastName(String user) {
        lastName.sendKeys(user);
    }
    public void setPostalCode(String user) {
        postalCode.sendKeys(user);
    }
    public void clickContinueCart() {
        continueCart.click();
    }

//    STEP CHECK OUT
    public Float Tax() {
        String strTax = tax.getText();
        String potongString = strTax.substring(6);
        Float floatTax = Float.parseFloat(potongString);
        return floatTax;
    }
    public Float itemTotal() {
        String strItemTotal = item_total.getText();
        String potongString = strItemTotal.substring(13);
        Float floatItemTotal = Float.parseFloat(potongString);
        return floatItemTotal;
    }
    public Float Jumlah() {
        return itemTotal() + Tax();
    }
    public Float Total() {
        String strTotal = total.getText();
        String potongString = strTotal.substring(8);
        Float floatTotal = Float.parseFloat(potongString);
        return floatTotal;
    }
    public void clickFinishCart(){
        finishCart.click();
    }
}







