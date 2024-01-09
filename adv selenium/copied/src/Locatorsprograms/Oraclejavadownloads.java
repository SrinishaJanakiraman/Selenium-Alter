package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oraclejavadownloads {


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 driver.findElement(By.xpath("//strong[text()='The Oracle JDK 8 license changed in April 2019']")).click();
		 js.executeScript("arguments[0].ScrollIntoView();","License");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@id='rt01tab6-java8-windows']")).click();
		 Thread.sleep(1000);
	}
}
