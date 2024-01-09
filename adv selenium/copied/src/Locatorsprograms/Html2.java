package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/comp/Desktop/Selenium%20html%20store/Dummypage2.html");
		driver.findElement(By.tagName("input")).sendKeys("Hello");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("world");
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
