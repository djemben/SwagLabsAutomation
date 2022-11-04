package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import utils.URLs;

public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(LoginPage loginPage){
        this.loginPage = loginPage;
    }

    @Given("User access login page")
    public void user_access_login_page() {
        loginPage.navigateToLoginPage();
    }

    @When("User type in username")
    public void user_type_in_username() {
        loginPage.typeLogin("asd");
    }
    @And("User type in password")
    public void user_type_in_password() {
        loginPage.typePassword("qwe");
    }
    @And("User click login button")
    public void user_click_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("User access products page")
    public void user_access_products_page() {
        Assert.assertTrue(loginPage.checkIfUrlIsCorrect(URLs.INVENTORY_PAGE));
    }
}