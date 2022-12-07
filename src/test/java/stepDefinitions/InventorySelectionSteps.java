package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InventoryPage;
import utils.Credentials;

public class InventorySelectionSteps {

    private final InventoryPage inventoryPage;

    public InventorySelectionSteps(InventoryPage inventoryPage) {
        this.inventoryPage = inventoryPage;
    }

    @Given("Given User logged in")
    public void given_user_logged_in() {
        inventoryPage.logIn(Credentials.STANDARD_USER);
    }

    @When("User add one item to cart")
    public void user_add_one_item_to_cart() {
        inventoryPage.addToCartOrRemoveRandomItem();
    }

    @When("User add two items to cart")
    public void user_add_two_items_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("Cart icon shows number of added items")
    public void cartIconShowsNumberOfAddedItems() {

    }

    @Then("Cart contains selected items")
    public void cart_contains_selected_items() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
