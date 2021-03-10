package Work;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Flavourselection extends Base
{
	@Test
    public void Flavourselection() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Thread.sleep(3000);
		
		{
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("window.scrollBy(0,850)");
		
		}
		
		
		driver.findElement(By.xpath("(//ul[@class='slideupdown'])[1]/li/a/span[text()='Cakes']")).click();

		{
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("window.scrollBy(0,450)");
		
		}
		
		 
		 List<WebElement> A3 = driver.findElements(By.xpath("//div[@class='occasion-container flowers-landing']//ul//li//a"));
			
		 for (WebElement PB: A3) {
		 System.out.println(PB.getText());
		 Thread.sleep(2000);
		 if(PB.getText().equals("Chocolate"))
		 
		 {
			 Thread.sleep(2000);

			WebElement POP = driver.findElement(By.xpath("//div[@class='occasion-container flowers-landing']//ul//li//a/span[text()='Chocolate']"));
			System.out.println(POP.getText()+ " is present");
			
	driver.findElement(By.xpath("//div[@class='occasion-container flowers-landing']//ul//li//a/span[text()='Chocolate']")).click();
			
	}
		 
		 }
		 Thread.sleep(3000);
		 
		 
		 
	
}}