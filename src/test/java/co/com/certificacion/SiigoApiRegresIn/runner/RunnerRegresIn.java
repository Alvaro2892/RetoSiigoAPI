package co.com.certificacion.SiigoApiRegresIn.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/createUser.feature",
        glue = {"co.com.certificacion.SiigoApiRegresIn.stepdefinitions","co.com.certificacion.SiigoApiRegresIn.util"},
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerRegresIn
{

}
