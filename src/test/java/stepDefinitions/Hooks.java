package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import static drivers.DriverFactory.cleanUpDriver;
import static drivers.DriverFactory.getDriver;

public class Hooks {

    public WebDriver webDriver;

    @Before
    public void setUp(){
        getDriver();
    }

    @After
    public void tearDown(){
        cleanUpDriver();
    }


}
