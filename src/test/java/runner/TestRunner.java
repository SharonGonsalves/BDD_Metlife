package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(tags = "@regression and not @auto and not @data-driven", features = "src/test/java/featues", glue = {
		"base", "steps" }, monochrome = true, dryRun = false, plugin = { "html:target/index.html" })

public class TestRunner {

}
