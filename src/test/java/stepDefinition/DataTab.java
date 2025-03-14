package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTab {
	WebDriver driver;
	
	@Given("open the browser")
	public void open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
        // 
		System.out.println("OPEN BROWSER");
		driver=new ChromeDriver();
	}

	@Given("enter the url {string}")
	public void enter_the_url(String u) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter Url "+u);
		driver.get(u);
	}

	@When("user provider the regstration data")
	public void user_provider_the_regstration_data(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		
		List <List <String>> li=dataTable.asLists();
		String fname=li.get(0).get(0);
		String lastN=li.get(0).get(1);
		String day=li.get(0).get(2);
		String month=li.get(0).get(3);
		//driver.findElement(By.xpath(//input[@id='firstname']).sendKeys(fname);
		
		System.out.println("First_name "+fname);
		System.out.println("Last_name "+lastN);
		System.out.println("Day "+day);
		System.out.println("Month "+month);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		
		
		
		
		
		
	}

	@Then("user can see login page")
	public void user_can_see_login_page() {
		
		System.out.println("USER CAN SEE THE LOGIN PAGE");
	}




}
