package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(1000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("document.getElementById('name').value='random text'");
Thread.sleep(1000);
js.executeScript("document.getElementById('name'),value=''");
Thread.sleep(1000);
js.executeScript("document.getElementById('email').value='random text'");
Thread.sleep(1000);
js.executeScript("document.getElementById('email'),value=''");
Thread.sleep(1000);
driver.quit();
js.executeScript("document.getElementById('password').value='random text'");
Thread.sleep(1000);
js.executeScript("document.getElementById('password'),value=''");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
Thread.sleep(1000);
driver.quit();

	}
}
