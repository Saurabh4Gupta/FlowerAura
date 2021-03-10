package Work;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;


//import org.junit.Test;
import org.openqa.selenium.By;

public class Logout extends Base{
	@Test
    public void Logout1() throws InterruptedException
    {
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.xpath("(//div[@class='accounts header-icon']//li)[3]")).click();
    Thread.sleep(2000);

	driver.findElement(By.xpath("//a[@title='Logout'][1]")).click();
	
	       
       
    }
}