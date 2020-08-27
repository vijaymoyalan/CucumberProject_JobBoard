package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Vijay\\SIT Folder\\IBM_SDET_Workspace\\Cucumber_Project_SDET\\src\\Features",
    glue = {"stepDefinitions"},
    tags = {"@JBactivity1"},
    //tags = {"@JBactivity1","@JBactivity2","@JBactivity3","@JBactivity4"},
    plugin = { "pretty", "html:src/cucumber-reports/reports" },
    monochrome = true,
    strict = true
)
public class ActivitiesRunner {
    //empty
}