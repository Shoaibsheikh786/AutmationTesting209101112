package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bg {
	@Given("user open chrome Browser")
	public void user_open_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User opens Chrome Browser");
	}

	@Given("user navigate the url ecom")
	public void user_navigate_the_url_ecom() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User navigate the url ecom.com");
	}

	@When("user click on serach field")
	public void user_click_on_serach_field() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click on Serach Filed");
	}

	@When("user provided input as flower")
	public void user_provided_input_as_flower() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user provides input as flower");
	}

	@When("user click on serach btn")
	public void user_click_on_serach_btn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user clicks on serach btn");
	}

	@Then("user can see the flower list")
	public void user_can_see_the_flower_list() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user can see the flower list");
	}

	@When("user provided input as mobile")
	public void user_provided_input_as_mobile() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user searchs with voice command")
	public void user_searchs_with_voice_command() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user seraches with voice command ");
	}

	@Then("user can see the mobile list")
	public void user_can_see_the_mobile_list() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("user can see the mobile list ");
	}

}
