package eComProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OpenCart {
  @Test
  public void openCart() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  Reporter.log("Opening openCart", true);
	  driver.get("https://www.opencart.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(5000);
	  driver.close();
  }
}
