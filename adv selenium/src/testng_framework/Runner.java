package testng_framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner extends baseclass
{
@Test
public void run() throws InterruptedException
{
	driver.findElement(By.id("pass")).sendKeys("hello");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("hello");
	Thread.sleep(1000);
}
}
