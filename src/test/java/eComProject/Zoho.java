package eComProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Zoho {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("opening Zoho", true);
	  driver.get("https://www.zoho.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(5000);
	  driver.close();
  }
}
