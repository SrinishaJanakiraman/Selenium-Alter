package Locatorsprograms;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Supreetha");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	
	}

}
