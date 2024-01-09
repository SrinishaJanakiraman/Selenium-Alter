package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication1 {



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		
	}

}
