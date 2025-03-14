package applicationHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
  @Before("@reg")
  public void setUp()
  {
	  System.out.println("################");     //driver =new ChromeDriver
	  System.out.println("#################");   //driver.get(url);
  }
  
  @After()
  public void tearDown(Scenario sce)
  {
	  System.out.println("CLOSE THE BROWSER");   //driver.close();
	  String str=sce.getName();
	  System.out.println("Scenario "+str);
	  System.out.println(sce.getStatus());
  }
  
  
  
//  @BeforeStep
//  public void bfStep()
//  {
//	  System.out.println("TAKE SCREENSHOT FOR EACH STEP");
//  }
//  @AfterStep
//  public void afterStep()
//  {
//	  System.out.println("This is after step");
//  }

}
