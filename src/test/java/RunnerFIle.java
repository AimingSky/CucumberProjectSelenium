import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "resources"
		,glue={"Step"}
		)

public class RunnerFIle extends AbstractTestNGCucumberTests {
}