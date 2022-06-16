package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/java/features"},glue= {"StepDefinition"},monochrome=true,tags= "@Adhoc")
public class Run {

}
