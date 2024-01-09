package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemoapps
{


	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(1000);
		WebElement web1 = driver.findElement(By.xpath("//iframe[@title='Login Form']"));
		
		driver.switchTo().frame(web1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Supreetha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("supritha@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
	}

}
