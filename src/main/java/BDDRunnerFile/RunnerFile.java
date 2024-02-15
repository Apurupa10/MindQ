package BDDRunnerFile;

//import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"Loginpage.feature"},
				 glue = {"StepDefination"},
				 plugin = {"pretty", 
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				 tags = "@login",
				 monochrome = true )

public class RunnerFile extends AbstractTestNGCucumberTests{

}
	


