package Locatorsprograms;
          
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Implicitwaitdemo1 {


	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
	driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
	driver.findElement(By.xpath("//a[text()='With Element']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("5");
	driver.findElement(By.xpath("//button[text()='Start']")).click();	
	WebElement dd=driver.findElement(By.tagName("select"));
	Select sel=new Select(dd);
	sel.selectByVisibleText("Yes");
	
	
	
	}

}
