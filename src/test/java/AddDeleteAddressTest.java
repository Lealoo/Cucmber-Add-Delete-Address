import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features",
        plugin = {"pretty", "html:out.html"}
        //To run only one of the scenarios de-comment one of the tags below
        // ,tags = "@addAddress"
        // ,tags = "@deleteAddress"
                )

public class AddDeleteAddressTest {

}
