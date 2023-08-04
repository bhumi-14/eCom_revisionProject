package eComProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void meeshoTest() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  Reporter.log("Opening Meesho", true);
	  driver.get("https://www.meesho.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(2000);
	  driver.close();
  }
}
