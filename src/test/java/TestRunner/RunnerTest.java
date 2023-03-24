package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFile"},
		glue= {"StepDefination"},
		dryRun=false
	

		)
			
public class RunnerTest {

}
