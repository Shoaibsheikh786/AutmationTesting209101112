package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
   
	WebDriver driver;
	
	@Given("open the chrome")
	public void openChrome()
	{
		driver=new ChromeDriver();
	}
	
	@And("enter the url practice.expandtesting.comlogin")
	public void enterUrl()
	{
		driver.get("https://practice.expandtesting.com/login");
	}
	@When("user enters username as practice")
	public void user_enters_username_as_practice() {
		
		driver.findElement(By.id("username")).sendKeys("practice");
	}

	@When("user enters password as SuperSecretPassword!")
	public void user_enters_password_as_super_secret_password() {
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Then("user will be navigated to logout page")
	public void user_will_be_navigated_to_logout_page() {
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, "Secure Page page for Automation Testing Practice");
		
	}
   @Then("user closes the browser")
   public void closeBrowser()
   {
	   driver.close();
   }

}
