package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlllocatorsShaadi {


		
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.edge.driver","./softwares/MSedgeDriver.exe");
			EdgeDriver driver=new EdgeDriver();
			driver.get("https://www.Shaadi.com/");
			Thread.sleep(1000);
			driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();

		}

		

}
