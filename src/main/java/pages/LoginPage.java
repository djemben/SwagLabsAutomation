package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Credentials;
import utils.URLs;

public class LoginPage extends BasePage{

    private @FindBy(id = "user-name")
    WebElement usernameTextField;

    private @FindBy(id = "password")
    WebElement passwordField;

    private @FindBy(id = "login-button")
    WebElement loginButton;

    public LoginPage(){
        super();
    }

    public void navigateToLoginPage(){
        navigateToUrl(URLs.LOGIN_PAGE);
    }

    public void typeLogin(String login){
        usernameTextField.sendKeys(Credentials.STANDARD_USER_LOGIN);
    }

    public void typePassword(String password){
        passwordField.sendKeys(Credentials.PASSWORD_CORRECT);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
