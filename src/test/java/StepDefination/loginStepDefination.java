package StepDefination;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import AllPages.LoginPage;
import GenericMethods.FewMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefination extends LoginPage {
	FewMethods obj = new FewMethods();

	
	@Given("User is on login page")
	public void user_is_on_login_page() throws IOException {
		BrowserLaunch();
		//FewMethods obj = new FewMethods();
		ExtentCucumberAdapter.addTestStepLog("Browser is launched");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(FewMethods.TakeScreen());
	}

	@When("User enters right username {string}")
	public void user_enters_right_username(String username) throws IOException {
		Enter_Email(username);
		ExtentCucumberAdapter.addTestStepLog("User entered username details successfully" +username);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(FewMethods.TakeScreen());

	}

	@And("User enters the password {string}")
	public void user_enters_the_password(String password) throws IOException {
		Enter_Pwd(password);
		ExtentCucumberAdapter.addTestStepLog("User entered password details successfully" +password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(FewMethods.TakeScreen());


	}

	@And("Clicks on submit")
	public void clicks_on_submit() throws IOException {
		LoginIn();
		ExtentCucumberAdapter.addTestStepLog("User clicked login button");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(FewMethods.TakeScreen());


	}

	@Then("User should be on home page")
	public void user_should_be_on_home_page() {
	    
	}

}
