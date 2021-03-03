package cucu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="regression",plugin="html:outputTrst/co.html ",features="use_cases",glue="cucu")
public class configcucm {

}
