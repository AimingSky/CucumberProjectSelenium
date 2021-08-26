import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/resources/file.feature"
		,glue={"Step"}
		)

public class RunnerFIle extends AbstractTestNGCucumberTests {
}