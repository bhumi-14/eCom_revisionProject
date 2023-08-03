package eComProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EBay {
  @Test
  public void eBayTest() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("opening eBay", true);
	  driver.get("https://www.ebay.co.uk/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(5000);
	  driver.close();
	  
  }
}
