package automation.cucumber_tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;


// for JUnit use:
//@RunWith(Cucumber.class)

@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        features = {"src/main/java/automation/cucumber_tests/features/google-search.feature"}
)

public class RunGoogleTest extends AbstractTestNGCucumberTests {
    // For running via TestNG
}