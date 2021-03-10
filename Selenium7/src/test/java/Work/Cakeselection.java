package Work;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Cakeselection extends Base
{
	@Test
    public void Cakeselection() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Thread.sleep(3000);
		
		{
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("window.scrollBy(0,450)");
		
		}
		
		
		driver.findElement(By.xpath("(//a[text()='Artistic Chocolate Pleasure'])[1]")).click();
		Thread.sleep(5000);

		{
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("window.scrollBy(0,450)");
		
		}
		
		
		
		driver.findElement(By.xpath("(//ul[@id='edit-product-attribute-10']/li)[2]")).click();
		
		WebElement Message = driver.findElement(By.xpath("(//*[@id='edit-product-attribute-16'])[1]"));
		
		Message.click();
		
		Thread.sleep(3000);
		
		Message.sendKeys("Happy Womens Day");
		
		
		driver.findElement(By.xpath("//a[text()='BUY NOW']")).click();
		Thread.sleep(3000);
		
        WebElement text = driver.findElement(By.xpath("//*[text()='Skip']"));
        text.click();
        Thread.sleep(3000);
   
        driver.findElement(By.xpath("//input[@value='Place order']")).click();       
        
           
	
}}