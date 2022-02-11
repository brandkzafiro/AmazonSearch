package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import pages.AmazonSearchPage;

public class AmazonSearchStep {

    AmazonSearchPage amazon = new AmazonSearchPage(Hook.driver);

    @Given("^the user navigate to www.amazon.com$")
    public void navigateToAmazon(){
        amazon.navigateToAmazon();
    }

    @And("^searches for (.+)$")
    public void enterText(String text){
        amazon.enterSearchText(text);
        amazon.clickSearch();
    }

    @And("^navigate to the second page$")
    public void navigateToTheSecondPage(){
        amazon.goToPage("2");
    }

    @And("^selects the third item$")
    public void selectThirdItem(){
        amazon.pickThirdItem();
    }

    @Then("^the user is able to add it to the cart$")
    public void itemCanBeAddedToTheCart() {
        amazon.addtoCart();
        Assert.assertEquals("Agregado al carrito", amazon.addedToCartMessage());
    }
}
