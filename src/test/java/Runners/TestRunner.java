package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        monochrome = true,
        glue = "StepDefinitions",
        dryRun = false,
        strict = true,
        plugin = "pretty"
       // tags = "@wip"



)
public class TestRunner {
}
