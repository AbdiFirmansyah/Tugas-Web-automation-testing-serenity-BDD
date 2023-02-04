package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.naming.Name;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @Then("User already on landing page")
    public void verifyLandingPage() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.verifyLandigPage());
        Thread.sleep(3000);
    }

    @Then("User Product list by \"(.*)\"")
    public void sortProductValue(String sort) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.sortProduct(sort);
        Thread.sleep(3000);

    }

    @And("User choice 2 product from the list")
    public void choiceProduct() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickBasket1();
        landingPage.clickBasket2();
        Thread.sleep(4000);
    }

    @And("User click Cart")
    public void iconCart() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickCart();
        Thread.sleep(4000);
    }

    @And("User remove T-Shirt Red")
    public void removeCart() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickRemoveCart();
        Thread.sleep(4000);

    }

    @And("User Click Check Out")
    public void Checkout() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickCheckout();
        Thread.sleep(4000);
    }

    @And("User input First Name \"(.*)\" and LastName \"(.*)\" and postal code \"(.*)\"")
    public void checkOutInformation(String firstName, String lastName, String postalCode) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setFirstName(firstName);
        landingPage.setLastName(lastName);
        landingPage.setPostalCode(postalCode);
        Thread.sleep(6000);
    }

    @And("User click Continue")
    public void continueCart() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickContinueCart();
        Thread.sleep(4000);
    }
//     STEP CHECK OUT
    @Then("Total must be match between expect and actual")
    public void verifyLanding() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Float expektasiTotal = landingPage.Jumlah(); // manggil funcion penjumlahan pajak + itemtotal
        Float totalSeharusnya = landingPage.Total(); // manggil funcion total seharusnya
        Assert.assertEquals(expektasiTotal, totalSeharusnya);
        Thread.sleep(5000);
    }

    @Then("User click Finish and landing to page THANK YOU FOR YOUR ORDER")
    public void finishCart() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickFinishCart();
        Thread.sleep(5000);
    }

}


