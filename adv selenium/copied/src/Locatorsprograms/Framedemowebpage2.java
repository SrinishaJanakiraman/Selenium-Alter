package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemowebpage2 {

	

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		Thread.sleep(1000);
	
		WebElement frame2_text = driver.findElement(By.xpath("//iframe[@title='Parent iframe' and @src='../signup.html']"));
		driver.switchTo().frame(frame2_text);
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("supreetha");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("supreetha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("supreetha");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();

		WebElement frame1_text = driver.findElement(By.xpath("//iframe[@title='Parent iframe' and @src='../login.html']"));
		driver.switchTo().frame(frame1_text);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("supreetha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("supreetha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread.sleep(1000);
		WebElement parentframe = driver.findElement(By.xpath("//iframe[@title='Parent iframe']"));
		driver.switchTo().frame(parentframe);
		WebElement childframe = driver.findElement(By.xpath("//iframe[@src='../signup.html']"));
		driver.switchTo().frame(childframe);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("supreetha");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("supreetha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("supreetha");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(1000);
		
		
		
		
		
}
}

