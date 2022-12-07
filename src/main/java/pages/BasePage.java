package pages;

import drivers.DriverFactory;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.URLs;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver(){
        return DriverFactory.getDriver();
    }

    public void navigateToUrl(String url){
        getDriver().get(url);
    }

    public boolean checkIfUrlIsCorrect(String url){
        return getDriver().getCurrentUrl().equals(url);
    }

    public InventoryPage logIn(UsernameAndPassword usernameAndPassword){
        getDriver().get(URLs.LOGIN_PAGE);
        LoginPage loginPage = new LoginPage();
        loginPage.typeLogin(usernameAndPassword.username());
        loginPage.typePassword(usernameAndPassword.password());
        loginPage.clickLoginButton();
        return new InventoryPage();
    }
}
