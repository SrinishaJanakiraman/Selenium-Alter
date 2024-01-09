package testng_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
@Test
public void check() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com");
	Thread.sleep(1000);
	String title = driver.getTitle();
   Assert.assertEquals(title,"OrangeHRM");
   Thread.sleep(1000);
   driver.findElement(By.name("username")).sendKeys("Admin");
   Thread.sleep(1000);
   driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
}
}
