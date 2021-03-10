package Work;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base{
	
	public static WebDriver driver;
    public static String baseUrl ="https://www.floweraura.com/";

    
    @BeforeSuite
	public void setup() {
		
				
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/resource1/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			

			
	}
	
  @AfterSuite
      public void Logout() throws InterruptedException
      {
              driver.quit();  
      }

}