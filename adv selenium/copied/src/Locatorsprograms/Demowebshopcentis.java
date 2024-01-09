package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Demowebshopcentis {

	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.edge.driver","./softwares/MSEdgeDriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input[id='gender-female']")).click(); 
		
		driver.findElement(By.name("FirstName")).sendKeys("Supreetha");
		driver.findElement(By.name("LastName")).sendKeys("Jayaram");
		driver.findElement(By.id("Email")).sendKeys("suprithaum.a6@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234566");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("1234566");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.cssSelector("input[type='button']")).click();
		
		
		
		
		
			}

}
