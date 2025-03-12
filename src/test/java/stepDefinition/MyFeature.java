package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFeature {
	
	@Given("this is step1")
	public void this_is_step1() {
		
		System.out.println("$$$$$$$$$$$$$$$$$This is Step1 $$$$$$$$$$$$$$$$$$$$$$$$");
	}

	@When("this is step2")
	public void this_is_step2() {
		System.out.println("$$$$$$$$$$$$$$$$$This is Step 2 $$$$$$$$$$$$$$$$$$$$$$$$");
	}

	@Then("this is step3")
	public void this_is_step3() {
		System.out.println("$$$$$$$$$$$$$$$$$This is Step 3 $$$$$$$$$$$$$$$$$$$$$$$$");
	}
	
	
	
	@Given("open mybrowser")
	public void open_mybrowser() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("This is mybrwose code");
	}

	@Given("enter url")
	public void enter_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is mybrwose code with url ");
	}

	@When("user enter username abc")
	public void user_enter_username_abc() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is mybrwose code username");
	}

	@When("user enters password xyz")
	public void user_enters_password_xyz() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is mybrwose code password");
	}



}
