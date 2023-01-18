package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(strict = true,
        glue = {"stepdefinitions"},
        features = {"src/test/resources/feature/netflix.feature"},
        tags = "@test",
        plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"}

)

public class NetflixRunTestSite {
}
