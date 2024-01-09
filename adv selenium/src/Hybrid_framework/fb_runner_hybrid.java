package Hybrid_framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class fb_runner_hybrid extends base_class{

	@Test
	public void run() throws InterruptedException {
	    
	    driver.findElement(By.id("email")).sendKeys("srinisha");
	    Thread.sleep(1000);
	    driver.findElement(By.id("pass")).sendKeys("srii");
	    Thread.sleep(1000);
	    driver.findElement(By.name("login")).click();
	    

	    
	    
	}
}
