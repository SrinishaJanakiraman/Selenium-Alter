package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup1 {


	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Mens shoes");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//h4[text()='Men Textured PU Sneakers']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[@class='size-buttons-unified-size'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		Thread.sleep(1000);
		

	}

}
