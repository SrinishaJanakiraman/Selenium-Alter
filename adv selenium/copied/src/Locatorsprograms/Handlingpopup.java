package Locatorsprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpopup {



	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(14000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement swagger = driver.findElement(By.xpath("//a[text()='Swagger documentation']"));
	Thread.sleep(4000);

	js.executeScript("arguments[0].scrollIntoView();",swagger);
	
	swagger.click();
	
 Alert a1 = driver.switchTo().alert();
	a1.accept();
	Thread.sleep(8000);
	a1.sendKeys("sup@gmail.com");
	a1.accept();
	Thread.sleep(2000);
	a1.sendKeys("sup123");
	a1.accept();
	Thread.sleep(1000);
	a1.accept();
	driver.close();
	
	
	
	}

}
