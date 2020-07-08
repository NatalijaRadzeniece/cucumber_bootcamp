package runnerTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//RunWith - tells to JUnit to run this class as Cucumber test
@RunWith(Cucumber.class)
// CucumberOptions - provides important information.
@CucumberOptions(
        // feature word - provides location of feature file
        features = "src\\test\\resources",
        // glue word = provides path to steps definitions class
        glue = "stepDefinitions"
        , tags = "@input"
        // "@regression" - will run only tests with this tag
        // "@regression and @sanity" - run test which have tags as @regression and @sanity
        // "@regression and not @sanity" - run test which have tags as @regression and NOT @sanity
        // "@regression or @sanity"  - run test or @regression or @sanity

)
public class CucumberRunnerTest {
}
