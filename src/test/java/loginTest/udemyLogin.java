package loginTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
public class udemyLogin {
	WebDriver driver;
  @Test
  public void login() {
	  driver.get("https://www.udemy.com/");
	  driver.findElement(By.linkText("Log in")).click();
	 }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	  
  }
  @AfterTest
  public void afterTest()throws Exception {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
