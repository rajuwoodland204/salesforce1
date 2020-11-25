package salesforcepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01 {
  @Test
  public void f()
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Seleniumautomation\\browserdrivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://login.salesforce.com/");
	  driver.findElement(By.name("username")).sendKeys("Raju@dfhdfh.com");
	  driver.findElement(By.id("password")).sendKeys("dhdguhie");
	  driver.findElement(By.id("Login")).click();
	  driver.close();
  }
}
