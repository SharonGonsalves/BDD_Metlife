package steps;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reporting.Logs;

public class AutoSteps extends BaseClass {

	@Given("user nevigate to homepage")
	public void user_nevigate_to_homepage() {
		Logs.log("Before hook");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		homePage.logInButtonStep();
	}

	@When("user select business account")
	public void user_select_business_account() {
		accountPage.selectAccount();
	}

	@When("user select metlink option")
	public void user_select_metlink_option() {
		accountPage.accountOption();
	}

	@When("user click on the login1 button")
	public void user_click_on_the_login1_button() {
		accountPage.logInBtn();
	}

	@When("continue overlay handled")
	public void continue_overlay_handled() {
		homePage.handleContinueOverlay();
	}

	@When("speed up page handled")
	public void speed_up_page_handled() {
		AutoSteps.handleSpeedUpPage1();

	}

	private static void handleSpeedUpPage1() {

	}

	@When("user enters username")
	public void user_enters_username() {
		logInPage.inputUserName("sharon");
	}

	@Then("user enter password")
	public void user_enter_password() {
		logInPage.inputPass("1234");
	}

	@Then("user click on login2 button")
	public void user_click_on_login2_button() {
		logInPage.logIN();
	}

	@Then("displays invalid credentials")
	public void displays_invalid_credentials() {
		Logs.log("credentials is not valid");
	}

	@When("ontinue overlay handled")
	public void ontinue_overlay_handled() {

	}

	@When("homepage steps done <accountOption>")
	public void homepage_steps_done_account_option() {

	}

	@Then("AutoSteps page is done")
	public void auto_steps_page_is_done() {

	}

	@When("homepage steps done")
	public void homepage_steps_done() {

	}

	@When("selectAccount steps done with <{string}>")
	public void select_account_steps_done_with(String string) {
	}

	@When("HomePage")
	public void home_page() {

	}

	@When("Input logIN")
	public void input_log_in() {
	}

	@Then("AutoSteps page done")
	public void auto_steps_page_done() {

	}

}
