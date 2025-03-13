package applicationHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class ApplicationHooks {
	
  @Before()
  public void setUp()
  {
	  System.out.println("Open Chrome");     //driver =new ChromeDriver
	  System.out.println("navigate to ecom.com");   //driver.get(url);
  }
  
  @After()
  public void tearDown()
  {
	  System.out.println("CLOSE THE BROWSER");   //driver.close();
  }
  
  @BeforeStep
  public void bfStep()
  {
	  System.out.println("TAKE SCREENSHOT FOR EACH STEP");
  }
  @AfterStep
  public void afterStep()
  {
	  System.out.println("This is after step");
  }

}
