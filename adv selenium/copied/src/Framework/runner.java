package Framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runner extends baseClass {

	@Test
	public void run() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("hello");
		Thread.sleep(2000);
		
	
	}

}
