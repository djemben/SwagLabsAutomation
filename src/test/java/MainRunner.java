import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/features"},
        glue = {"stepDefinitions"},
        tags = "@cart",
        plugin = {"pretty"}
)

public class MainRunner extends AbstractTestNGCucumberTests {


}
