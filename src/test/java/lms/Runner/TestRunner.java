package lms.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
			/*plugin = {"pretty", "html:target/LMS.html",
					"json:target/LMS.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
					}, //reporting purpose*/
			monochrome=false,  //console output color
			features = {"src/test/resources/features/UserLogin.feature",
					"src/test/resources/features/UserModule.feature"
					
					}, //location of feature files		

			glue= {"lms.StepDefinitions","Hooks"} //location of step definition files
		)
public class TestRunner {
	

}
