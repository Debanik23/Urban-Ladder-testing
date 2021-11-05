package feature;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="C:\\Users\\91877\\Desktop\\JAVA-T\\Cucumber\\src\\main\\java\\feature\\Urban.feature",
    glue= {"setpdef"}
)

public class Urbanrunner {


}
