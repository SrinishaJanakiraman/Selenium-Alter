package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoappsqspider {

	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Supreetha");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("s4supritha.gowda@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(5000);
	
		driver.quit();
		
		

	}

}
