package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenTest {
	
	@Given("user open the chrome Browser")
	public void user_open_the_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
    System.out.println("CHROME BROWSER OPENED");
	
	}

	@Given("user navigated to the url")
	public void user_navigated_to_the_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("FACEBOOK.COM");
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String user) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("USERNAME "+user);
	}

	@When("user enters passwrod as {string}")
	public void user_enters_passwrod_as(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("PASSWORD "+pass);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("LOGIN ");
	}

	@Then("user can see the home page")
	public void user_can_see_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("USER IS ON HOME PAGE");
	}



}
