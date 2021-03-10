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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Login extends Base{
	@Test
    public void Login() throws InterruptedException
    {
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	          
      //Login Details
      WebElement UserID =driver.findElement(By.xpath("(//input[@type='email'])[1]"));
      UserID.click();
      UserID.clear();
      UserID.sendKeys("xyz@gmail.com");
      
      driver.findElement(By.xpath("//*[@name='Continue']")).click();
        

        WebElement Pwd =driver.findElement(By.xpath("//*[@id='name-field']"));
        Pwd.click();
        Pwd.clear();
        Pwd.sendKeys("Modi");
        
        
        WebElement Pwd1 =driver.findElement(By.xpath("//*[@id='mobile-field']"));
        Pwd1.click();
        Pwd1.clear();
        Pwd1.sendKeys("9990345267");
        
        driver.findElement(By.xpath("//input[@name='Continue']")).click();
        
        //Delivery Address
        
        Thread.sleep(3000);
        
        WebElement A1 = driver.findElement(By.xpath("//div[@class='heading-inner']/span[1]"));


    	System.out.println(A1.getText());
    	
    	if(A1.getText().equals("Awesome Modi !"))
    	{
    		System.out.println("Login is confirmed");
    	}
    	else {
    		System.out.println("Login is not confirmed");
    	}
        
               
        WebElement FirstName =driver.findElement(By.xpath("//input[@id='name-field']"));
        FirstName.click();
        FirstName.clear();
        FirstName.sendKeys("Modi");
          
        WebElement Address =driver.findElement(By.xpath("//*[@id='address-field']"));
        Address.click();
        Address.clear();
        Address.sendKeys("GOA");
        
        WebElement Pincode =driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
        Pincode.click();
        Pincode.clear();
        Pincode.sendKeys("110006");
        Thread.sleep(2000);
        
        WebElement Phone =driver.findElement(By.xpath("//input[@id='phone-field']"));
        Phone.click();
        Phone.clear();
        Phone.sendKeys("9990345267");

        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        
        
        
        
        //Delivery Date & Time
        
        WebElement A2 = driver.findElement(By.xpath("//div[@class='heading-inner']//span[1]"));


    	System.out.println(A2.getText());
    	
    	if(A2.getText().equals("Great Going !"))
    	{
    		System.out.println("Now Choose Delivery Date & Time");
    	}
    	else {
    		System.out.println("Failed to move ahead");
    	}
    	
        Thread.sleep(2000);

        
        driver.findElement(By.xpath("//div[@class='del-date-inner']//ul//li[2]")).click();
        
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='styles_modal__gNwvD']//input[@value='Standard Delivery']")).click();
        
        driver.findElement(By.xpath("(//div[@class='styles_modal__gNwvD']//ul//li)[2]//input[@type='radio']")).click();
        
        
        
        
        driver.findElement(By.xpath("//input[@name='Continue']")).click();

        
        
        //Special Note
        
        WebElement A3 = driver.findElement(By.xpath("//div[@class='heading-inner']//span[1]"));


    	System.out.println(A3.getText());
    	
    	if(A3.getText().equals("Show extra affection ! "))
    	{
    		System.out.println("Pen down your thoughts.");
    	}
    	else {
    		System.out.println("Failed to move ahead");
    	}
    	
        Thread.sleep(2000);

        
        driver.findElement(By.xpath("//div[@class='choose-note']//ul//li[text()='Birthday'][1]")).click();
        
        driver.findElement(By.xpath("//div[@class='btn-wrap']//input[@name='Review'][1]")).click();
        
        
        
        
        //order summary
        
        
        driver.findElement(By.xpath("//input[@name='Proceed to payment'][1]")).click();
        
        
        Thread.sleep(3000);
        
        //payment method
        
        
        driver.findElement(By.xpath("(//div[@class='vertical-tabs clearfix']//ul[1]//li//span//i[@class='ps card'])[1]")).click();
        
        //card details
       
        WebElement Card =  driver.findElement(By.id("//input[@id='card_number']"));
        Card.click();
        Card.clear();
        Card.sendKeys("4539393950884198");
        Thread.sleep(3000);
        
        WebElement CardName =  driver.findElement(By.id("//input[@id='name_on_card']"));
        CardName.click();
        CardName.clear();
        CardName.sendKeys("TESTING");
        Thread.sleep(1000);

        WebElement Month =  driver.findElement(By.id("//input[@id='card_exp_month']"));
        Month.click();
        Month.clear();
        Month.sendKeys("02");
        Thread.sleep(1000);
        

        WebElement year =  driver.findElement(By.id("//input[@id='card_exp_month']"));
        year.click();
        year.clear();
        year.sendKeys("47");
        Thread.sleep(1000);
        

        WebElement CVV =  driver.findElement(By.id("//input[@id='security_code']"));
        CVV.click();
        CVV.clear();
        CVV.sendKeys("111");
        Thread.sleep(1000);
        
        driver.findElement(By.id("//input[@id='edit-submit']")).click();
        
        Thread.sleep(2000);
        
        //payUbiz
        
        driver.findElement(By.xpath("//button[@class='btn btn-continue']")).click();
        
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//small[text()='Back']")).click();
        
        driver.findElement(By.xpath("//small[text()='Back']")).click();
        Thread.sleep(2000);

        
       System.out.println(driver.switchTo().alert().getText());    
       Thread.sleep(2000);

        driver.switchTo().alert().dismiss();  
        
        //Authentification
        
        
        WebElement Auth = driver.findElement(By.xpath("//div[@class='messages status']//div[@class='status-icon'][1]"));


    	System.out.println(Auth.getText());
      

    }
}