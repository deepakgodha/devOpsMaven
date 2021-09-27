package loginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class NewTest {
	@Test(description="valid test")
	  public void validDataCheck() {
		  App ap=new App();
		  boolean status=ap.userLogin("userDemo", "password");
		  Assert.assertTrue(status);
		  
	  }
	@Test(description="invalid test")
	  public void invalidDataCheck() {
		  App ap=new App();
		  boolean status=ap.userLogin("userDemo", "password123");
		  Assert.assertFalse(status);
		  
	  }
}
