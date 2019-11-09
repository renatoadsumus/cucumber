import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = { "pretty" })
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
// @CucumberOptions(plugin = "json:target/cucumber-report.json")

public class RunCucumberTest {

}
